package com.Introduction_25_11_2025;

public class Laptop {

	String brand;
	int ram;
	String processor;
	int storage;
	String gpu;
	double price;
	String color;
	double screenSize;
	String operatingSystem;
	int batteryBackup;

	public static void main(String[] args) {

		Laptop l1 = new Laptop();

		l1.brand = "Dell";
		l1.ram = 16;
		l1.processor = "Intel i7";
		l1.storage = 512;
		l1.gpu = "NVIDIA GTX 1650";
		l1.price = 85000.50;
		l1.color = "Black";
		l1.screenSize = 15.6;
		l1.operatingSystem = "Windows 11";
		l1.batteryBackup = 8;

		System.out.println("Laptop Brand        : " + l1.brand);
		System.out.println("Laptop RAM          : " + l1.ram + " GB");
		System.out.println("Processor           : " + l1.processor);
		System.out.println("Storage             : " + l1.storage + " GB SSD");
		System.out.println("Graphics Card       : " + l1.gpu);
		System.out.println("Price               : ₹" + l1.price);
		System.out.println("Color               : " + l1.color);
		System.out.println("Screen Size         : " + l1.screenSize + " inches");
		System.out.println("Operating System    : " + l1.operatingSystem);
		System.out.println("Battery Backup      : " + l1.batteryBackup + " hours");

	}

}
