package poly.basic.ex3;

import org.w3c.dom.ls.LSOutput;

public class AbstractMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		cat.move();

		animalSound(dog);
		animalSound(cat);
		animalSound(cow);
	}

	private static void animalSound(AbstractAnimal animal) {
		System.out.println("동물 소리");
		animal.sound();
		System.out.println("종료");
	}
}
