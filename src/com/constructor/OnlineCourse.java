package com.constructor;

public class OnlineCourse {
	int courseId;
    String courseName;
    String instructor;
    double fees;

    OnlineCourse(int courseId, String courseName, String instructor, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.fees = fees;
        display();
    }

    void display() {
        System.out.println(courseId);
        System.out.println(courseName);
        System.out.println(instructor);
        System.out.println(fees);
    }

}