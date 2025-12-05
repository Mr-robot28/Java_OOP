package com.constructor;

public class LibraryBook {
	String bookName;
    String author;

    LibraryBook() {
        bookName = "Unknown";
        author = "Unknown";
        display();
    }

    LibraryBook(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        display();
    }

    void display() {
        System.out.println(bookName);
        System.out.println(author);
    }
}