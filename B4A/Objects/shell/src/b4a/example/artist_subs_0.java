package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artist_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public id As Int";
artist._id = RemoteObject.createImmutable(0);__ref.setField("_id",artist._id);
 //BA.debugLineNum = 3;BA.debugLine="Public name As String";
artist._name = RemoteObject.createImmutable("");__ref.setField("_name",artist._name);
 //BA.debugLineNum = 4;BA.debugLine="Public lastName As String";
artist._lastname = RemoteObject.createImmutable("");__ref.setField("_lastname",artist._lastname);
 //BA.debugLineNum = 5;BA.debugLine="Public nationality As String";
artist._nationality = RemoteObject.createImmutable("");__ref.setField("_nationality",artist._nationality);
 //BA.debugLineNum = 6;BA.debugLine="Public birthDate As String";
artist._birthdate = RemoteObject.createImmutable("");__ref.setField("_birthdate",artist._birthdate);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (artist) ","artist",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artist","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}