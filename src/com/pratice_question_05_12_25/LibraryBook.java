package com.pratice_question_05_12_25;

public class LibraryBook {
	private int bookId;
	private String title;
	private String author;

	LibraryBook(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	int getBookId() {
		return bookId;
	}

	String getTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	void display() {
		System.out.println(bookId + " - " + title + " - " + author);
	}
}