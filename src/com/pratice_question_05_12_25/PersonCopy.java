package com.pratice_question_05_12_25;

public class PersonCopy {
	String name;

    PersonCopy(String name) {
        this.name = name;
    }

    PersonCopy(PersonCopy p) {
        this.name = p.name;
    }
}