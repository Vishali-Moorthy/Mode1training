package com.hcl.asser;

public class AssertDemo {
  /**
   * The increment block.
   */
  public void incr() {
    int basic = 30000;
    for (int i = 0;i < 8;i++) {
      basic = basic + 4000;
      assert basic < 48000;
      System.out.println("Salary " + basic);
    }
  }
  /**
   * The main entry point.
   * @param args the argument values
   */

  public static void main(String[] args) {
    new AssertDemo().incr();
  }

}
