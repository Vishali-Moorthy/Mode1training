
package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		int accountno = AccountBAL.generateAccountBal();
		//System.out.println(accountno);
		Accounts objAccounts = new Accounts();
		objAccounts.setAccountNo(accountno);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name ");
		objAccounts.setFirstname(sc.nextLine());
        System.out.println("Enter last name ");
        objAccounts.setLastname(sc.nextLine());
        System.out.println("Enter city ");
        objAccounts.setCity(sc.nextLine());
        System.out.println("Enter state ");
        objAccounts.setState(sc.nextLine());
        System.out.println("Enter amount ");
        objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter cheqfacil ");
        objAccounts.setCheqFacil(sc.nextLine());
        System.out.println("Enter Account type ");
        objAccounts.setAccountType(sc.nextLine());
        System.out.println(AccountBAL.createAccountBal(objAccounts));
	}

}
