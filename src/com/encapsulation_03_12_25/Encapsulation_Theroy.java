package com.encapsulation_03_12_25;

public class Encapsulation_Theroy {

	
	public static void main(String[] args) {
		
		
		    

		        System.out.println("What is Encapsulation?");
		        System.out.println("Encapsulation is a process of binding data (variables) and methods (functions) into a single unit (class)");
		        System.out.println("and controlling access to the data using access modifiers.");
		        System.out.println("✔ Data Hiding");
		        System.out.println("✔ Data Security");
		        System.out.println("✔ Controlled Access");
		        System.out.println("✔ Achieved by Private Variables + Public Getters/Setters");
		        System.out.println("Real life example : Medicine Capsule\n");

		        System.out.println("Why Encapsulation:");
		        System.out.println("• To hide sensitive data from outside world");
		        System.out.println("• To protect data from unauthorized access");
		        System.out.println("• To provide a controlled way to access/modify data");
		        System.out.println("• Reduces error – improves security");
		        System.out.println("• Helps in writing clean, maintainable code\n");

		        System.out.println("How Encapsulation Works?");
		        System.out.println("Encapsulation = Private variables + Public getters & setters");
		        System.out.println("private → restricts direct access");
		        System.out.println("getter() → returns value");
		        System.out.println("setter() → sets value with validation\n");

		        System.out.println("Syntax Example:");
		        System.out.println("class ClassName {");
		        System.out.println("    private datatype variableName;");
		        System.out.println("    public datatype getVariableName() { return variableName; }");
		        System.out.println("    public void setVariableName(datatype variableName) { this.variableName = variableName; }");
		        System.out.println("}\n");

		        System.out.println("Advantages of Encapsulation:");
		        System.out.println("✔ Data hiding → secure data");
		        System.out.println("✔ Code flexibility → getter/setter control access");
		        System.out.println("✔ Improved maintainability");
		        System.out.println("✔ Better security");
		        System.out.println("✔ Easy debugging and testing\n");

		        System.out.println("Note: Encapsulation is a technique in Java where we make variables private and provide");
		        System.out.println("public getter and setter methods to access and modify them safely.");
		    
		


		/*
		-------------------------------------------
		    THEORY IN COMMENTS  
		-------------------------------------------

		What is Encapsulation?
		Encapsulation is a process of binding data (variables) and methods (functions) 
		into a single unit (class) and controlling access to the data using access modifiers.

		✔ Data Hiding
		✔ Data Security
		✔ Controlled Access
		✔ Achieved by Private Variables + Public Getters/Setters

		Real life example : Medicine Capsule


		Why Encapsulation?
		• To hide sensitive data from outside world
		• To protect data from unauthorized access
		• To provide a controlled way to access/modify data
		• Reduces error – improves security
		• Helps in writing clean, maintainable code


		How Encapsulation Works?
		Encapsulation = private variables + public getters & setters

		private → restricts direct access
		getter() → only returns value
		setter() → sets value with validation (business logic)


		Syntax:

		class ClassName {
		    private datatype variableName;
		    public datatype getVariableName() { return variableName; }
		    public void setVariableName(datatype variableName) { this.variableName = variableName; }
		}

		Advantages:
		✔ Data hiding → Secure data
		✔ Code flexibility → getter/setter control access
		✔ Improved maintainability
		✔ Better security
		✔ Easy debugging and testing

		Note:
		Encapsulation is a technique in Java where we make variables private and 
		provide public getter and setter methods to access and modify them safely.
		*/

	}
}
