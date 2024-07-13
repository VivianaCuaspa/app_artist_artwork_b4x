
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class artworkpages {
    public static RemoteObject myClass;
	public artworkpages() {
	}
    public static PCBA staticBA = new PCBA(null, artworkpages.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _artworkservice = RemoteObject.declareNull("b4a.example.artworksservice");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpublicationyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttechnique = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdescription = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"artworkService",_ref.getField(false, "_artworkservice"),"Root",_ref.getField(false, "_root"),"txtDescription",_ref.getField(false, "_txtdescription"),"txtId",_ref.getField(false, "_txtid"),"txtName",_ref.getField(false, "_txtname"),"txtPublicationYear",_ref.getField(false, "_txtpublicationyear"),"txtTechnique",_ref.getField(false, "_txttechnique"),"xui",_ref.getField(false, "_xui")};
}
}