package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmp {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1, "Visha", 56785));
		list.add(new Emp(2, "Priya", 75738));
		list.add(new Emp(3, "Swetha", 45677));
		Collections.sort(list, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Emp emp : list) {
			System.out.println(emp);
		}
		Collections.sort(list, (p1,p2) -> {
			return (int) (p1.basic - p2.basic);
		});
		System.out.println("Sorted by basic wise");
		System.out.println("------------");
		for (Emp emp : list) {
			System.out.println(emp);
			
		}
		System.out.println("Salary more than 60000");
		System.out.println("-----");
		list.stream().filter(p -> p.basic >= 50000).forEach(a -> {
			System.out.println(a);
		});
		System.out.println("Name strats with P");
		System.out.println("----");
		list.stream().filter(p -> p.name.startsWith("S")).forEach(a -> {
			System.out.println(a);
		});
	}

}
