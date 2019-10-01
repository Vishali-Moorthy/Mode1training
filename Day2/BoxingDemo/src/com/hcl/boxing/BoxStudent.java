package com.hcl.boxing;

public class BoxStudent {
	
	public void show(Object ob) {
		Student s=(Student)ob;
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		Student objStud=new Student();
		objStud.sno=46;
		objStud.name="Visha";
		objStud.city="Tirupur";
		objStud.cgp=8.5;
		
		new BoxStudent().show(objStud);
	}

}
