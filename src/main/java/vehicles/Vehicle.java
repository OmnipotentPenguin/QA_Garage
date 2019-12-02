package vehicles;

public abstract class Vehicle {

	String name;
	String brand;
	float price;

	int noOfWheels;
	int noOfSeats;

	public abstract float findPrice();

	abstract void ignition();

	abstract void drive();

	public void crash() {
		System.out.println("#Bang!#");
	};

	public Vehicle() {
	}

	public Vehicle(String name, String brand, float price, int noOfWheels, int noOfSeats) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}