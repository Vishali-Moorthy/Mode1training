package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
  /**
 * The main entry point.
 * @param args the argument values
 */
  public static void main(String[] args) {
    List num = new ArrayList(); 
    num.add(new Integer(23));
    num.add(new Integer(25));
    num.add(new Integer(56));
    num.add(new Integer(1));
    num.add(new Integer(32));
    num.add(new Integer(12));
    int sum = 0;
    for (Object ob : num) {
      sum += (Integer)ob;
    }
    System.out.println("Sum " + sum);
  }

}
