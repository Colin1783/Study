package static2.ex;

public class Car {
	String model;
	static int carAmount;

	public Car(String model) {
		System.out.println(STR."차량 구입, 이름: \{model}");
		this.model = model;
		carAmount++;
	}

	public static void showTotalCars() {
		System.out.println(STR."구매한 차량 수: \{carAmount}");
	}


}
