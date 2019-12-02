package main;

import garage.Garage;
import vehicles.*;

public class App {

	public static void main(String[] args) {

		Garage g = new Garage();
		g.addVehicle(new Car());
		g.addVehicle(new Bus());

		g.printVehicles();
	}

}
