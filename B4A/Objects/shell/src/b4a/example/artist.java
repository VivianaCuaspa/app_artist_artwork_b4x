
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class artist {
    public static RemoteObject myClass;
	public artist() {
	}
    public static PCBA staticBA = new PCBA(null, artist.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _lastname = RemoteObject.createImmutable("");
public static RemoteObject _nationality = RemoteObject.createImmutable("");
public static RemoteObject _birthdate = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"birthDate",_ref.getField(false, "_birthdate"),"id",_ref.getField(false, "_id"),"lastName",_ref.getField(false, "_lastname"),"name",_ref.getField(false, "_name"),"nationality",_ref.getField(false, "_nationality")};
}
}