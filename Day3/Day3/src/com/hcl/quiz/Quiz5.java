package com.hcl.quiz;

public class Quiz5 {
	
	public void calc(double r) {
		double c;
		c=Math.PI*r;
		System.out.println(c);
	}
	public void power(double r) {
		double a;
		a=Math.pow(r, 2);
		System.out.println(a);
	}
	public void abso(int r) {
		System.out.println(Math.abs(r));
	}
	public void rad(double r) {
		System.out.println(Math.toRadians(r));
	}
	public static void main(String[] args) {
//		double r=12.52;
	
		new Quiz5().calc(54);
		new Quiz5().power(21);
		new Quiz5().abso(-152);
		new Quiz5().rad(30);
		
		
		
	}

}
