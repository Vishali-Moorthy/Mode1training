package com.hcl.obj;

public class SbExample {
	
	public StringBuilder show(int age,String name,String course,String city) {
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(age <= 20) {
			sbError.append("Age must be greater than 20" + "\r\n");
			isValid=false;
		}
		
		if(name.indexOf(' ')==-1) {
			sbError.append("Name contains both Firstname and Lastname" +"\r\n");
			isValid=false;
		}
		
		if(!course.equalsIgnoreCase("Java")) {
			sbError.append("Only Java Course Allowed" +"\r\n");
			isValid=false;
		}
		
		if(isValid==true) {
		sbError.append("Age: " +age +"\r\n");
		sbError.append("Name: " +name +"\r\n");
		sbError.append("Course: " +course +"\r\n");
		sbError.append("City: " +city +"\r\n");
		} 
		return sbError;

	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=21;
		name="Ram A";
		course="JAVA";
		city="Delhi";
		StringBuilder sbRes = new SbExample().show(age, name, course, city);
		System.out.println(sbRes);
		
	}

}
