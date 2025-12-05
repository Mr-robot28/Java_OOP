package com.constructor;

public class HotelRoom {
	int roomNumber;
	String roomType;
	double pricePerNight;

	HotelRoom(int roomNumber, String roomType, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.display();

	}

     void display() {
    	 System.out.println("The Room number is " + roomNumber);
    	 System.out.println("The Room tyoe is " + roomType);
    	 System.out.println("The price per night for the room is " + pricePerNight);
    	 
     }
	
}