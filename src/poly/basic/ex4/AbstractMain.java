package poly.basic.ex4;

public class AbstractMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		cat.move();

		animalSound(dog);
		animalSound(cat);
		animalSound(cow);

		animalMove(dog);
		animalMove(cat);
		animalMove(cow );
	}

	private static void animalSound(AbstractAnimal animal) {
		System.out.println("동물 소리");
		animal.sound();
		System.out.println("종료");
	}

	private static void animalMove(AbstractAnimal animal) {
		System.out.println("동물 이동");
		animal.move();
		System.out.println("이동 종료");
	}
}
