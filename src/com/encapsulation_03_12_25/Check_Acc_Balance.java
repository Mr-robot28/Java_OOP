package com.encapsulation_03_12_25;

public class Check_Acc_Balance {
	
	 public static void main(String[] args) {

	        BankAccount acc = new BankAccount();

	       acc.setDeposit(100);
	       acc.setBalance(10000);
	       
	       System.out.println("Sumedh Hajare has Deposited $"+ acc.getDeposit()+ " cr.");
	       System.out.println("Sumedh Hajare has a Total Balace of $"+ acc.getBalance()+ " cr.");
	    }

}
