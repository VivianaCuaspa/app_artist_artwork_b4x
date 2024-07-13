package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class artistpages extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.artistpages");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.artistpages.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.artistsservice _artistservice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtlastname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnationality = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtbirthdate = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.artistpages __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="artistService.Initialize";
__ref._artistservice /*b4a.example.artistsservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.artistpages __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Root.LoadLayout(\"ArtistPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ArtistPage",ba);
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click(b4a.example.artistpages __ref) throws Exception{
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.artistpages parent,b4a.example.artistpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artistpages __ref;
b4a.example.artistpages parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Wait For (artistService.Delete(txtId.Text)) Comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistpages", "btndelete_click"), __ref._artistservice /*b4a.example.artistsservice*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="If success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="txtName.Text = \"\"";
__ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="txtLastName.Text = \"\"";
__ref._txtlastname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="txtNationality.Text = \"\"";
__ref._txtnationality /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="txtBirthDate.Text = \"\"";
__ref._txtbirthdate /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Eliminación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se encontró el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("714483472",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=14483473;
 //BA.debugLineNum = 14483473;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14483475;
 //BA.debugLineNum = 14483475;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnread_click(b4a.example.artistpages __ref) throws Exception{
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "btnread_click", false))
	 {Debug.delegate(ba, "btnread_click", null); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.artistpages parent,b4a.example.artistpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artistpages __ref;
b4a.example.artistpages parent;
b4a.example.artist _artist = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Wait For (artistService.ReadById(txtId.Text)) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistpages", "btnread_click"), __ref._artistservice /*b4a.example.artistsservice*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artist = (b4a.example.artist) result[1];
;
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="If artist.id <> 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_artist._id /*int*/ !=0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="txtId.Text = artist.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artist._id /*int*/ ));
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="txtName.Text = artist.name";
__ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artist._name /*String*/ ));
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="txtLastName.Text = artist.lastName";
__ref._txtlastname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artist._lastname /*String*/ ));
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="txtNationality.Text = artist.nationality";
__ref._txtnationality /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artist._nationality /*String*/ ));
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="txtBirthDate.Text = artist.birthDate";
__ref._txtbirthdate /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artist._birthdate /*String*/ ));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("714417936",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=14417937;
 //BA.debugLineNum = 14417937;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14417939;
 //BA.debugLineNum = 14417939;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnsave_click(b4a.example.artistpages __ref) throws Exception{
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {Debug.delegate(ba, "btnsave_click", null); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.artistpages parent,b4a.example.artistpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artistpages __ref;
b4a.example.artistpages parent;
b4a.example.artist _artisttocreate = null;
b4a.example.artist _artistresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim artistToCreate As Artist";
_artisttocreate = new b4a.example.artist();
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="artistToCreate.name = txtName.Text";
_artisttocreate._name /*String*/  = __ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="artistToCreate.lastName = txtLastName.Text";
_artisttocreate._lastname /*String*/  = __ref._txtlastname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="artistToCreate.nationality = txtNationality.Text";
_artisttocreate._nationality /*String*/  = __ref._txtnationality /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="artistToCreate.birthDate = txtBirthDate.Text";
_artisttocreate._birthdate /*String*/  = __ref._txtbirthdate /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="Wait For (artistService.Create(artistToCreate))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistpages", "btnsave_click"), __ref._artistservice /*b4a.example.artistsservice*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_artisttocreate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artistresult = (b4a.example.artist) result[1];
;
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="If artistResult <> Null Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_artistresult!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="txtId.Text = artistResult.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artistresult._id /*int*/ ));
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Creación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14614542;
 //BA.debugLineNum = 14614542;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo crear el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14614546;
 //BA.debugLineNum = 14614546;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("714614546",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=14614547;
 //BA.debugLineNum = 14614547;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14614549;
 //BA.debugLineNum = 14614549;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnupdate_click(b4a.example.artistpages __ref) throws Exception{
RDebugUtils.currentModule="artistpages";
if (Debug.shouldDelegate(ba, "btnupdate_click", false))
	 {Debug.delegate(ba, "btnupdate_click", null); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.artistpages parent,b4a.example.artistpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artistpages __ref;
b4a.example.artistpages parent;
b4a.example.artist _artisttoupdate = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artistpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim artistToUpdate As Artist";
_artisttoupdate = new b4a.example.artist();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="artistToUpdate.id = txtId.Text";
_artisttoupdate._id /*int*/  = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="artistToUpdate.name = txtName.Text";
_artisttoupdate._name /*String*/  = __ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="artistToUpdate.lastName = txtLastName.Text";
_artisttoupdate._lastname /*String*/  = __ref._txtlastname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="artistToUpdate.nationality = txtNationality.Text";
_artisttoupdate._nationality /*String*/  = __ref._txtnationality /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="artistToUpdate.birthDate = txtBirthDate.Text";
_artisttoupdate._birthdate /*String*/  = __ref._txtbirthdate /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Wait For (artistService.Update(txtId.Text, artis";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artistpages", "btnupdate_click"), __ref._artistservice /*b4a.example.artistsservice*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),_artisttoupdate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="If success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualización Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se encontró el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=14549010;
 //BA.debugLineNum = 14549010;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("714549010",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=14549011;
 //BA.debugLineNum = 14549011;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=14549013;
 //BA.debugLineNum = 14549013;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _class_globals(b4a.example.artistpages __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="artistpages";
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="Private artistService As ArtistsService";
_artistservice = new b4a.example.artistsservice();
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Private txtName As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="Private txtLastName As EditText";
_txtlastname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Private txtNationality As EditText";
_txtnationality = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="Private txtBirthDate As EditText";
_txtbirthdate = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="End Sub";
return "";
}
}