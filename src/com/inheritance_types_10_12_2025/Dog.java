package com.inheritance_types_10_12_2025;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Barking...!");
	}

	public static void main(String[] args) {

		
		Dog obj = new Dog();
		
		obj.eat();
		obj.bark();
	}
}
