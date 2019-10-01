package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenListInt {
  public static void main(String[] args) {
    List<Integer> lstData = new ArrayList<Integer>();
    lstData.add(new Integer(32));
    lstData.add(new Integer(78));
    lstData.add(new Integer(45));
    lstData.add(new Integer(67));
    lstData.add(new Integer(12));
    int sum = 0;
    for (Integer i : lstData) {
		sum += i;
	}
    System.out.println("Sum is " + sum);
}

}
