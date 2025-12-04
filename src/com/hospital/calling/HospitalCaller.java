package com.hospital.calling;

import com.hospital.details.Hospital;

public class HospitalCaller {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		String name1 = hospital.hospitalName = "City Care Hospital";
		String loc1 = hospital.location = "Baner, Pune";
		int doc1 = hospital.totalDoctors = 85;
		int nurse1 = hospital.totalNurses = 150;
		int beds1 = hospital.totalBeds = 300;
		String spec1 = hospital.specialization = "Multi-Speciality";
		boolean gov1 = hospital.isGovernment = false;
		double rate1 = hospital.rating = 4.6;
		String headDoc1 = hospital.headDoctor = "Dr. Neha Kulkarni";
		int year1 = hospital.establishedYear = 1998;

		System.out.println("Hospital Name: " + name1);
		System.out.println("Location: " + loc1);
		System.out.println("Total Doctors: " + doc1);
		System.out.println("Total Nurses: " + nurse1);
		System.out.println("Total Beds: " + beds1);
		System.out.println("Specialization: " + spec1);
		System.out.println("Is Government: " + gov1);
		System.out.println("Rating: " + rate1);
		System.out.println("Head Doctor: " + headDoc1);
		System.out.println("Established Year: " + year1);
	}

}
