B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
    
	Private artworkService As ArtworksService
	Private txtId As EditText
	Private txtName As EditText
	Private txtPublicationYear As EditText
	Private txtTechnique As EditText
	Private txtDescription As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	artworkService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("ArtworkPage")
    
End Sub

Private Sub btnRead_Click
	Try
		Wait For (artworkService.ReadById(txtId.Text)) Complete (artwork As Artwork)
    
		If artwork.id <> 0 Then
			txtId.Text = artwork.id
			txtName.Text = artwork.name
			txtPublicationYear.Text = artwork.publicationYear
			txtTechnique.Text = artwork.technique
			txtDescription.Text = artwork.description
        
		Else
			Msgbox("No hay datos","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("No hay datos","Error")
	End Try
End Sub

Private Sub btnDelete_Click
	Try
		Wait For (artworkService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtName.Text = ""
			txtPublicationYear.Text = ""
			txtTechnique.Text = ""
			txtDescription.Text = ""
            
			Msgbox("Eliminación Exitosa","Éxito")
		Else
			Msgbox("No se encontró el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

Private Sub btnUpdate_Click
	Try
		Dim artworkToUpdate As Artwork
        
		artworkToUpdate.id = txtId.Text
		artworkToUpdate.name = txtName.Text
		artworkToUpdate.publicationYear = txtPublicationYear.Text
		artworkToUpdate.technique = txtTechnique.Text
		artworkToUpdate.description = txtDescription.Text
        
		Wait For (artworkService.Update(txtId.Text, artworkToUpdate)) Complete (success As Boolean)
		If success Then
			Msgbox("Actualización Exitosa","Éxito")
		Else
			Msgbox("No se encontró el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

Private Sub btnSave_Click
	Try
		Dim artworkToCreate As Artwork
        
		artworkToCreate.name = txtName.Text
		artworkToCreate.publicationYear = txtPublicationYear.Text
		artworkToCreate.technique = txtTechnique.Text
		artworkToCreate.description = txtDescription.Text
        
		Wait For (artworkService.Create(artworkToCreate)) Complete (artworkResult As Artwork)
		If artworkResult <> Null Then
			txtId.Text = artworkResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
