package com.hcl.ex;

public class Ex2 {
  /**
   * The main entry point.
   * @param args the arguments values
   */
  public static void main(String[] args) {
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (NullPointerException e) { 
      //System.out.println("Error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) { 
      System.out.println("Rethrown error");
    }
  }

}
