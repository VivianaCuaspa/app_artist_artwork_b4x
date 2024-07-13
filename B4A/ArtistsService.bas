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
	ApiUrl = "https://appcloudutnweb.azurewebsites.net/api/Artists"
End Sub

Public Sub Create(artist As Artist) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("name": artist.name, "lastName": artist.lastName, "nationality": artist.nationality, "birthDate": artist.birthDate))

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

	artist.id = map.Get("id")
	artist.name = map.Get("name")
	artist.lastName = map.Get("lastName")
	artist.nationality = map.Get("nationality")
	artist.birthDate = map.Get("birthDate")
	Return artist
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim artist As Artist
	artist.Initialize

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

	artist.id = map.Get("id")
	artist.name = map.Get("name")
	artist.lastName = map.Get("lastName")
	artist.nationality = map.Get("nationality")
	artist.birthDate = map.Get("birthDate")

	Return artist
End Sub

Public Sub Update(id As Int, artist As Artist) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("id": artist.id, "name": artist.name, "lastName": artist.lastName, "nationality": artist.nationality, "birthDate": artist.birthDate))

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