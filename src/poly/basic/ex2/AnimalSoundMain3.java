package poly.basic.ex2;

public class AnimalSoundMain3 {
	public static void main(String[] args) {
		Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};

		for (Animal animal : animalArr) {
			soundAnimal(animal);
		}
	}

	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트");
		animal.sound();
		System.out.println("테스트 종료");
	}
}


