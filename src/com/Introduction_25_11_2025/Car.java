package com.Introduction_25_11_2025;

public class Car {

	String model;
	double price;
	String color;
	String brand;
	int year;
	String fuelType;
	double engineCapacity;
	String transmission;
	int seatingCapacity;
	double mileage;

	public static void main(String[] args) {

		Car c = new Car();

		c.model = "BMW X5";
		c.price = 7500000;
		c.color = "Black";
		c.brand = "BMW";
		c.year = 2024;
		c.fuelType = "Petrol";
		c.engineCapacity = 3.0; // in Liters
		c.transmission = "Automatic";
		c.seatingCapacity = 5;
		c.mileage = 12.5;

		System.out.println("Car Model         : " + c.model);
		System.out.println("Price             : ₹" + c.price);
		System.out.println("Color             : " + c.color);
		System.out.println("Brand             : " + c.brand);
		System.out.println("Year              : " + c.year);
		System.out.println("Fuel Type         : " + c.fuelType);
		System.out.println("Engine Capacity   : " + c.engineCapacity + " L");
		System.out.println("Transmission      : " + c.transmission);
		System.out.println("Seating Capacity  : " + c.seatingCapacity);
		System.out.println("Mileage           : " + c.mileage + " km/l");
	}
}
