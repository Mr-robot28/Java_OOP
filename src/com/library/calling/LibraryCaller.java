package com.library.calling;

import com.library.details.Library;

public class LibraryCaller {
	public static void main(String[] args) {
		Library lib = new Library();
		 String name1 = lib.libraryName = "Central City Library";
	        String loc1 = lib.location = "Sector 12, Mumbai";
	        int books1 = lib.totalBooks = 45000;
	        String librarian1 = lib.librarianName = "Mrs. Kavita Sharma";
	        boolean public1 = lib.isPublic = true;

	        System.out.println("Library Name: " +name1);
	        System.out.println("Location: " + loc1);
	        System.out.println("Total Books: " + books1);
	        System.out.println("Librarian Name: " + librarian1);
	        System.out.println("Is Public: " + public1);
	    
	}

}
