package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class artworksservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.artworksservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.artworksservice.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.artworksservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="artworksservice";
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.artworksservice __ref,b4a.example.artwork _artwork) throws Exception{
RDebugUtils.currentModule="artworksservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_artwork}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_artwork);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.artworksservice parent,b4a.example.artworksservice __ref,b4a.example.artwork _artwork) {
this.parent = parent;
this.__ref = __ref;
this._artwork = _artwork;
this.__ref = parent;
}
b4a.example.artworksservice __ref;
b4a.example.artworksservice parent;
b4a.example.artwork _artwork;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworksservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="json.Initialize(CreateMap(\"name\": artwork.name, \"";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("name"),(Object)(_artwork._name /*String*/ ),(Object)("publicationYear"),(Object)(_artwork._publicationyear /*String*/ ),(Object)("technique"),(Object)(_artwork._technique /*String*/ ),(Object)("description"),(Object)(_artwork._description /*String*/ )}));
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
_apijob._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json.ToString());
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworksservice", "create"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="If resultado.Success = False Then";
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
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713565964","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="artwork.id = map.Get(\"id\")";
_artwork._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13565973;
 //BA.debugLineNum = 13565973;BA.debugLine="artwork.name = map.Get(\"name\")";
_artwork._name /*String*/  = BA.ObjectToString(_map.Get((Object)("name")));
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="artwork.publicationYear = map.Get(\"publicationYea";
_artwork._publicationyear /*String*/  = BA.ObjectToString(_map.Get((Object)("publicationYear")));
RDebugUtils.currentLine=13565975;
 //BA.debugLineNum = 13565975;BA.debugLine="artwork.technique = map.Get(\"technique\")";
_artwork._technique /*String*/  = BA.ObjectToString(_map.Get((Object)("technique")));
RDebugUtils.currentLine=13565976;
 //BA.debugLineNum = 13565976;BA.debugLine="artwork.description = map.Get(\"description\")";
_artwork._description /*String*/  = BA.ObjectToString(_map.Get((Object)("description")));
RDebugUtils.currentLine=13565978;
 //BA.debugLineNum = 13565978;BA.debugLine="Return artwork";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_artwork));return;};
RDebugUtils.currentLine=13565979;
 //BA.debugLineNum = 13565979;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.artworksservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="artworksservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.artworksservice parent,b4a.example.artworksservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.artworksservice __ref;
b4a.example.artworksservice parent;
int _id;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworksservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
_apijob._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworksservice", "delete"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="If resultado.Success = False Then";
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
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713762567","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.artworksservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="artworksservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="ApiUrl = \"https://appcloudutnweb.azurewebsites.ne";
__ref._apiurl /*String*/  = "https://appcloudutnweb.azurewebsites.net/api/Artworks";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.artworksservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="artworksservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.artworksservice parent,b4a.example.artworksservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.artworksservice __ref;
b4a.example.artworksservice parent;
int _id;
b4a.example.artwork _artwork = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworksservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim artwork As Artwork";
_artwork = new b4a.example.artwork();
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="artwork.Initialize";
_artwork._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
_apijob._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworksservice", "readbyid"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="If resultado.Success = False Then";
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
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713631498","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13631503;
 //BA.debugLineNum = 13631503;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="artwork.id = map.Get(\"id\")";
_artwork._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13631507;
 //BA.debugLineNum = 13631507;BA.debugLine="artwork.name = map.Get(\"name\")";
_artwork._name /*String*/  = BA.ObjectToString(_map.Get((Object)("name")));
RDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="artwork.publicationYear = map.Get(\"publicationYea";
_artwork._publicationyear /*String*/  = BA.ObjectToString(_map.Get((Object)("publicationYear")));
RDebugUtils.currentLine=13631509;
 //BA.debugLineNum = 13631509;BA.debugLine="artwork.technique = map.Get(\"technique\")";
_artwork._technique /*String*/  = BA.ObjectToString(_map.Get((Object)("technique")));
RDebugUtils.currentLine=13631510;
 //BA.debugLineNum = 13631510;BA.debugLine="artwork.description = map.Get(\"description\")";
_artwork._description /*String*/  = BA.ObjectToString(_map.Get((Object)("description")));
RDebugUtils.currentLine=13631512;
 //BA.debugLineNum = 13631512;BA.debugLine="Return artwork";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_artwork));return;};
RDebugUtils.currentLine=13631513;
 //BA.debugLineNum = 13631513;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.artworksservice __ref,int _id,b4a.example.artwork _artwork) throws Exception{
RDebugUtils.currentModule="artworksservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_artwork}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_artwork);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.artworksservice parent,b4a.example.artworksservice __ref,int _id,b4a.example.artwork _artwork) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._artwork = _artwork;
this.__ref = parent;
}
b4a.example.artworksservice __ref;
b4a.example.artworksservice parent;
int _id;
b4a.example.artwork _artwork;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworksservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="json.Initialize(CreateMap(\"id\": artwork.id, \"name";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_artwork._id /*int*/ ),(Object)("name"),(Object)(_artwork._name /*String*/ ),(Object)("publicationYear"),(Object)(_artwork._publicationyear /*String*/ ),(Object)("technique"),(Object)(_artwork._technique /*String*/ ),(Object)("description"),(Object)(_artwork._description /*String*/ )}));
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
_apijob._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json.ToString());
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworksservice", "update"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="If resultado.Success = False Then";
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
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("713697036","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}