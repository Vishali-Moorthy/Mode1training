package com.hcl.project;

import java.util.List;
import java.util.Scanner;

public class CustomerMain {
	public static void deleteCustomer() {
		int custId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		String res=obj.deleteCustomerBal(custId);
		System.out.println(res);
	}
	public static void updateCustomer() {
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		String res=obj.updateCustomerBal(objCustomer);
		System.out.println(res);
	}
	public static void showCustomer() {
		CustomerDAO obj = new CustomerDAO();
		List<Customer> lstCustomer = obj.showCustomerDao();
		for (Customer customer : lstCustomer) {
			System.out.println(customer);
		}
		
	}
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer Id  ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL(); 
		Customer objCustomer = obj.searchCustomerBal(custId);
		if(objCustomer!=null) {
			System.out.println(objCustomer);
		} else {
			System.out.println("Record not found...");
		}
		
	}
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
	    new CustomerBAL().readCustomerFileBal();
	}
	public static void addCustomer() {
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
	    objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual premium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal premium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter payment mode ");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objCustomer);
			if (res == true) {
				System.out.println("Student record added");
			}
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. Write Customer File");
			System.out.println("7. Read Customer File");
			System.out.println("8. Exit");
			System.out.println("Enter Ur Choice  ");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
				break;
			case 6 :
				writeCustomerFile();
				break;
			case 7 :
				readCustomerFile();
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}
	}

