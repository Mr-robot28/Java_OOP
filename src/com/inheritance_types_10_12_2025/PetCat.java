package com.inheritance_types_10_12_2025;
public class PetCat extends LivingBeing {
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        PetDog d = new PetDog();
        PetCat c = new PetCat();

        d.eat();
        d.sound();

        c.eat();
        c.sound();
    }
}