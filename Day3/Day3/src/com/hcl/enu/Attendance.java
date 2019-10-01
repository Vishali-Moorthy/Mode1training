package com.hcl.enu;

public class Attendance {

	public static void display(Object...ob) {
		for (Object object : ob) {
			System.out.print(object + " ");	
		}
	}
	public static void show(int day,String...name) {
		System.out.print(day + " ");
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(2,"Visha","Shiva");
		show(3,"Visha","Shiva","Priya","Swetha","viji");
		show(4,"Veena","Vineeth","Sree");
		
		display();
		display("Visha",12,true,13.2);
		
	}
}
