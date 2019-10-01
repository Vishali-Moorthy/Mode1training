package com.hcl.enu;

enum Test {
	A,B,X,Y,N;
	private Test() {
		System.out.println("Hi");
	}
}
public class Enum4 {
	public static void main(String[] args) {
		Test t = Test.N;
	}

}
