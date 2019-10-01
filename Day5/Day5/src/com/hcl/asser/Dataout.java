package com.hcl.asser;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataout {
  /**
* The main entry point.
* @param args the arguments
*/

  public static void main(String[] args) {
    try {
      DataOutputStream dout = new DataOutputStream(new FileOutputStream("c:/Files/data.txt"));
      dout.writeInt(12);
      dout.writeUTF("HCL");
      dout.writeDouble(324.5);
      dout.writeBoolean(true);
      dout.close();
      System.out.println("*** File created ***");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
