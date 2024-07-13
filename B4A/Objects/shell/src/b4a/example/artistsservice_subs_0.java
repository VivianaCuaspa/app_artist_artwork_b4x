package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artistsservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
artistsservice._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",artistsservice._apiurl);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _artist) throws Exception{
try {
		Debug.PushSubsStack("Create (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "artistsservice","create", __ref, _artist);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_artist);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.artistsservice parent,RemoteObject __ref,RemoteObject _artist) {
this.parent = parent;
this.__ref = __ref;
this._artist = _artist;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistsservice parent;
RemoteObject _artist;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,11);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("artist", _artist);
 BA.debugLineNum = 12;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(2048);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 13;BA.debugLine="json.Initialize(CreateMap(\"name\": artist.name, \"l";
Debug.ShouldStop(4096);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_artist.getField(true,"_name" /*RemoteObject*/ )),RemoteObject.createImmutable(("lastName")),(_artist.getField(true,"_lastname" /*RemoteObject*/ )),RemoteObject.createImmutable(("nationality")),(_artist.getField(true,"_nationality" /*RemoteObject*/ )),RemoteObject.createImmutable(("birthDate")),(_artist.getField(true,"_birthdate" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 15;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(16384);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 16;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(32768);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 17;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
Debug.ShouldStop(65536);
_apijob.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 18;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(131072);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 20;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistsservice", "create"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 22;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 23;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","710747916",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 24;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 27;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(67108864);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 28;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(134217728);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(268435456);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 31;BA.debugLine="artist.id = map.Get(\"id\")";
Debug.ShouldStop(1073741824);
_artist.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 32;BA.debugLine="artist.name = map.Get(\"name\")";
Debug.ShouldStop(-2147483648);
_artist.setField ("_name" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 33;BA.debugLine="artist.lastName = map.Get(\"lastName\")";
Debug.ShouldStop(1);
_artist.setField ("_lastname" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastName"))))));
 BA.debugLineNum = 34;BA.debugLine="artist.nationality = map.Get(\"nationality\")";
Debug.ShouldStop(2);
_artist.setField ("_nationality" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nationality"))))));
 BA.debugLineNum = 35;BA.debugLine="artist.birthDate = map.Get(\"birthDate\")";
Debug.ShouldStop(4);
_artist.setField ("_birthdate" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("birthDate"))))));
 BA.debugLineNum = 36;BA.debugLine="Return artist";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_artist));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "artistsservice","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.artistsservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistsservice parent;
RemoteObject _id;
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,84);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 85;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(1048576);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 86;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 87;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(4194304);
_apijob.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 88;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistsservice", "delete"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 90;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 91;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","713369351",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 94;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artistsservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="ApiUrl = \"https://appcloudutnweb.azurewebsites.ne";
Debug.ShouldStop(128);
__ref.setField ("_apiurl" /*RemoteObject*/ ,BA.ObjectToString("https://appcloudutnweb.azurewebsites.net/api/Artists"));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadById (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("readbyid")) { return __ref.runUserSub(false, "artistsservice","readbyid", __ref, _id);}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.artistsservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistsservice parent;
RemoteObject _id;
RemoteObject _artist = RemoteObject.declareNull("b4a.example.artist");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadById (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 40;BA.debugLine="Dim artist As Artist";
Debug.ShouldStop(128);
_artist = RemoteObject.createNew ("b4a.example.artist");Debug.locals.put("artist", _artist);
 BA.debugLineNum = 41;BA.debugLine="artist.Initialize";
Debug.ShouldStop(256);
_artist.runClassMethod (b4a.example.artist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(1024);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 44;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(2048);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 45;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(4096);
_apijob.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 46;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistsservice", "readbyid"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","713238282",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="Return Null";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1048576);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 54;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2097152);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(4194304);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 57;BA.debugLine="artist.id = map.Get(\"id\")";
Debug.ShouldStop(16777216);
_artist.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 58;BA.debugLine="artist.name = map.Get(\"name\")";
Debug.ShouldStop(33554432);
_artist.setField ("_name" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 59;BA.debugLine="artist.lastName = map.Get(\"lastName\")";
Debug.ShouldStop(67108864);
_artist.setField ("_lastname" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastName"))))));
 BA.debugLineNum = 60;BA.debugLine="artist.nationality = map.Get(\"nationality\")";
Debug.ShouldStop(134217728);
_artist.setField ("_nationality" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nationality"))))));
 BA.debugLineNum = 61;BA.debugLine="artist.birthDate = map.Get(\"birthDate\")";
Debug.ShouldStop(268435456);
_artist.setField ("_birthdate" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("birthDate"))))));
 BA.debugLineNum = 63;BA.debugLine="Return artist";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_artist));return;};
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _artist) throws Exception{
try {
		Debug.PushSubsStack("Update (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "artistsservice","update", __ref, _id, _artist);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_artist);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.artistsservice parent,RemoteObject __ref,RemoteObject _id,RemoteObject _artist) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._artist = _artist;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistsservice parent;
RemoteObject _id;
RemoteObject _artist;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (artistsservice) ","artistsservice",5,__ref.getField(false, "ba"),__ref,66);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("artist", _artist);
 BA.debugLineNum = 67;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(4);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 68;BA.debugLine="json.Initialize(CreateMap(\"id\": artist.id, \"name\"";
Debug.ShouldStop(8);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_artist.getField(true,"_id" /*RemoteObject*/ )),RemoteObject.createImmutable(("name")),(_artist.getField(true,"_name" /*RemoteObject*/ )),RemoteObject.createImmutable(("lastName")),(_artist.getField(true,"_lastname" /*RemoteObject*/ )),RemoteObject.createImmutable(("nationality")),(_artist.getField(true,"_nationality" /*RemoteObject*/ )),RemoteObject.createImmutable(("birthDate")),(_artist.getField(true,"_birthdate" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 70;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(32);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 71;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(64);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 72;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
Debug.ShouldStop(128);
_apijob.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 73;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(256);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 75;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistsservice", "update"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 77;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 78;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","713303820",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 81;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}