package com.hcl.java;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		int[] a=new int[]{12,3,4,78,32,54};
		
		System.out.println("Elements of array are: ");
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//	}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
