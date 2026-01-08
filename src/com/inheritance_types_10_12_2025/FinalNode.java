package com.inheritance_types_10_12_2025;
public class FinalNode extends SecondBranch {
    public void showFinalNode() {
        System.out.println("FinalNode class");
    }

    public static void main(String[] args) {
        FinalNode obj = new FinalNode();
        obj.showBase();
        obj.showSecondBranch();
        obj.showFinalNode();
    }
}