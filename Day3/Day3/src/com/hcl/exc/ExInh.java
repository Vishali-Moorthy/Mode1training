package com.hcl.exc;

class First {
	public void show() {
		System.out.println("Show method from first");
	}
}
class Second extends First {
	public void show() {
		System.out.println("Show method from Second");
	}
}
public class ExInh {
	
	public static void main(String[] args) {
		First ob1=new First();
		try {
			Second ob2=(Second)ob1;
			ob2.show();
		} catch(ClassCastException e) {
			System.out.println("class cannot be cast");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
