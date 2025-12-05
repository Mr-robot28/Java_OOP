package com.constructor;

public class Movie {
	String name;
    int duration;
    double rating;

    Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        display();
    }

    void display() {
        System.out.println(name);
        System.out.println(duration);
        System.out.println(rating);
    }
}