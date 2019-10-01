package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer,String>();
		m.put(1, "Darshini");
		m.put(2, "Vinod");
		m.put(3, "Laksh");
		m.put(4, "Hema");
		m.put(5, "Raghu");
		
		int key;
		String result;
		System.out.println("Enter key ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "Not found");
		System.out.println(result);
		
	}

}
