package com.java.exampleone;

public class MathLibFunctions {

	public static void main(String[] args) {

		double firstNumber = 44.8;
		double secondNumber = 16.5;
		System.out.println("exp(" + secondNumber + ") = " + Math.exp(secondNumber));

		System.out.println("log(" + secondNumber + ") = " + Math.log(secondNumber));

		System.out.println("power: " + Math.pow(firstNumber, secondNumber));

		System.out.println("sqrt for " + secondNumber + " is " + Math.sqrt(secondNumber));

		System.out.println(
				"Minimum out of " + firstNumber + " and " + secondNumber + " = " + Math.min(firstNumber, secondNumber));

		System.out.println(
				"Maximum out of " + firstNumber + " and " + secondNumber + " = " + Math.max(firstNumber, secondNumber));
		System.out.println("Round off for firstNumber: " + Math.round(firstNumber));

		System.out.println("Round off for secondNumber: " + Math.round(secondNumber));
	}

}
