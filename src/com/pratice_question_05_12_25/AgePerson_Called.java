package com.pratice_question_05_12_25;

public class AgePerson_Called {
	  public static void main(String[] args) {
	        AgePerson p1 = new AgePerson();
	        AgePerson p2 = new AgePerson(25);

	        System.out.println("Default Age: " + p1.age);
	        System.out.println("Given Age: " + p2.age);
	    }
}