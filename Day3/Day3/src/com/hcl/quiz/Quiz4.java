package com.hcl.quiz;

public class Quiz4 {
	public static void main(String[] args) {
		Object[] arr=new Object[]
				{12,"Welcome",32.1,"Hcl",'A',"Java",true,11,22.3,"Bangalore"
	};
		for (Object object : arr) {
	//		if(object instanceof Integer) {
	//			System.out.println(object);
	//		}
	//		if(object instanceof String) {
	//		System.out.println(object);
	//		}
			if(object instanceof Double) {
				System.out.println(object);
			}
			if(object instanceof Boolean) {
				System.out.println(object);
			}
			if(object instanceof Character) {
				System.out.println(object);
			}
		}
	}
}
