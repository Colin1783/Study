package poly.basic.ex4;

public class Cat extends AbstractAnimal {
	public void sound () {
		System.out.println("야옹");
	}

	@Override
	public void move() {
		System.out.println("고양이 이동");
	}

}
