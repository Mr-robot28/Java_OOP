package com.constructor;

public class Vehicle {
	 String type;
	    String brand;
	    double mileage;

	    Vehicle() {
	        System.out.println("Vehicle object created");
	    }

	    Vehicle(String type, String brand, double mileage) {
	        this.type = type;
	        this.brand = brand;
	        this.mileage = mileage;
	        display();
	    }

	    void display() {
	        System.out.println(type);
	        System.out.println(brand);
	        System.out.println(mileage);
	    }
}