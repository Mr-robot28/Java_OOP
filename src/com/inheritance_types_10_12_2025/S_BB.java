package com.inheritance_types_10_12_2025;

public class S_BB extends S_AA {
	int b = a * 2;

	public static void main(String[] args) {
		S_BB obj = new S_BB(); 

		System.out.println(obj.a); 
		System.out.println(obj.b); 
	}
}
