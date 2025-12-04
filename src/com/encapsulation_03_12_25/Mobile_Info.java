package com.encapsulation_03_12_25;

public class Mobile_Info {

	public static void main(String[] args) {

		Mobile m = new Mobile();

		m.setBrand("Samsung");
		m.setModel("Galaxy S22");
		m.setPrice(69999);
		m.setStorage(128);

		System.out.println("Brand   : " + m.getBrand());
		System.out.println("Model   : " + m.getModel());
		System.out.println("Price   : " + m.getPrice());
		System.out.println("Storage : " + m.getStorage() + "GB");
	}
}
