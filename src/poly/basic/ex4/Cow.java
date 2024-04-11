package poly.basic.ex4;

public class Cow extends AbstractAnimal {
	public void sound () {
		System.out.println("음메");
	}

	@Override
	public void move() {
		System.out.println("소 이동");
	}
}
