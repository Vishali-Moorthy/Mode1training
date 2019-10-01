package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000));
		list.add(new Product(2, "Iphone 6s", 65000));
		list.add(new Product(3, "Sony Xperia", 25000));
		list.add(new Product(4, "Nokia Lumia", 15000));
		list.add(new Product(5, "Redmi3",26000));
		list.add(new Product(6, "Lenevo vibe", 19000));
		list.stream().filter(p -> p.price >= 20000).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("Name starts with s");
		list.stream().filter(p -> p.name.startsWith("S")).forEach(x -> {
			System.out.println(x);
		});
		
		Product maxP = list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("Max price record");
		System.out.println(maxP);
		
		Product minP = list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
		System.out.println("Min price record");
		System.out.println(minP);
	}

}
