package com.inheritance_types_10_12_2025;
public class Teacher extends Person {
    public String subject = "Maths";

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.rollNo);

        Teacher t = new Teacher();
        System.out.println(t.name);
        System.out.println(t.subject);
    }
}