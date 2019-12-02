package vehicles;

public class Bus extends Vehicle {

	public Bus() {

	}

	public Bus(String name, String brand, float price, int noOfWheels, int noOfSeats) {
		super(name, brand, price, noOfWheels, noOfSeats);
	}

	@Override
	public float findPrice() {
		return (float) (price * 22.5);

	}

	@Override
	public void ignition() {
		System.out.println("Chu-Chug");

	}

	@Override
	public void drive() {
		System.out.println("Vrrrrrrrr");

	}

}
