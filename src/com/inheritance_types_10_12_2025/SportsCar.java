package com.inheritance_types_10_12_2025;
public class SportsCar extends Muilt_Car {
    void message() {
        System.out.println("SportsCar message");
    }

    public static void main(String[] args) {
        SportsCar obj = new SportsCar();

        obj.message();       
        ((Muilt_Car)obj).message();
        ((Muilt_Vehicle)obj).message(); 
    }
}
