package extends1.ex3;

public class CarMain {
	public static void main(String[] args) {

	ElectricCar electricCar = new ElectricCar();
	electricCar.move();
	electricCar.charge();
	electricCar.openDoor();

	System.out.println();

	GasCar gasCar = new GasCar();
	gasCar.move();
	gasCar.charge();
	gasCar.openDoor();

	System.out.println();

	HydrogenCar hydrogenCar = new HydrogenCar();
	hydrogenCar.move();
	hydrogenCar.charge();
	hydrogenCar.openDoor();

	}
}
