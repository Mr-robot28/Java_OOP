package com.Introduction_25_11_2025;

public class Library {

	String libraryName;
	String location;
	int totalBooks;
	int totalStaff;
	String librarianName;
	String openingTime;
	String closingTime;
	boolean digitalLibraryAvailable;
	int seatingCapacity;
	String contactNumber;

	public static void main(String[] args) {

		Library lib = new Library();

		lib.libraryName = "City Central Library";
		lib.location = "Pune";
		lib.totalBooks = 50000;
		lib.totalStaff = 25;
		lib.librarianName = "Mr. Sumedh Hajare";
		lib.openingTime = "9:00 AM";
		lib.closingTime = "8:00 PM";
		lib.digitalLibraryAvailable = true;
		lib.seatingCapacity = 200;
		lib.contactNumber = "9876543210";

		System.out.println("Library Name            : " + lib.libraryName);
		System.out.println("Location                : " + lib.location);
		System.out.println("Total Books             : " + lib.totalBooks);
		System.out.println("Total Staff             : " + lib.totalStaff);
		System.out.println("Librarian Name          : " + lib.librarianName);
		System.out.println("Opening Time            : " + lib.openingTime);
		System.out.println("Closing Time            : " + lib.closingTime);
		System.out.println("Digital Library         : " + lib.digitalLibraryAvailable);
		System.out.println("Seating Capacity        : " + lib.seatingCapacity);
		System.out.println("Contact Number          : " + lib.contactNumber);
	}

}
