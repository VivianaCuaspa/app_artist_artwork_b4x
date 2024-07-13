B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public ApiUrl As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl = "https://appcloudutnweb.azurewebsites.net/api/Artworks"
End Sub
Public Sub Create(artwork As Artwork) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("name": artwork.name, "publicationYear": artwork.publicationYear, "technique": artwork.technique, "description": artwork.description))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	wait for (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	artwork.id = map.Get("id")
	artwork.name = map.Get("name")
	artwork.publicationYear = map.Get("publicationYear")
	artwork.technique = map.Get("technique")
	artwork.description = map.Get("description")

	Return artwork
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim artwork As Artwork
	artwork.Initialize

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Download(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	artwork.id = map.Get("id")
	artwork.name = map.Get("name")
	artwork.publicationYear = map.Get("publicationYear")
	artwork.technique = map.Get("technique")
	artwork.description = map.Get("description")

	Return artwork
End Sub

Public Sub Update(id As Int, artwork As Artwork) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("id": artwork.id, "name": artwork.name, "publicationYear": artwork.publicationYear, "technique": artwork.technique, "description": artwork.description))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	wait for (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Delete(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub