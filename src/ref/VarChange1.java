package ref;

public class VarChange1 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;

		System.out.println(STR."a = \{a}");
		System.out.println(STR."b = \{b}");

		a = 20;
		System.out.println(STR."changed a = \{a}");
		System.out.println(STR."a = \{a}");
		System.out.println(STR."b = \{b}");

		b = 30;
		System.out.println(STR."changed b = \{b}");
		System.out.println(STR."a = \{a}");
		System.out.println(STR."b = \{b}");
	}
}
