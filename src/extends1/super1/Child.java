package extends1.super1;

public class Child extends Parent{
	public String value = "child";

	@Override
	public void hello() {
		System.out.println("hello child");
	}

	public void call() {
		System.out.println("value = " + value);
		System.out.println("super.value= " + super.value);
		hello();
		super.hello();

	}
}
