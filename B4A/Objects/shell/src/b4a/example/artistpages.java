
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class artistpages {
    public static RemoteObject myClass;
	public artistpages() {
	}
    public static PCBA staticBA = new PCBA(null, artistpages.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _artistservice = RemoteObject.declareNull("b4a.example.artistsservice");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtlastname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnationality = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtbirthdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"artistService",_ref.getField(false, "_artistservice"),"Root",_ref.getField(false, "_root"),"txtBirthDate",_ref.getField(false, "_txtbirthdate"),"txtId",_ref.getField(false, "_txtid"),"txtLastName",_ref.getField(false, "_txtlastname"),"txtName",_ref.getField(false, "_txtname"),"txtNationality",_ref.getField(false, "_txtnationality"),"xui",_ref.getField(false, "_xui")};
}
}