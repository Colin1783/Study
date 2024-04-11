package poly.basic.ex4;

public class Dog extends AbstractAnimal {
	public void sound () {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("개 이동");
	}
}
