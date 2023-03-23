package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

		VehicleCage<Car> newCage = new VehicleCage();
		newCage.setVehicle(new Car(4, "Black"));

		g.addVehicle(newCage.getVehicle());
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

//		try {
//			g.findByID(15);
//		} catch (VehicleNotFoundException e) {
//			System.out.println("EXCEPTION: ID not found");
//		}
		int searchId = 0;
		Scanner scan = new Scanner(System.in);

		while (searchId != -1) {
			try {
				System.out.println("Enter ID to search for (-1 to exit): ");
				searchId = scan.nextInt();
				if (searchId == -1) {
					break;
				}
				System.out.println(searchId);
				System.out.println(g.findByID(searchId).toString());
			} catch (VehicleNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Invalid input");
				e.printStackTrace();
			}
		}
		scan.close();

		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);
	}

}
