package com.hcl.enu;

enum Student {
	Anisha,Laksh,Visha,Priya,Sree
}

public class Enum3 {
	
	public static void show() {
		Student[] arrStudent=Student.values();
		for(Student student:arrStudent) {
			System.out.println(student);
		}
	}
	
	public static void main(String[] args) {
		show();
	}

}
