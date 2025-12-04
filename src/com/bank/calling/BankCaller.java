package com.bank.calling;

import com.bank.details.Bank;

public class BankCaller {
	public static void main(String[] args) {
		Bank bank = new Bank();
//		String name1 = bank.bankName ="State Bank of India";
//		String branch1 = bank.branch = "Pune Camp";
 //       String ifsc1 = bank.ifscCode = "SBIN0001234";
//        int year1 = bank.establishedYear = 1955;
//        String manager1 = bank.managerName = "Mr. Raghav Deshmukh";
 //       int emp1 = bank.totalEmployees = 120;
 //       double balance1 = bank.totalBalance = 550000000.75;
//        int atm1 = bank.atmCount = 18;
//        boolean national1 = bank.isNationalized = true;
//        String loc1 = bank.location = "MG Road, Pune";

        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Branch: " + bank.branch);
        System.out.println("IFSC Code: " + bank.ifscCode);
        System.out.println("Established Year: " + bank.establishedYear);
        System.out.println("Manager Name: " + bank.managerName);
        System.out.println("Total Employees: " + bank.totalEmployees);
        System.out.println("Total Balance: " + bank.totalBalance);
        System.out.println("ATM Count: " + bank.atmCount);
        System.out.println("Is Nationalized: " + bank.isNationalized);
        System.out.println("Location: " + bank.location);
		}

}
