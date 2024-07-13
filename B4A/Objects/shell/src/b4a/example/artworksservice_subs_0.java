package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artworksservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
artworksservice._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",artworksservice._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _artwork) throws Exception{
try {
		Debug.PushSubsStack("Create (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "artworksservice","create", __ref, _artwork);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_artwork);
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
public ResumableSub_Create(b4a.example.artworksservice parent,RemoteObject __ref,RemoteObject _artwork) {
this.parent = parent;
this.__ref = __ref;
this._artwork = _artwork;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworksservice parent;
RemoteObject _artwork;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,9);
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
Debug.locals.put("artwork", _artwork);
 BA.debugLineNum = 10;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(512);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 11;BA.debugLine="json.Initialize(CreateMap(\"name\": artwork.name, \"";
Debug.ShouldStop(1024);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_artwork.getField(true,"_name" /*RemoteObject*/ )),RemoteObject.createImmutable(("publicationYear")),(_artwork.getField(true,"_publicationyear" /*RemoteObject*/ )),RemoteObject.createImmutable(("technique")),(_artwork.getField(true,"_technique" /*RemoteObject*/ )),RemoteObject.createImmutable(("description")),(_artwork.getField(true,"_description" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 13;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(4096);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 14;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(8192);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 15;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
Debug.ShouldStop(16384);
_apijob.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 16;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(32768);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 18;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworksservice", "create"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 20;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 21;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","713565964",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 22;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 25;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(16777216);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 26;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(33554432);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 27;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(67108864);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 29;BA.debugLine="artwork.id = map.Get(\"id\")";
Debug.ShouldStop(268435456);
_artwork.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 30;BA.debugLine="artwork.name = map.Get(\"name\")";
Debug.ShouldStop(536870912);
_artwork.setField ("_name" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 31;BA.debugLine="artwork.publicationYear = map.Get(\"publicationYea";
Debug.ShouldStop(1073741824);
_artwork.setField ("_publicationyear" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("publicationYear"))))));
 BA.debugLineNum = 32;BA.debugLine="artwork.technique = map.Get(\"technique\")";
Debug.ShouldStop(-2147483648);
_artwork.setField ("_technique" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("technique"))))));
 BA.debugLineNum = 33;BA.debugLine="artwork.description = map.Get(\"description\")";
Debug.ShouldStop(1);
_artwork.setField ("_description" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))));
 BA.debugLineNum = 35;BA.debugLine="Return artwork";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_artwork));return;};
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Delete (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "artworksservice","delete", __ref, _id);}
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
public ResumableSub_Delete(b4a.example.artworksservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworksservice parent;
RemoteObject _id;
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,83);
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
 BA.debugLineNum = 84;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(524288);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 85;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 86;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(2097152);
_apijob.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 87;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworksservice", "delete"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 89;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 90;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","713762567",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artworksservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="ApiUrl = \"https://appcloudutnweb.azurewebsites.ne";
Debug.ShouldStop(64);
__ref.setField ("_apiurl" /*RemoteObject*/ ,BA.ObjectToString("https://appcloudutnweb.azurewebsites.net/api/Artworks"));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("ReadById (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("readbyid")) { return __ref.runUserSub(false, "artworksservice","readbyid", __ref, _id);}
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
public ResumableSub_ReadById(b4a.example.artworksservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworksservice parent;
RemoteObject _id;
RemoteObject _artwork = RemoteObject.declareNull("b4a.example.artwork");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadById (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,38);
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
 BA.debugLineNum = 39;BA.debugLine="Dim artwork As Artwork";
Debug.ShouldStop(64);
_artwork = RemoteObject.createNew ("b4a.example.artwork");Debug.locals.put("artwork", _artwork);
 BA.debugLineNum = 40;BA.debugLine="artwork.Initialize";
Debug.ShouldStop(128);
_artwork.runClassMethod (b4a.example.artwork.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 42;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(512);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 43;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 44;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(2048);
_apijob.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 45;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworksservice", "readbyid"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 47;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 48;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","713631498",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 49;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(524288);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 53;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(1048576);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 56;BA.debugLine="artwork.id = map.Get(\"id\")";
Debug.ShouldStop(8388608);
_artwork.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 57;BA.debugLine="artwork.name = map.Get(\"name\")";
Debug.ShouldStop(16777216);
_artwork.setField ("_name" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 58;BA.debugLine="artwork.publicationYear = map.Get(\"publicationYea";
Debug.ShouldStop(33554432);
_artwork.setField ("_publicationyear" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("publicationYear"))))));
 BA.debugLineNum = 59;BA.debugLine="artwork.technique = map.Get(\"technique\")";
Debug.ShouldStop(67108864);
_artwork.setField ("_technique" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("technique"))))));
 BA.debugLineNum = 60;BA.debugLine="artwork.description = map.Get(\"description\")";
Debug.ShouldStop(134217728);
_artwork.setField ("_description" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))));
 BA.debugLineNum = 62;BA.debugLine="Return artwork";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_artwork));return;};
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _artwork) throws Exception{
try {
		Debug.PushSubsStack("Update (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "artworksservice","update", __ref, _id, _artwork);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_artwork);
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
public ResumableSub_Update(b4a.example.artworksservice parent,RemoteObject __ref,RemoteObject _id,RemoteObject _artwork) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._artwork = _artwork;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworksservice parent;
RemoteObject _id;
RemoteObject _artwork;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (artworksservice) ","artworksservice",6,__ref.getField(false, "ba"),__ref,65);
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
Debug.locals.put("artwork", _artwork);
 BA.debugLineNum = 66;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(2);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 67;BA.debugLine="json.Initialize(CreateMap(\"id\": artwork.id, \"name";
Debug.ShouldStop(4);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_artwork.getField(true,"_id" /*RemoteObject*/ )),RemoteObject.createImmutable(("name")),(_artwork.getField(true,"_name" /*RemoteObject*/ )),RemoteObject.createImmutable(("publicationYear")),(_artwork.getField(true,"_publicationyear" /*RemoteObject*/ )),RemoteObject.createImmutable(("technique")),(_artwork.getField(true,"_technique" /*RemoteObject*/ )),RemoteObject.createImmutable(("description")),(_artwork.getField(true,"_description" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 69;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(16);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 70;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(32);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 71;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
Debug.ShouldStop(64);
_apijob.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 72;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(128);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 74;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworksservice", "update"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 76;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 77;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","713697036",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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