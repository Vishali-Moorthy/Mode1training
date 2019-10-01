package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
  /**
   * The main entry point.
   * @param args the argument values
   */
  public static void main(String[] args) {
    List lstNames = new ArrayList();
    lstNames.add("Visha");
    lstNames.add("Priya");
    lstNames.add("Swetha");
    lstNames.add("Vineeth");
    lstNames.add("Viji");
    lstNames.add("Vishwa");
    System.out.println("Names are ");
    // for (Object object : lstNames) {
    //   System.out.println(object);
    // }
    System.out.println("JDK 1.8");
    lstNames.forEach(System.out::println);
    /*Edit*/
    lstNames.set(2,"Swarnalakshmi");
    System.out.println("List after update");
    lstNames.forEach(System.out::println);
    System.out.println("List after removing by index");
    lstNames.remove(5);
    lstNames.forEach(System.out::println);
    lstNames.remove("Visha");
    System.out.println("List after removing by object");
    lstNames.forEach(System.out::println);
    System.out.println(lstNames.get(2));
  }

}
