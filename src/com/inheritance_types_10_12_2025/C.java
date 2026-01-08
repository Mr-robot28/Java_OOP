package com.inheritance_types_10_12_2025;

public class C extends B {
	void showC() {
		System.out.println("This is class C");
	}

	public static void main(String[] args) {
		C obj = new C();

		obj.showA();
		obj.showB();
		obj.showC();
	}
}
