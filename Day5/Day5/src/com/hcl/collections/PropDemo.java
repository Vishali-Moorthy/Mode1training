package com.hcl.collections;

import java.util.ResourceBundle;

public class PropDemo {
  /**
   * The main entry point.
   * @param args the argument values
   */

  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle("hcltraining");
    System.out.println(rb.getString("welcome"));
    System.out.println(rb.getString("lunch"));
    System.out.println(rb.getString("break"));
    System.out.println(rb.getString("logout"));
  }

}
