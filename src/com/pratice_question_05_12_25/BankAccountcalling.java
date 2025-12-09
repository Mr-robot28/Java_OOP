package com.pratice_question_05_12_25;

public class BankAccountcalling {
public static void main(String[] args) {
	BankAccount b = new BankAccount();
	b.deposit(25000);
	b.withdraw(1500);
	b.withdraw(25000);
	System.out.println(b.getbalance());
}
}