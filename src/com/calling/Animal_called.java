package com.calling;

import com.object.Animal;

public class Animal_called {
	public static void main(String[] args) {
		Animal animal = new Animal();

		String name1 = animal.name = "tommy";
		String type1 = animal.type = "Dog";
		int age1 = animal.age = 3;
		String color1 = animal.color = "Brown";
		// boolean isWild1 = animal.isWild = false;

		System.out.println("Animal Name: " + name1);
		System.out.println("Animal Type: " + type1);
		System.out.println("Age: " + age1);
		System.out.println("Color: " + color1);
		System.out.println("Is Wild: " + animal.isWild);

	}

}
