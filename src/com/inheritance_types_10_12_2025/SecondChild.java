package com.inheritance_types_10_12_2025;
public class SecondChild extends BaseClass {
    void m3() {
        System.out.println("Method m3 from SecondChild");
    }

    public static void main(String[] args) {
        FirstChild obj1 = new FirstChild();
        obj1.m1();
        obj1.m2();

        SecondChild obj2 = new SecondChild();
        obj2.m1();
        obj2.m3();
    }
}
