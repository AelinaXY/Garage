package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		List<Billable> billableList = new ArrayList<Billable>();

		billableList.add(new Car(4, "Black"));
		billableList.add(new Boat(0, "Blue"));
		billableList.add(new Bike(2, "Red"));
		billableList.add(new Employee("Test1", 12, "Vibin"));
		billableList.add(new Employee("Test2", 85, "Groovin"));
		billableList.add(new Employee("Test3", 51908, "Movin"));

		for (Billable i : billableList) {
			System.out.println("Cost of Bill is: " + i.calcBill() + "| I am " + i.toString());
		}

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);
	}

}
