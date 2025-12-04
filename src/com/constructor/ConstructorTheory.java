package com.constructor;

public class ConstructorTheory {

	public static void main(String[] args) {

		// -----------------------------
		// What is a Constructor?
		// -----------------------------
		System.out.println("Constructor :");
		System.out.println("A constructor is a special method in Java that is used to initialize objects.");
		System.out.println("Whenever you create an object using new, the constructor gets executed automatically.\n");

		// -----------------------------
		// Rules of Constructor
		// -----------------------------
		System.out.println("Constructor Rules:");
		System.out.println("1. Constructor name must be same as class name");
		System.out.println("2. Constructor does not have any return type (not even void)");
		System.out.println("3. Constructor is executed automatically at object creation time");
		System.out.println("4. Every class has a constructor");
		System.out.println("5. If you don’t write any constructor, Java provides a default constructor");
		System.out.println("6. Constructors are used to initialize variables\n");

		// -----------------------------
		// Constructor Syntax
		// -----------------------------
		System.out.println("Syntax of Constructor:");
		System.out.println("ClassName() {");
		System.out.println("    // initialization");
		System.out.println("}\n");

		// -----------------------------
		// Default Constructor
		// -----------------------------
		System.out.println("(1) Default Constructor (Non-Parameterized):");
		System.out.println("Provided automatically by Java if you don’t write any constructor.");
		System.out.println("Does not take any parameters.");
		System.out.println("Initializes values to default (0, null, etc.).\n");

		// -----------------------------
		// Parameterized Constructor
		// -----------------------------
		System.out.println("(2) Parameterized Constructor:");
		System.out.println("A constructor that accepts parameters.");
		System.out.println("Used to give custom values to objects.");
		System.out.println("Syntax:");
		System.out.println("ClassName(type var1, type var2) {");
		System.out.println("// initialization");
		System.out.println("}\n");

		// -----------------------------
		// Difference Between Method and Constructor
		// -----------------------------
		System.out.println("Difference Between Method & Constructor:\n");

		System.out.println("Constructor vs Method:");
		System.out.println("1. Constructor → Initializes object        | Method → Performs actions");
		System.out.println("2. Constructor name = class name           | Method → any name allowed");
		System.out.println("3. No return type                          | Method → must have return type");
		System.out.println("4. Called automatically                    | Method → called manually ");
	}
}
