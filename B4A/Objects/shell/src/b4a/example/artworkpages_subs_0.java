package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artworkpages_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "artworkpages","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"ArtworkPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ArtworkPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "artworkpages","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.artworkpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworkpages parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 50;BA.debugLine="Wait For (artworkService.Delete(txtId.Text)) Com";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworkpages", "btndelete_click"), __ref.getField(false,"_artworkservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artworksservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 51;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 52;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 53;BA.debugLine="txtName.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 54;BA.debugLine="txtPublicationYear.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtpublicationyear" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 55;BA.debugLine="txtTechnique.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txttechnique" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="txtDescription.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtdescription" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 64;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","715073296",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 65;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _btnread_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "artworkpages","btnread_click", __ref); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.artworkpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworkpages parent;
RemoteObject _artwork = RemoteObject.declareNull("b4a.example.artwork");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,27);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 28;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="Wait For (artworkService.ReadById(txtId.Text)) C";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworkpages", "btnread_click"), __ref.getField(false,"_artworkservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artworksservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artwork = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("artwork", _artwork);
;
 BA.debugLineNum = 31;BA.debugLine="If artwork.id <> 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_artwork.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 32;BA.debugLine="txtId.Text = artwork.id";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artwork.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtName.Text = artwork.name";
Debug.ShouldStop(1);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artwork.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtPublicationYear.Text = artwork.publicationYe";
Debug.ShouldStop(2);
__ref.getField(false,"_txtpublicationyear" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artwork.getField(true,"_publicationyear" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtTechnique.Text = artwork.technique";
Debug.ShouldStop(4);
__ref.getField(false,"_txttechnique" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artwork.getField(true,"_technique" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="txtDescription.Text = artwork.description";
Debug.ShouldStop(8);
__ref.getField(false,"_txtdescription" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artwork.getField(true,"_description" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 39;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 43;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","715007760",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 44;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnsave_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "artworkpages","btnsave_click", __ref); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.artworkpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworkpages parent;
RemoteObject _artworktocreate = RemoteObject.declareNull("b4a.example.artwork");
RemoteObject _artworkresult = RemoteObject.declareNull("b4a.example.artwork");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,92);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 93;BA.debugLine="Try";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 94;BA.debugLine="Dim artworkToCreate As Artwork";
Debug.ShouldStop(536870912);
_artworktocreate = RemoteObject.createNew ("b4a.example.artwork");Debug.locals.put("artworkToCreate", _artworktocreate);
 BA.debugLineNum = 96;BA.debugLine="artworkToCreate.name = txtName.Text";
Debug.ShouldStop(-2147483648);
_artworktocreate.setField ("_name" /*RemoteObject*/ ,__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 97;BA.debugLine="artworkToCreate.publicationYear = txtPublication";
Debug.ShouldStop(1);
_artworktocreate.setField ("_publicationyear" /*RemoteObject*/ ,__ref.getField(false,"_txtpublicationyear" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 98;BA.debugLine="artworkToCreate.technique = txtTechnique.Text";
Debug.ShouldStop(2);
_artworktocreate.setField ("_technique" /*RemoteObject*/ ,__ref.getField(false,"_txttechnique" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 99;BA.debugLine="artworkToCreate.description = txtDescription.Tex";
Debug.ShouldStop(4);
_artworktocreate.setField ("_description" /*RemoteObject*/ ,__ref.getField(false,"_txtdescription" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 101;BA.debugLine="Wait For (artworkService.Create(artworkToCreate)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworkpages", "btnsave_click"), __ref.getField(false,"_artworkservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artworksservice.class, "_create" /*RemoteObject*/ ,(Object)(_artworktocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artworkresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("artworkResult", _artworkresult);
;
 BA.debugLineNum = 102;BA.debugLine="If artworkResult <> Null Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_artworkresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 103;BA.debugLine="txtId.Text = artworkResult.id";
Debug.ShouldStop(64);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artworkresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
Debug.ShouldStop(128);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 110;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","715204370",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 111;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "artworkpages","btnupdate_click", __ref); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.artworkpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artworkpages parent;
RemoteObject _artworktoupdate = RemoteObject.declareNull("b4a.example.artwork");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,69);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 70;BA.debugLine="Try";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 71;BA.debugLine="Dim artworkToUpdate As Artwork";
Debug.ShouldStop(64);
_artworktoupdate = RemoteObject.createNew ("b4a.example.artwork");Debug.locals.put("artworkToUpdate", _artworktoupdate);
 BA.debugLineNum = 73;BA.debugLine="artworkToUpdate.id = txtId.Text";
Debug.ShouldStop(256);
_artworktoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 74;BA.debugLine="artworkToUpdate.name = txtName.Text";
Debug.ShouldStop(512);
_artworktoupdate.setField ("_name" /*RemoteObject*/ ,__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 75;BA.debugLine="artworkToUpdate.publicationYear = txtPublication";
Debug.ShouldStop(1024);
_artworktoupdate.setField ("_publicationyear" /*RemoteObject*/ ,__ref.getField(false,"_txtpublicationyear" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 76;BA.debugLine="artworkToUpdate.technique = txtTechnique.Text";
Debug.ShouldStop(2048);
_artworktoupdate.setField ("_technique" /*RemoteObject*/ ,__ref.getField(false,"_txttechnique" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 77;BA.debugLine="artworkToUpdate.description = txtDescription.Tex";
Debug.ShouldStop(4096);
_artworktoupdate.setField ("_description" /*RemoteObject*/ ,__ref.getField(false,"_txtdescription" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 79;BA.debugLine="Wait For (artworkService.Update(txtId.Text, artw";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artworkpages", "btnupdate_click"), __ref.getField(false,"_artworkservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artworksservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_artworktoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 80;BA.debugLine="If success Then";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 81;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 83;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 87;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","715138834",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
artworkpages._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",artworkpages._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
artworkpages._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",artworkpages._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private artworkService As ArtworksService";
artworkpages._artworkservice = RemoteObject.createNew ("b4a.example.artworksservice");__ref.setField("_artworkservice",artworkpages._artworkservice);
 //BA.debugLineNum = 6;BA.debugLine="Private txtId As EditText";
artworkpages._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",artworkpages._txtid);
 //BA.debugLineNum = 7;BA.debugLine="Private txtName As EditText";
artworkpages._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtname",artworkpages._txtname);
 //BA.debugLineNum = 8;BA.debugLine="Private txtPublicationYear As EditText";
artworkpages._txtpublicationyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtpublicationyear",artworkpages._txtpublicationyear);
 //BA.debugLineNum = 9;BA.debugLine="Private txtTechnique As EditText";
artworkpages._txttechnique = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttechnique",artworkpages._txttechnique);
 //BA.debugLineNum = 10;BA.debugLine="Private txtDescription As EditText";
artworkpages._txtdescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdescription",artworkpages._txtdescription);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (artworkpages) ","artworkpages",8,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artworkpages","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="artworkService.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_artworkservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artworksservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}