package com.inheritance_types_10_12_2025;
public class Child2 extends Parent2 {
    void c2() {
        System.out.println("Child2 method");
    }

    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.p();
        obj1.c1();

        Child2 obj2 = new Child2();
		obj2.p();
        obj2.c2();
    }
}