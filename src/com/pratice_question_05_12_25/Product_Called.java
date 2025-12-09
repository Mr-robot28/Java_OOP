package com.pratice_question_05_12_25;

public class Product_Called {
	  public static void main(String[] args) {
	        Product p = new Product();
	        p.setPrice(1000);
	        p.setDiscount(10);

	        System.out.println("Final Price: " + p.getFinalPrice());
	    }
}