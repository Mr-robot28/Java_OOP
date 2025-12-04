package com.encapsulation_03_12_25;

public class Product_Info {
	 public static void main(String[] args) {

	        
	        Product p = new Product();

	      
	        p.setProductName("Laptop");
	        p.setPrice(55000);
	        p.setQuantity(2);
	        p.setBrand("HP");

	       
	        System.out.println("Product Name : " + p.getProductName());
	        System.out.println("Price        : " + p.getPrice());
	        System.out.println("Quantity     : " + p.getQuantity());
	        System.out.println("Brand        : " + p.getBrand());
	    }

}
