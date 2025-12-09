package com.pratice_question_05_12_25;

public class LibraryBook_Called {
	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook(101, "Java Basics", "James");
		LibraryBook b2 = new LibraryBook(102, "OOP Concepts", "Dennis");
		LibraryBook b3 = new LibraryBook(103, "DSA Guide", "Mark");

		b1.display();
		b2.display();
		b3.display();
	}
}