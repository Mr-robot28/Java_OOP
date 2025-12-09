package com.pratice_question_05_12_25;

public class Mobile_Called {
	 public static void main(String[] args) {
	        Mobile m = new Mobile("Samsung S25Ultra", 130000);

	        System.out.println("Model: " + m.getModel());
	        System.out.println("Original Price: " + m.getPrice());
	        System.out.println("Discounted Price: " + m.discount());
	    }
}