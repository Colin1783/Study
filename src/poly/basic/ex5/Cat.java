package poly.basic.ex5;

public class Cat implements InterfaceAnimal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}
}
