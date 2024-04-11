package poly.basic.car1;

public class Driver {
	private Car car;

	public void setCar(Car car) {
		System.out.println(car.getClass().getSimpleName() + "를 샀습니다.");
		this.car = car;
	}

	public void drive()
	{
		System.out.println("자동차를 운전합니다.");
		car.startEngine();
		car.pressAccel();
		car.offEngine();
	}
}
