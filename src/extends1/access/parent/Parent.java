package extends1.access.parent;

public class Parent {
	public int publicValue;
	protected int protectedValue;
	int defaultValue;
	private int privateValue;

	public void publicMethod (){
		System.out.println("publicMethod 실행");
	}

	protected void protectedMethod() {
		System.out.println("protectedMethod 실행");
	}

	void defaultMethod() {
		System.out.println("defaultMethod 실행");
	}
	private void privateMethod() {
		System.out.println("privateMethod 실행");
	}

	public void printParent () {
		System.out.println("Parent 메서드 안");
		System.out.println("publicValue =" + publicValue);
		System.out.println("protectedValue = " + protectedValue);
		System.out.println("defaultValue = " + defaultValue);
		System.out.println("privateValue = " + privateValue);

		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
	}
}
