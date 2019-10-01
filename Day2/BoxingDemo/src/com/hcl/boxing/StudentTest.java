package com.hcl.boxing;

public class StudentTest {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=46;
		s1.name="Visha";
		s1.city="Tirupur";
		s1.cgp=8.5;
		
		Student s2=new Student();
		s2.sno=46;
		s2.name="Visha";
		s2.city="Tirupur";
		s2.cgp=8.5;
		
		System.out.println(s1.sno==s2.sno);
		System.out.println(s1.equals(s2));
		
	}

}
