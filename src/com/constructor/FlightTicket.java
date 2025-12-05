package com.constructor;

public class FlightTicket {
	String name;
	String flightNo;
	String seatNo;

	FlightTicket() {
		System.out.println("-----Ticket not booked-----");
	}

	FlightTicket(String name, String flightNo, String seatNo) {
		this.name = name;
		this.flightNo = flightNo;
		this.seatNo = seatNo;
		display();
	}

	void display() {
		System.out.println("Passenger name " + name);
		System.out.println("Flight number " + flightNo);
		System.out.println("Seat number " + seatNo);
	}

}