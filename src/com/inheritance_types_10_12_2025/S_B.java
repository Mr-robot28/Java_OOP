package com.inheritance_types_10_12_2025;

public class S_B extends S_A  {
	
	public void B() {
		System.out.println("Hi i am a method B from Class S_B ");
	}
	
	public static void main(String[] args) {
		
		S_B s = new S_B();
		s.B();
		s.A();
	}

	
}
