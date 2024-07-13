package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class artworkpages extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.artworkpages");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.artworkpages.class).invoke(this, new Object[] {null});
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
public b4a.example.artworksservice _artworkservice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpublicationyear = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttechnique = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescription = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.artworkpages __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="artworkService.Initialize";
__ref._artworkservice /*b4a.example.artworksservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.artworkpages __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Root.LoadLayout(\"ArtworkPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ArtworkPage",ba);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click(b4a.example.artworkpages __ref) throws Exception{
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.artworkpages parent,b4a.example.artworkpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artworkpages __ref;
b4a.example.artworkpages parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworkpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Try";
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
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Wait For (artworkService.Delete(txtId.Text)) Com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworkpages", "btndelete_click"), __ref._artworkservice /*b4a.example.artworksservice*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="txtName.Text = \"\"";
__ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="txtPublicationYear.Text = \"\"";
__ref._txtpublicationyear /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="txtTechnique.Text = \"\"";
__ref._txttechnique /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="txtDescription.Text = \"\"";
__ref._txtdescription /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Eliminación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
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
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("715073296",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="End Sub";
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
public void  _btnread_click(b4a.example.artworkpages __ref) throws Exception{
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "btnread_click", false))
	 {Debug.delegate(ba, "btnread_click", null); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.artworkpages parent,b4a.example.artworkpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artworkpages __ref;
b4a.example.artworkpages parent;
b4a.example.artwork _artwork = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworkpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Try";
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
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Wait For (artworkService.ReadById(txtId.Text)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworkpages", "btnread_click"), __ref._artworkservice /*b4a.example.artworksservice*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artwork = (b4a.example.artwork) result[1];
;
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="If artwork.id <> 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_artwork._id /*int*/ !=0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="txtId.Text = artwork.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artwork._id /*int*/ ));
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="txtName.Text = artwork.name";
__ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artwork._name /*String*/ ));
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="txtPublicationYear.Text = artwork.publicationYe";
__ref._txtpublicationyear /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artwork._publicationyear /*String*/ ));
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="txtTechnique.Text = artwork.technique";
__ref._txttechnique /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artwork._technique /*String*/ ));
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="txtDescription.Text = artwork.description";
__ref._txtdescription /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artwork._description /*String*/ ));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
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
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("715007760",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15007761;
 //BA.debugLineNum = 15007761;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="End Sub";
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
public void  _btnsave_click(b4a.example.artworkpages __ref) throws Exception{
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {Debug.delegate(ba, "btnsave_click", null); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.artworkpages parent,b4a.example.artworkpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artworkpages __ref;
b4a.example.artworkpages parent;
b4a.example.artwork _artworktocreate = null;
b4a.example.artwork _artworkresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworkpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Try";
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
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim artworkToCreate As Artwork";
_artworktocreate = new b4a.example.artwork();
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="artworkToCreate.name = txtName.Text";
_artworktocreate._name /*String*/  = __ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="artworkToCreate.publicationYear = txtPublication";
_artworktocreate._publicationyear /*String*/  = __ref._txtpublicationyear /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="artworkToCreate.technique = txtTechnique.Text";
_artworktocreate._technique /*String*/  = __ref._txttechnique /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="artworkToCreate.description = txtDescription.Tex";
_artworktocreate._description /*String*/  = __ref._txtdescription /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Wait For (artworkService.Create(artworkToCreate)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworkpages", "btnsave_click"), __ref._artworkservice /*b4a.example.artworksservice*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_artworktocreate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artworkresult = (b4a.example.artwork) result[1];
;
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="If artworkResult <> Null Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_artworkresult!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="txtId.Text = artworkResult.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_artworkresult._id /*int*/ ));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Creación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
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
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("715204370",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="End Sub";
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
public void  _btnupdate_click(b4a.example.artworkpages __ref) throws Exception{
RDebugUtils.currentModule="artworkpages";
if (Debug.shouldDelegate(ba, "btnupdate_click", false))
	 {Debug.delegate(ba, "btnupdate_click", null); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.artworkpages parent,b4a.example.artworkpages __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.artworkpages __ref;
b4a.example.artworkpages parent;
b4a.example.artwork _artworktoupdate = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="artworkpages";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Try";
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
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim artworkToUpdate As Artwork";
_artworktoupdate = new b4a.example.artwork();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="artworkToUpdate.id = txtId.Text";
_artworktoupdate._id /*int*/  = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="artworkToUpdate.name = txtName.Text";
_artworktoupdate._name /*String*/  = __ref._txtname /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="artworkToUpdate.publicationYear = txtPublication";
_artworktoupdate._publicationyear /*String*/  = __ref._txtpublicationyear /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="artworkToUpdate.technique = txtTechnique.Text";
_artworktoupdate._technique /*String*/  = __ref._txttechnique /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="artworkToUpdate.description = txtDescription.Tex";
_artworktoupdate._description /*String*/  = __ref._txtdescription /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Wait For (artworkService.Update(txtId.Text, artw";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "artworkpages", "btnupdate_click"), __ref._artworkservice /*b4a.example.artworksservice*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),_artworktoupdate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualización Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
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
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("715138834",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.artworkpages __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="artworkpages";
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Private artworkService As ArtworksService";
_artworkservice = new b4a.example.artworksservice();
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="Private txtName As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="Private txtPublicationYear As EditText";
_txtpublicationyear = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="Private txtTechnique As EditText";
_txttechnique = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="Private txtDescription As EditText";
_txtdescription = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="End Sub";
return "";
}
}