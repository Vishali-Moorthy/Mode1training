package com.hcl.ex;

public class Ex1 {
  
	/**
* The main entry point.
* @param args the argument values
*/
  public static void main(String[] args) {
    try {
      return; 
    } catch (Exception e) {
      System.out.println("Hi");
    } finally {
      System.out.println("Finally");
    }
  }

}
