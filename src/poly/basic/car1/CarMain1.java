package poly.basic.car1;

public class CarMain1 {
	public static void main(String[] args) {

		Driver driver = new Driver();

		driver.setCar(new K3Car());
		driver.drive();

		System.out.println();

		driver.setCar(new Model3Car());
	  driver.drive();

		System.out.println();

		driver.setCar(new NewCar());
		driver.drive();
	}
}
