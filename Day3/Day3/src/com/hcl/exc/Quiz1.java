package com.hcl.exc;

class C1 {
	void test() {
		System.out.println("Welcome");
	}
}
class C2 extends C1 {
	void test() {
		System.out.println("Bye");
	}
}
public class Quiz1 {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.test();
	}

}
