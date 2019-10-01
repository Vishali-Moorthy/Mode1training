package com.hcl.boxing;

public class ConDemo {
	
	static {
		System.out.println("Static constructor");
	}

	
	public ConDemo() {
		System.out.println("default constructor");
	}


	public static void main(String[] args) {
		new ConDemo();
	}
	
	

}
