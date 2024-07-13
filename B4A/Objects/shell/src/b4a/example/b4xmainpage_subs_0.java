package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 15;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnartistpage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnArtistPage_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("btnartistpage_click")) { return __ref.runUserSub(false, "b4xmainpage","btnartistpage_click", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Private Sub btnArtistPage_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="If artistPage.IsInitialized = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_artistpage" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 22;BA.debugLine="artistPage.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_artistpage" /*RemoteObject*/ ).runClassMethod (b4a.example.artistpages.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="B4XPages.AddPage(\"Artists\", artistPage)";
Debug.ShouldStop(4194304);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Artists")),(Object)((__ref.getField(false,"_artistpage" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 26;BA.debugLine="B4XPages.ShowPage(\"Artists\")";
Debug.ShouldStop(33554432);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Artists")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnartworkpage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnArtworkPage_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("btnartworkpage_click")) { return __ref.runUserSub(false, "b4xmainpage","btnartworkpage_click", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Private Sub btnArtworkPage_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If artworkPage.IsInitialized = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_artworkpage" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 31;BA.debugLine="artworkPage.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_artworkpage" /*RemoteObject*/ ).runClassMethod (b4a.example.artworkpages.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPage(\"Artworks\", artworkPage)";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Artworks")),(Object)((__ref.getField(false,"_artworkpage" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 35;BA.debugLine="B4XPages.ShowPage(\"Artworks\")";
Debug.ShouldStop(4);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Artworks")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private artistPage As ArtistPages";
b4xmainpage._artistpage = RemoteObject.createNew ("b4a.example.artistpages");__ref.setField("_artistpage",b4xmainpage._artistpage);
 //BA.debugLineNum = 5;BA.debugLine="Private artworkPage As ArtworkPages";
b4xmainpage._artworkpage = RemoteObject.createNew ("b4a.example.artworkpages");__ref.setField("_artworkpage",b4xmainpage._artworkpage);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}