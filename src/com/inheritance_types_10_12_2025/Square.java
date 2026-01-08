package com.inheritance_types_10_12_2025;
public class Square extends Shape {
    Square() {
        type = "Square";
    }
    void showType() {
        System.out.println("Shape type: " + type);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        c.showType();
        s.showType();
    }
}