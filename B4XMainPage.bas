B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private artistPage As ArtistPages
	Private artworkPage As ArtworkPages
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnArtistPage_Click
	If artistPage.IsInitialized = False Then
		artistPage.Initialize
		B4XPages.AddPage("Artists", artistPage)
	End If
	
	B4XPages.ShowPage("Artists")
End Sub

Private Sub btnArtworkPage_Click
	If artworkPage.IsInitialized = False Then
		artworkPage.Initialize
		B4XPages.AddPage("Artworks", artworkPage)
	End If
	
	B4XPages.ShowPage("Artworks")
End Sub
