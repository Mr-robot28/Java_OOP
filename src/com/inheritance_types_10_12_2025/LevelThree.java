package com.inheritance_types_10_12_2025;
public class LevelThree extends LevelTwo {
    public int z = 30;

    public void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        LevelThree obj = new LevelThree();
        obj.display();
    }
}