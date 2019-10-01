package com.hcl.ex;

public class Custom {
  /**
* The main entry point.
* @param a has value of a
* @param b has value of b
* @throws NegativeException throw NegativeException
* @throws NumberZeroException throw NumberZeroException
*/
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("negative nos not allowed");
    } 
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("zero is invalid");
    }
    if (flag == true) { 
      c = a + b;
      System.out.println("Sum is " + c);
    }
  }
  /**
   * The main entry point.
   * @param args the argument values
   */
  
  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    try {
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
