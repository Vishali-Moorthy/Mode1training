package com.hcl.exc;

public class Div {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division " +c);
		} catch(ArithmeticException e) {
			System.out.println("Division by zero impossible");
		} catch(NumberFormatException e) {
			System.out.println("String cannot be converted as integer");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arguments should be passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Program by Hcl participants");
		}
	}

}
