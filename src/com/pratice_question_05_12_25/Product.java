package com.pratice_question_05_12_25;

public class Product {
	private double price;
    private double discount;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }
}