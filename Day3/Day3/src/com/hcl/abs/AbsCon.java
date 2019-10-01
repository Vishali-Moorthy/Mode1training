package com.hcl.abs;

public class AbsCon {
  /**
 * The main entry point.
 * @param args the argument values
 */
  public static void main(String[] args) {
    Employ obj1 = new Janani(1, "Janani", 757438);
    Employ obj2 = new Raghu(2, "Raghu", 73647);
    Employ[] arrEmploy = new Employ[]{obj1,obj2};
    for (Employ employ : arrEmploy) {
      System.out.println(employ);
    }
  }

}
