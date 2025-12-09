package com.pratice_question_05_12_25;

//Add methods: deposit(), withdraw(), getBalance().
//Perform operations in main.**

public class BankAccount {
	private double balance;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount1) {
		 balance = balance - amount1;
		if(amount1 >= balance  ) {
			System.out.println(" NO balance");
		}
			
	
}
	public double getbalance() {
		return balance;
}
}