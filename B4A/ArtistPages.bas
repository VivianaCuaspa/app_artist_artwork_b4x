B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
   
	Private artistService As ArtistsService
	Private txtId As EditText
	Private txtName As EditText
	Private txtLastName As EditText
	Private txtNationality As EditText
	Private txtBirthDate As EditText
End Sub

Public Sub Initialize As Object
	artistService.Initialize
	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("ArtistPage")
    
End Sub
Private Sub btnRead_Click
	Try
		Wait For (artistService.ReadById(txtId.Text)) Complete (artist As Artist)
    
		If artist.id <> 0 Then
			txtId.Text = artist.id
			txtName.Text = artist.name
			txtLastName.Text = artist.lastName
			txtNationality.Text = artist.nationality
			txtBirthDate.Text = artist.birthDate
        
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
		Wait For (artistService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtName.Text = ""
			txtLastName.Text = ""
			txtNationality.Text = ""
			txtBirthDate.Text = ""
            
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
		Dim artistToUpdate As Artist
        
		artistToUpdate.id = txtId.Text
		artistToUpdate.name = txtName.Text
		artistToUpdate.lastName = txtLastName.Text
		artistToUpdate.nationality = txtNationality.Text
		artistToUpdate.birthDate = txtBirthDate.Text
        
		Wait For (artistService.Update(txtId.Text, artistToUpdate)) Complete (success As Boolean)
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
		Dim artistToCreate As Artist
        
		artistToCreate.name = txtName.Text
		artistToCreate.lastName = txtLastName.Text
		artistToCreate.nationality = txtNationality.Text
		artistToCreate.birthDate = txtBirthDate.Text
        
		Wait For (artistService.Create(artistToCreate)) Complete (artistResult As Artist)
		If artistResult <> Null Then
			txtId.Text = artistResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub
