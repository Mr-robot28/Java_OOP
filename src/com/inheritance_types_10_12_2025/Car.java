package com.inheritance_types_10_12_2025;

public class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car obj = new Car();   // child object

        obj.start();  // parent method
        obj.drive();  // child method
    }

}
