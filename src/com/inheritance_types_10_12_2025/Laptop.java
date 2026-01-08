package com.inheritance_types_10_12_2025;
public class Laptop extends Device {
    public void code() {
        System.out.println("Coding on laptop");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.powerOn();
        m.call();

        Laptop l = new Laptop();
        l.powerOn();
        l.code();
    }
}