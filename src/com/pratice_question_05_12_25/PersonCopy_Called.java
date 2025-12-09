package com.pratice_question_05_12_25;

public class PersonCopy_Called {
	  public static void main(String[] args) {
	        PersonCopy p1 = new PersonCopy("Sumedh");
	        PersonCopy p2 = new PersonCopy(p1);

	        System.out.println("Original: " + p1.name);
	        System.out.println("Copy: " + p2.name);
	    }
}