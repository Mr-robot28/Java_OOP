package com.inheritance_types_10_12_2025;
public class BigTiger extends WildCat {
    public void roar() {
        System.out.println("Tiger roars");
    }

    public static void main(String[] args) {
        BigTiger t = new BigTiger();
        t.eat();
        t.meow();
        t.roar();
    }
}