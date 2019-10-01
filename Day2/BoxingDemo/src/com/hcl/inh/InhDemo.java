package com.hcl.inh;

class c1 {
	public void show() {
		System.out.println("From show method");
	}
}
class c2 extends c1 {
	public void display() {
		System.out.println("From Display method");
	}
}
public class InhDemo {
	public static void main(String[] args) {
		c2 obj=new c2();
		obj.show();
		obj.display();
	}

}
