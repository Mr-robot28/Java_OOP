package com.inheritance_types_10_12_2025;

public class Muilt_Dog extends Muilt_Animal {
    void bark() {
        System.out.println("I bark");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();

       
        obj.eat();   
        obj.bark(); 
        
    }
}

