package poly.basic.ex5;

public class Cow implements InterfaceAnimal{
	@Override
	public void sound() {
		System.out.println("음메");
	}

	@Override
	public void move() {
		System.out.println("터벅터벅");
	}
}
