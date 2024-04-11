package poly.basic.ex2;

public class AnimalSoundMain2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		Animal [] animalArr = {dog, cat, cow};

		for (Animal animal : animalArr) {
			System.out.println("동물 소리 테스트");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
		}
	}
}


