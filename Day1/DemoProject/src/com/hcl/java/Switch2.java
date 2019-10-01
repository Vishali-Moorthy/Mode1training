package com.hcl.java;

public class Switch2 {
	
	public void check(String op) {
		switch(op.toUpperCase()) {
		case "INSERT":
			System.out.println("Insert operation");
			break;
		case "UPDATE":
			System.out.println("Update operation");
			break;
		case "DELETE":
			System.out.println("Delete opertaion");
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
		
			
	}
	public static void main(String[] args) {
		String op="Insert";
		new Switch2().check(op);
	}

}
