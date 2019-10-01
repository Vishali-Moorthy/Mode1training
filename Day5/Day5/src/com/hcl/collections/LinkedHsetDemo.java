package com.hcl.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHsetDemo {
  /**
   * The main entry point.
   * @param args the argument values
   */

  public static void main(String[] args) {
    Set s=new LinkedHashSet();
    s.add("Vinod");
    s.add("Hema");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Viji");
    s.add("Vinod");
    s.add("Hema");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Viji");
    s.add("Vinod");
    s.add("Hema");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Viji");
    s.add("Vinod");
    s.add("Hema");
    s.add("Keerthana");
    s.add("Raghu");
    s.add("Viji");
    System.out.println("Hashset data");
    s.forEach(System.out::println);
  }

}
