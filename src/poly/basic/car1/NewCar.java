package poly.basic.car1;

public class NewCar implements Car{
	@Override
	public void startEngine() {
		System.out.println("newCar.startEngine");
	}

	@Override
	public void offEngine() {
		System.out.println("newCar.offEngine");
	}

	@Override
	public void pressAccel() {
		System.out.println("newCar.pressAccel");
	}
}
