package com.constructor;

public class Laptop {
	String brand;
    int ram;
    int storage;
    double price;

    Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        display();
    }

    void display() {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(storage);
        System.out.println(price);

        if (price > 50000)
            System.out.println("High-end laptop");
        else
            System.out.println("Budget laptop");
    }
}