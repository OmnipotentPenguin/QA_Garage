package garage;

import java.util.ArrayList;
import java.util.List;
import vehicles.Vehicle;

public class Garage {

	List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Garage() {

	}

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}

	public void removeVehiclesByType(Class<?> removedClass) {
		List<Vehicle> toRemove = new ArrayList<Vehicle>();
		for (Vehicle v : vehicles) {
			if (v.getClass() == removedClass) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	public void printVehicles() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}

	public void calcPrice() {
		float totalPrice = 0;
		for (Vehicle v : vehicles) {
			totalPrice += v.findPrice();
		}
		System.out.println("Total price is: " + totalPrice);
	}

}
