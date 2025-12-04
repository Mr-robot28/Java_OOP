package com.Introduction_25_11_2025;

public class Theroy {

	public static void main(String[] args) {

		// -----------------------------------------------
		// 1. Introduction to OOP (Object-Oriented Programming)
		// -----------------------------------------------
		// OOP is a programming paradigm based on the concept of objects.
		// It helps developers structure programs by modeling real-world entities.
		// OOP focuses on:
		// - Data (variables)
		// - Behavior (methods/functions)

		System.out.println("1. Introduction to OOP (Object-Oriented Programming)");
		System.out.println("OOP is a programming paradigm based on objects.");
		System.out.println("It models real-world entities using:");
		System.out.println("• Data (variables)");
		System.out.println("• Behavior (methods)\n");

		// -----------------------------------------------
		// 2. Class
		// -----------------------------------------------
		// A class is a blueprint/template for creating objects.
		// It defines properties (variables) and behaviors (methods).
		//
		// Characteristics of a Class:
		// - It is a logical structure, not physical.
		// - It does NOT occupy memory until an object is created.
		// - It contains:
		// • Variables (fields)
		// • Methods (functions)

		System.out.println("2. Class:");
		System.out.println("A class is a blueprint/template for creating objects.");
		System.out.println("It defines variables (data) and methods (behavior).");
		System.out.println("Characteristics:");
		System.out.println("• Class is logical, does not occupy memory.");
		System.out.println("• Contains variables and methods.\n");

		// -----------------------------------------------
		// 3. Object
		// -----------------------------------------------
		// An object is an instance of a class.
		// It has:
		// - State (data)
		// - Behavior (methods)
		//
		// Characteristics of an Object:
		// - It occupies memory.
		// - Represents real-world entities like student, car, laptop, etc.
		// - Created using the 'new' keyword.

		System.out.println("3. Object:");
		System.out.println("An object is an instance of a class.");
		System.out.println("It has state (variables) and behavior (methods).");
		System.out.println("Characteristics:");
		System.out.println("• Object occupies memory.");
		System.out.println("• Represents a real-world entity.");
		System.out.println("• Created using new keyword.\n");

		// -----------------------------------------------
		// Object Creation Example
		// -----------------------------------------------
		// Syntax:
		// ClassName reference = new ClassName();
		//
		// Example:
		// Student s = new Student();
		//
		// 's' → reference variable (stored in Stack)
		// new Student() → object created in Heap
		// reference variable points to the object in heap

		System.out.println("Object Creation Syntax:");
		System.out.println("ClassName ref = new ClassName();");
		System.out.println("Example: Student s = new Student();");
		System.out.println("• 's' is reference variable (Stack)");
		System.out.println("• new Student() creates object (Heap)");
		System.out.println("• Reference variable points to Heap object\n");

		// -----------------------------------------------
		// Key Points Summary
		// -----------------------------------------------
		// - A class is a design; an object is the real product.
		// - Class does not occupy memory; object does.
		// - Objects are created using new keyword.
		// - Dot operator '.' is used to access members.
		// - Multiple objects can be created from one class.

		System.out.println("Key Points:");
		System.out.println("• Class = Design, Object = Real product.");
		System.out.println("• Class does NOT occupy memory, object DOES.");
		System.out.println("• Use 'new' keyword to create objects.");
		System.out.println("• '.' operator is used to access object members.");
		System.out.println("• Multiple objects can be created from one class.");

	}
}
