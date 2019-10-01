package com.hcl.abs;

public class AbsDemo {
  /**
 * The main entry point.
 * @param args the arguments
 */
  public static void main(String[] args) {
    //Training t1=new Anubhav();
    //Training t2=new SaiKrishna();
    Training[] arr = new Training[]
    {
      new Anubhav(),
      new SaiKrishna()
    }; 
    for (Training t : arr) {
      t.name();
      t.email();
    }
  }

}

