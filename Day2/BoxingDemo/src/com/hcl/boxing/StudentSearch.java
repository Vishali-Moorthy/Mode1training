package com.hcl.boxing;

public class StudentSearch {
	
	public Student showStudent(int sno) {
		Student student=null;
		if(sno==1) {
			student=new Student();
			student.name="Visha";
			student.sno=1;
			student.cgp=8.5;
		}
		if(sno==2) {
			student=new Student();
			student.name="Priya";
			student.sno=4;
			student.cgp=8.53;
		}
		return student;
	}
	
	public static void main(String[] args) {
		StudentSearch objSearch=new StudentSearch();
		Student res=objSearch.showStudent(2);
		if(res!=null) {
			System.out.println(res);
		} else {
			System.out.println("sno not found");
		}
		
	}

}
