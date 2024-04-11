package access.b;

import access.a.AccessData;

public class AccessOuterMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();
		data.publicField = 2;
		data.publicMethod();

//		data.defaultField = 3;
//		data.defaultMethod();
//
//		data.privateField = 4;
//		data.privateMethod();

		data.innerAccess();
	}

}
