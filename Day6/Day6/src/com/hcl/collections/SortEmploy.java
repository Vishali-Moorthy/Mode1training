package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		Set<Employ> setEmploy = new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1, "Priya", 89376));
		setEmploy.add(new Employ(2, "Swetha", 76453));
		setEmploy.add(new Employ(3, "Visha", 65473));
		setEmploy.add(new Employ(4, "Shiva", 35356));
		setEmploy.add(new Employ(5, "Moni", 54673));
		setEmploy.add(new Employ(6, "Hari", 42344));
		System.out.println("Employ list");
		setEmploy.forEach(System.out :: println);
	}

}
