
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class artwork {
    public static RemoteObject myClass;
	public artwork() {
	}
    public static PCBA staticBA = new PCBA(null, artwork.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _publicationyear = RemoteObject.createImmutable("");
public static RemoteObject _technique = RemoteObject.createImmutable("");
public static RemoteObject _description = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"description",_ref.getField(false, "_description"),"id",_ref.getField(false, "_id"),"name",_ref.getField(false, "_name"),"publicationYear",_ref.getField(false, "_publicationyear"),"technique",_ref.getField(false, "_technique")};
}
}