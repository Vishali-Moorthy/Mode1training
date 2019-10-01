package com.hcl.exc;

public class Quiz {
	
	public static void main(String[] args) {
		int[] a=new int[]{12,4,5};
		try {
			a[6]=5/0;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size small");
		} catch(ArithmeticException e) {
			System.out.println("Division by zero impossible");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
