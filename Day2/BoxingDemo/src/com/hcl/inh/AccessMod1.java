package com.hcl.inh;

class A {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=2;
public void display() {
	System.out.println(+a);
	System.out.println();
}
private void show(int a) {
	System.out.println("Value: " +a);
	
}
protected void shows() {
	System.out.println("Welcome");
}
}
class B extends A {
	protected void disp() {
		System.out.println("Hi");
	}
	
}
	
public class AccessMod1 {
	public static void main(String[] args) {
		
		B ob=new B();
		ob.shows();
		ob.display();
		ob.disp();
		
	}
}
	
