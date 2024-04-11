package ref;

public class MethodChange1 {
	public static void main(String[] args) {
		int a = 15;
		System.out.println("메소드 호출 전: a = " + a);
		changePrimitive(a);
		System.out.println("메소드 호출 후: a = " + a);
	}

	static void changePrimitive (int a) {
		a = 20;
	}
}
