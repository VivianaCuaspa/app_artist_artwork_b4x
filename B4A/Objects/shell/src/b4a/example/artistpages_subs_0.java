package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class artistpages_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "artistpages","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"ArtistPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ArtistPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnDelete_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "artistpages","btndelete_click", __ref); return;}
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
public ResumableSub_btnDelete_Click(b4a.example.artistpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistpages parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,45);
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
 BA.debugLineNum = 46;BA.debugLine="Try";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 47;BA.debugLine="Wait For (artistService.Delete(txtId.Text)) Comp";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistpages", "btndelete_click"), __ref.getField(false,"_artistservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artistsservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 48;BA.debugLine="If success Then";
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
 BA.debugLineNum = 49;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="txtName.Text = \"\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 51;BA.debugLine="txtLastName.Text = \"\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtlastname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 52;BA.debugLine="txtNationality.Text = \"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtnationality" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 53;BA.debugLine="txtBirthDate.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtbirthdate" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 55;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 61;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","714483472",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnRead_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "artistpages","btnread_click", __ref); return;}
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
public ResumableSub_btnRead_Click(b4a.example.artistpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistpages parent;
RemoteObject _artist = RemoteObject.declareNull("b4a.example.artist");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,24);
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
 BA.debugLineNum = 25;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 26;BA.debugLine="Wait For (artistService.ReadById(txtId.Text)) Co";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistpages", "btnread_click"), __ref.getField(false,"_artistservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artistsservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artist = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("artist", _artist);
;
 BA.debugLineNum = 28;BA.debugLine="If artist.id <> 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_artist.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 29;BA.debugLine="txtId.Text = artist.id";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artist.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="txtName.Text = artist.name";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artist.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="txtLastName.Text = artist.lastName";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtlastname" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artist.getField(true,"_lastname" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="txtNationality.Text = artist.nationality";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtnationality" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artist.getField(true,"_nationality" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtBirthDate.Text = artist.birthDate";
Debug.ShouldStop(1);
__ref.getField(false,"_txtbirthdate" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artist.getField(true,"_birthdate" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 36;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 40;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","714417936",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("btnSave_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "artistpages","btnsave_click", __ref); return;}
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
public ResumableSub_btnSave_Click(b4a.example.artistpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistpages parent;
RemoteObject _artisttocreate = RemoteObject.declareNull("b4a.example.artist");
RemoteObject _artistresult = RemoteObject.declareNull("b4a.example.artist");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,89);
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
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Dim artistToCreate As Artist";
Debug.ShouldStop(67108864);
_artisttocreate = RemoteObject.createNew ("b4a.example.artist");Debug.locals.put("artistToCreate", _artisttocreate);
 BA.debugLineNum = 93;BA.debugLine="artistToCreate.name = txtName.Text";
Debug.ShouldStop(268435456);
_artisttocreate.setField ("_name" /*RemoteObject*/ ,__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 94;BA.debugLine="artistToCreate.lastName = txtLastName.Text";
Debug.ShouldStop(536870912);
_artisttocreate.setField ("_lastname" /*RemoteObject*/ ,__ref.getField(false,"_txtlastname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 95;BA.debugLine="artistToCreate.nationality = txtNationality.Text";
Debug.ShouldStop(1073741824);
_artisttocreate.setField ("_nationality" /*RemoteObject*/ ,__ref.getField(false,"_txtnationality" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 96;BA.debugLine="artistToCreate.birthDate = txtBirthDate.Text";
Debug.ShouldStop(-2147483648);
_artisttocreate.setField ("_birthdate" /*RemoteObject*/ ,__ref.getField(false,"_txtbirthdate" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 98;BA.debugLine="Wait For (artistService.Create(artistToCreate))";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistpages", "btnsave_click"), __ref.getField(false,"_artistservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artistsservice.class, "_create" /*RemoteObject*/ ,(Object)(_artisttocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_artistresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("artistResult", _artistresult);
;
 BA.debugLineNum = 99;BA.debugLine="If artistResult <> Null Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_artistresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 100;BA.debugLine="txtId.Text = artistResult.id";
Debug.ShouldStop(8);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_artistresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 103;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 107;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","714614546",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 108;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
public static void  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "artistpages","btnupdate_click", __ref); return;}
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
public ResumableSub_btnUpdate_Click(b4a.example.artistpages parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.artistpages parent;
RemoteObject _artisttoupdate = RemoteObject.declareNull("b4a.example.artist");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,66);
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
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 68;BA.debugLine="Dim artistToUpdate As Artist";
Debug.ShouldStop(8);
_artisttoupdate = RemoteObject.createNew ("b4a.example.artist");Debug.locals.put("artistToUpdate", _artisttoupdate);
 BA.debugLineNum = 70;BA.debugLine="artistToUpdate.id = txtId.Text";
Debug.ShouldStop(32);
_artisttoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 71;BA.debugLine="artistToUpdate.name = txtName.Text";
Debug.ShouldStop(64);
_artisttoupdate.setField ("_name" /*RemoteObject*/ ,__ref.getField(false,"_txtname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 72;BA.debugLine="artistToUpdate.lastName = txtLastName.Text";
Debug.ShouldStop(128);
_artisttoupdate.setField ("_lastname" /*RemoteObject*/ ,__ref.getField(false,"_txtlastname" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 73;BA.debugLine="artistToUpdate.nationality = txtNationality.Text";
Debug.ShouldStop(256);
_artisttoupdate.setField ("_nationality" /*RemoteObject*/ ,__ref.getField(false,"_txtnationality" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 74;BA.debugLine="artistToUpdate.birthDate = txtBirthDate.Text";
Debug.ShouldStop(512);
_artisttoupdate.setField ("_birthdate" /*RemoteObject*/ ,__ref.getField(false,"_txtbirthdate" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 76;BA.debugLine="Wait For (artistService.Update(txtId.Text, artis";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "artistpages", "btnupdate_click"), __ref.getField(false,"_artistservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artistsservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_artisttoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 77;BA.debugLine="If success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 80;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","714549010",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
artistpages._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",artistpages._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
artistpages._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",artistpages._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private artistService As ArtistsService";
artistpages._artistservice = RemoteObject.createNew ("b4a.example.artistsservice");__ref.setField("_artistservice",artistpages._artistservice);
 //BA.debugLineNum = 6;BA.debugLine="Private txtId As EditText";
artistpages._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",artistpages._txtid);
 //BA.debugLineNum = 7;BA.debugLine="Private txtName As EditText";
artistpages._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtname",artistpages._txtname);
 //BA.debugLineNum = 8;BA.debugLine="Private txtLastName As EditText";
artistpages._txtlastname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtlastname",artistpages._txtlastname);
 //BA.debugLineNum = 9;BA.debugLine="Private txtNationality As EditText";
artistpages._txtnationality = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnationality",artistpages._txtnationality);
 //BA.debugLineNum = 10;BA.debugLine="Private txtBirthDate As EditText";
artistpages._txtbirthdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtbirthdate",artistpages._txtbirthdate);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (artistpages) ","artistpages",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "artistpages","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="artistService.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_artistservice" /*RemoteObject*/ ).runClassMethod (b4a.example.artistsservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}