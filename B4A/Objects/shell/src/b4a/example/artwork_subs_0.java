package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artwork_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public id As Int";
artwork._id = RemoteObject.createImmutable(0);__ref.setField("_id",artwork._id);
 //BA.debugLineNum = 3;BA.debugLine="Public name As String";
artwork._name = RemoteObject.createImmutable("");__ref.setField("_name",artwork._name);
 //BA.debugLineNum = 4;BA.debugLine="Public publicationYear As String";
artwork._publicationyear = RemoteObject.createImmutable("");__ref.setField("_publicationyear",artwork._publicationyear);
 //BA.debugLineNum = 5;BA.debugLine="Public technique As String";
artwork._technique = RemoteObject.createImmutable("");__ref.setField("_technique",artwork._technique);
 //BA.debugLineNum = 6;BA.debugLine="Public description As String";
artwork._description = RemoteObject.createImmutable("");__ref.setField("_description",artwork._description);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (artwork) ","artwork",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artwork","initialize", __ref, _ba);}
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