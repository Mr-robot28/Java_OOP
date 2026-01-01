package com.inheritance_8_12_2025;

public class UserTransport {
	public static void main(String[] args) {

		Uber u = new Uber();

		u.register();
		u.login();
		u.bookRide();
		u.shareLocation();
		u.driverDetails();
	}
}