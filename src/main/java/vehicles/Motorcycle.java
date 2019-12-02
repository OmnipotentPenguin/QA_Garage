package vehicles;

import interfaces.Turbo;

public class Motorcycle extends Vehicle implements Turbo {

	public Motorcycle() {
	}

	public Motorcycle(String name, String brand, float price, int noOfWheels, int noOfSeats, int bootSize) {
		super(name, brand, price, noOfWheels, noOfSeats);
	}

	@Override
	public float findPrice() {
		return (float) (price * 12.5);

	}

	@Override
	public void ignition() {
		System.out.println("vrrrRRREEEEEE");

	}

	@Override
	public void drive() {
		System.out.println("Nnnyeaawww");

	}

	public void activateTurbo() {
		System.out.println("NNNYEAAWWW");

	}

}
