package com.inheritance_types_10_12_2025;
public class Z extends Y {
    int c = 30;

    void display() {
        System.out.println(a); // from X
        System.out.println(b); // from Y
        System.out.println(c); // from Z
    }

    public static void main(String[] args) {
        Z obj = new Z();
        obj.display();
    }
}