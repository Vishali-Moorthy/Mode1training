package com.hcl.collections;

interface ICtoF {
	double calc(double c);
}
public class Lambda3 { 
	public static void main(String[] args) {
		ICtoF cf = (c) -> {
			double f = ((9*c)/5)+32;
			return f;
		};
		ICtoF k1 = (c) -> {
			double k = c + 273;
			return k;
		};
		System.out.println(cf.calc(23));
		System.out.println(k1.calc(12.1));
	}

}
