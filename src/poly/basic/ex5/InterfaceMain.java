package poly.basic.ex5;

public class InterfaceMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();

		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);
	}

	private static void soundAnimal(InterfaceAnimal animal) {
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 테스트 종료");
	}
}
