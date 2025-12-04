package com.Introduction_25_11_2025;

public class Book {

	String title;
	String author;
	double price;

	public static void main(String[] args) {

		Book b = new Book();

		b.title = "Atomic Habits";
		b.author = "James Clear";
		b.price = 550;

		System.out.println("Book Title  : " + b.title);
		System.out.println("Author      : " + b.author);
		System.out.println("Price       : ₹" + b.price);

	}
}
