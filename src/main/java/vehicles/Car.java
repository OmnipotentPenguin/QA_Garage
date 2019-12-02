package vehicles;

import interfaces.Turbo;

public class Car extends Vehicle implements Turbo {

	int bootSize;

	public Car() {

	}

	public Car(String name, String brand, float price, int noOfWheels, int noOfSeats, int bootSize) {
		super(name, brand, price, noOfWheels, noOfSeats);
		this.bootSize = bootSize;
	}

	@Override
	public float findPrice() {
		return (float) (price * 1.25);

	}

	@Override
	public void ignition() {
		System.out.println("#Ch-Ch-Vrrrrr#");

	}

	@Override
	public void drive() {
		System.out.println("Vrooooom");

	}

	public void activateTurbo() {
		System.out.println("VROOOOOOM");

	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

}
