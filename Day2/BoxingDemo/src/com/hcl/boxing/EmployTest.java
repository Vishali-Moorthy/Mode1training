package com.hcl.boxing;

public class EmployTest {
	
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empNo=1;
		e1.name="Priya";
		e1.basic=45353;
		
		Employ e2=new Employ();
		e2.empNo=1;
		e2.name="Priya";
		e2.basic=45353;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
