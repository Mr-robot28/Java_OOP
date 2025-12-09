package com.pratice_question_05_12_25;

public class Mobile {
	private String model;
	private double price;

	Mobile(String model, double price) {
		this.model = model;
		this.price = price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	double discount() {
		return price - (price * 0.10); // 10% off
	}
}