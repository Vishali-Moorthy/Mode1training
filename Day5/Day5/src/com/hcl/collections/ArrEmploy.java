package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
  /**
 * The main entry point.
 * @param args the argument values
 */
  public static void main(String[] args) {
    List lstEmploy = new ArrayList();
    lstEmploy.add(new Employ(1,"Visha",334567.8));
    lstEmploy.add(new Employ(2,"Priya",33557.8));
    lstEmploy.add(new Employ(3,"swetha",657867.8));
    lstEmploy.add(new Employ(4,"Vineeth",32445.8));
    lstEmploy.add(new Employ(5,"Viji",33234.8));
    for (Object ob : lstEmploy) {
      Employ e = (Employ)ob;
      System.out.println(e);
    }
  }

}
