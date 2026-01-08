package com.inheritance_types_10_12_2025;
public class ClassLeader extends Learner {
    public void manageClass() {
        System.out.println("ClassLeader manages class");
    }

    public static void main(String[] args) {
        ClassLeader m = new ClassLeader();
        m.instituteName();
        m.study();
        m.manageClass();
    }
}