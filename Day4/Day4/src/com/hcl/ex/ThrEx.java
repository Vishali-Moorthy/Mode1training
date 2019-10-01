package com.hcl.ex;

public class ThrEx {
  /**
   * The main entry point.
   * @param x has value of x
   */
  public void show(int x) {
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("Negative nos not allowed");
    }
    if (x == 0) { 
      flag = false;
      throw new ArithmeticException("Zero is Invalid");
    }
  }
  /**
   * The main entry point.
   */
  
  public static void main(String[] args) {
    int n = 0;
    try {
      new ThrEx().show(n);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
