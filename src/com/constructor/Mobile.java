package com.constructor;

public class Mobile {
	 String brand;
	    String model;
	    double price;

	    Mobile(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	        display();
	    }

	    void display() {
	        System.out.println(brand);
	        System.out.println(model);
	        System.out.println(price);
	    }

}