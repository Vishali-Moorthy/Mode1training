package com.hcl.boxing;

public class BoxDemo {

	public static void main(String[] args) {
		int a=12;
		double b=15.2;
		String name="Hcl";
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		int a1=(Integer)ob1;
		double b1=(Double)ob2;
		String n1=(String)ob3;
		
		a1++;
		System.out.println("Integer value: " +a1);
		System.out.println("Double value: " +b1);
		System.out.println("Name: " +n1);
	}
}
