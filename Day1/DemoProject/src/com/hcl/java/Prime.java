package com.hcl.java;

public class Prime {
	
	public void check(int n) {
		boolean flag=true;
		int i=2;
		while(i<n/2){
			if(n%i==0) {
				flag=false;
			}
			i++;
		}
			if(flag==true) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		
	}
	public static void main(String[] args) {
		int n=6;
		new Prime().check(n);
	}

}
