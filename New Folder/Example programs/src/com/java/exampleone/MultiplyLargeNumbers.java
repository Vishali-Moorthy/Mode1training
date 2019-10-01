package com.java.exampleone;

import java.math.BigInteger;

public class MultiplyLargeNumbers {
	public static void main(String[] args) {

		BigInteger firstNumber = new BigInteger(
				"1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
		BigInteger secondNumber = new BigInteger(
				"5820974944592307816406286208998628034825342117067914159265358979323846264338327950288419716939937510");

		BigInteger bigProduct = firstNumber.multiply(secondNumber);

		System.out.println("Product of two largest number is: " + bigProduct);
	}
}


