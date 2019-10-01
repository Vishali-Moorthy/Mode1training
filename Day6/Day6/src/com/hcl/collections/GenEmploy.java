package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
  public static void main(String[] args) {
	List<Employ> lstEmploy = new ArrayList<Employ>();
	lstEmploy.add(new Employ(1, "Priya", 89376));
	lstEmploy.add(new Employ(2, "Swetha", 76453));
	lstEmploy.add(new Employ(3, "Visha", 65473));
	lstEmploy.add(new Employ(4, "Shiva", 35356));
	lstEmploy.add(new Employ(5, "Moni", 54673));
	lstEmploy.add(new Employ(6, "Hari", 42344));
	System.out.println("Employ list");
	lstEmploy.forEach(System.out :: println);
}

}
