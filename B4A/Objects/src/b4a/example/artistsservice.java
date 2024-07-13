package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class artistsservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.artistsservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.artistsservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.artistsservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="artistsservice";
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.artistsservice __ref,b4a.example.artist _artist) throws Exception{
RDebugUtils.currentModule="artistsservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_artist}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_artist);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.artistsservice parent,b4a.example.artistsservice __ref,b4a.example.artist _artist) {
this.parent = parent;
this.__ref = __ref;
this._artist = _artist;
this.__ref = parent;
}
b4a.example.artistsservice __ref;
b4a.example.artistsservice parent;
b4a.example.artist _artist;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistsservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="json.Initialize(CreateMap(\"name\": artist.name, \"l";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("name"),(Object)(_artist._name /*String*/ ),(Object)("lastName"),(Object)(_artist._lastname /*String*/ ),(Object)("nationality"),(Object)(_artist._nationality /*String*/ ),(Object)("birthDate"),(Object)(_artist._birthdate /*String*/ )}));
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
_apijob._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json.ToString());
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistsservice", "create"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("710747916","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="artist.id = map.Get(\"id\")";
_artist._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="artist.name = map.Get(\"name\")";
_artist._name /*String*/  = BA.ObjectToString(_map.Get((Object)("name")));
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="artist.lastName = map.Get(\"lastName\")";
_artist._lastname /*String*/  = BA.ObjectToString(_map.Get((Object)("lastName")));
RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="artist.nationality = map.Get(\"nationality\")";
_artist._nationality /*String*/  = BA.ObjectToString(_map.Get((Object)("nationality")));
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="artist.birthDate = map.Get(\"birthDate\")";
_artist._birthdate /*String*/  = BA.ObjectToString(_map.Get((Object)("birthDate")));
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="Return artist";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_artist));return;};
RDebugUtils.currentLine=10747930;
 //BA.debugLineNum = 10747930;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.artistsservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="artistsservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.artistsservice parent,b4a.example.artistsservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.artistsservice __ref;
b4a.example.artistsservice parent;
int _id;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistsservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
_apijob._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistsservice", "delete"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713369351","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.artistsservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="artistsservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="ApiUrl = \"https://appcloudutnweb.azurewebsites.ne";
__ref._apiurl /*String*/  = "https://appcloudutnweb.azurewebsites.net/api/Artists";
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.artistsservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="artistsservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.artistsservice parent,b4a.example.artistsservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.artistsservice __ref;
b4a.example.artistsservice parent;
int _id;
b4a.example.artist _artist = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistsservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim artist As Artist";
_artist = new b4a.example.artist();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="artist.Initialize";
_artist._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
_apijob._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistsservice", "readbyid"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713238282","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="artist.id = map.Get(\"id\")";
_artist._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="artist.name = map.Get(\"name\")";
_artist._name /*String*/  = BA.ObjectToString(_map.Get((Object)("name")));
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="artist.lastName = map.Get(\"lastName\")";
_artist._lastname /*String*/  = BA.ObjectToString(_map.Get((Object)("lastName")));
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="artist.nationality = map.Get(\"nationality\")";
_artist._nationality /*String*/  = BA.ObjectToString(_map.Get((Object)("nationality")));
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="artist.birthDate = map.Get(\"birthDate\")";
_artist._birthdate /*String*/  = BA.ObjectToString(_map.Get((Object)("birthDate")));
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="Return artist";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_artist));return;};
RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.artistsservice __ref,int _id,b4a.example.artist _artist) throws Exception{
RDebugUtils.currentModule="artistsservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_artist}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_artist);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.artistsservice parent,b4a.example.artistsservice __ref,int _id,b4a.example.artist _artist) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._artist = _artist;
this.__ref = parent;
}
b4a.example.artistsservice __ref;
b4a.example.artistsservice parent;
int _id;
b4a.example.artist _artist;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistsservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="json.Initialize(CreateMap(\"id\": artist.id, \"name\"";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_artist._id /*int*/ ),(Object)("name"),(Object)(_artist._name /*String*/ ),(Object)("lastName"),(Object)(_artist._lastname /*String*/ ),(Object)("nationality"),(Object)(_artist._nationality /*String*/ ),(Object)("birthDate"),(Object)(_artist._birthdate /*String*/ )}));
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
_apijob._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json.ToString());
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistsservice", "update"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13303820;
 //BA.debugLineNum = 13303820;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713303820","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13303823;
 //BA.debugLineNum = 13303823;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13303824;
 //BA.debugLineNum = 13303824;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}