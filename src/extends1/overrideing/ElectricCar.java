package extends1.overrideing;

public class ElectricCar extends Car {
	@Override
	public void move() {
		System.out.println("전기차가 빠르게 가속합니다.");
	}

	public void charge () {
		System.out.println("전기를 충전합니다.");
	}
}