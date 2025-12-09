package com.pratice_question_05_12_25;

public class StudentMarks {
	private int marks;
	private String name;

	StudentMarks(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	String getName() {
		return name;
	}

	int getMarks() {
		return marks;
	}

	String getGrade() {
		if (marks >= 90)
			return "A";
		else if (marks >= 75)
			return "B";
		else if (marks >= 60)
			return "C";
		else
			return "D";
	}
}