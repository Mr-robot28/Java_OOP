package com.constructor;

public class Order {
	 int orderId;
	    String product;
	    int quantity;
	    double price;

	    Order(int orderId, String product, int quantity, double price) {
	        this.orderId = orderId;
	        this.product = product;
	        this.quantity = quantity;
	        this.price = price;
	        display();
	    }

	    void display() {
	        System.out.println(orderId);
	        System.out.println(product);
	        System.out.println(quantity);
	        System.out.println(price);
	        System.out.println("Total Amount: " + (quantity * price));
	    }
}