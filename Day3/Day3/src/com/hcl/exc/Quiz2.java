package com.hcl.exc;

class X {
	int a,b;
	public X() {
		a=5;
		b=8;
	}
	@Override
	public String toString() {
		return "C1 [a=" + a + ", b=" + b + "]";
	}
	
}
class Y extends X {
	public Y(int a,int b) {
		
	}
}
public class Quiz2 {
	public static void main(String[] args) {
		Y obj=new Y(12, 5);
		System.out.println(obj);
	}

}
