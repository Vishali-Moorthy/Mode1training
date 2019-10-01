package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number ");
		accountNo = sc.nextInt();
		Accounts objAccounts = AccountBAL.searchAccountBal(accountNo);
		if(objAccounts != null) {
			System.out.println("First name " + objAccounts.getFirstname());
			System.out.println("Last name " + objAccounts.getLastname());
			System.out.println("City " + objAccounts.getCity());
			System.out.println("State " + objAccounts.getState());
			System.out.println("Amount " + objAccounts.getAmount());
			System.out.println("CheqFacil " + objAccounts.getCheqFacil());
			System.out.println("Account type " + objAccounts.getAccountType());
		} else {
			System.out.println("**Record not found**");
		}
		
	}

}
