package com.Introduction_25_11_2025;

public class PersonalInfo {

	String firstName;
    String lastName;
    int age;
    String gender;
    String phone;
    String email;
    String address;
    String city;
    String state;
    String country;



    public static void main(String[] args) {

        PersonalInfo p = new PersonalInfo();

        p.firstName = "Sumedh";
        p.lastName = "Hajare";
        p.age = 23;
        p.gender = "Male";
        p.phone = "9130609707";
        p.email = "hajaresumedh90@gmail.com";
        p.address = "Dudulgaon";
        p.city = "Pune";
        p.state = "Maharashtra";
        p.country = "India";

        System.out.println("First Name : " + p.firstName);
        System.out.println("Last Name  : " + p.lastName);
        System.out.println("Age        : " + p.age);
        System.out.println("Gender     : " + p.gender);
        System.out.println("Phone      : " + p.phone);
        System.out.println("Email      : " + p.email);
        System.out.println("Address    : " + p.address);
        System.out.println("City       : " + p.city);
        System.out.println("State      : " + p.state);
        System.out.println("Country    : " + p.country);
    }
}
