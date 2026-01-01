package com.inheritance_8_12_2025;

public class UserAccount {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.createAccount();
		sa.login();
		sa.checkBalance();
		sa.deposit();
		sa.withdraw();
System.out.println("*****************************");
		CurrentAccount ca = new CurrentAccount();
		ca.createAccount();
		ca.login();
		ca.checkBalance();
		ca.limit();
		ca.sendamt();
	}
}