package com.vehicle.calling;

import com.vehicle.details.Vehicle;

public class VehicleCaller {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		String brand1 = vehicle.brand = "BMW";
        String model1 = vehicle.model = "X5";
        String type1 = vehicle.type = "SUV";
        int year1 = vehicle.year = 2023;
        String fuel1 = vehicle.fuelType = "Diesel";
        double mileage1 = vehicle.mileage = 15.8;
        double price1 = vehicle.price = 8200000.00;
        String color1 = vehicle.color = "Black";
        int seat1 = vehicle.seatingCapacity = 7;
        boolean electric1 = vehicle.isElectric = false;

        System.out.println("Brand: " +brand1 );
        System.out.println("Model: " + model1);
        System.out.println("Type: " + type1);
        System.out.println("Year: " +year1 );
        System.out.println("Fuel Type: " + fuel1);
        System.out.println("Mileage: " +mileage1 );
        System.out.println("Price: " + price1);
        System.out.println("Color: " + color1);
        System.out.println("Seating Capacity: " +seat1 );
        System.out.println("Is Electric: " + electric1);
    
	}

}
