package com.inheritance_types_10_12_2025;

public class Mulit_Child extends Mulit_Parent {
    int c = 3;

    public static void main(String[] args) {
       
    	Mulit_Child obj = new Mulit_Child();

        System.out.println(obj.a); // from GrandParent
        System.out.println(obj.b); // from Parent
        System.out.println(obj.c); // from Child
    }
}
