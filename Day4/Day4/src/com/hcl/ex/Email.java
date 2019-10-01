package com.hcl.ex;

public class Email { 
  /**
* The main entry point.
* @param uname has a value of arguments
* @throws InvalidEmailException throw InvalidEmailException
* @throws InvalidUserNameException throw InvalidUserNameException
*/
  public static void check(String uname) throws InvalidEmailException, InvalidUserNameException {
    //boolean flag=true;
    if (uname.indexOf('@') == -1) {
      //flag=false;
      throw new InvalidEmailException("Invalid email");
    }
    if (uname.indexOf('@') > 12) {
      //flag=false;
      throw new InvalidUserNameException("username contains only 12 char");
    }
    //if(flag==true) {
    System.out.println("Email " + uname);
    //}
  }
  
  /**
   * The main entry point.
   * @param args the argument values
   */
  
  public static void main(String[] args) {
    String uname = "vishalakshi@gmail.com";
    try {
      new Email().check(uname);
    } catch (InvalidEmailException | InvalidUserNameException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }

}
