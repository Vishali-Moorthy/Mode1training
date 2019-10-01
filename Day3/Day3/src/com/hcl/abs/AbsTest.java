package com.hcl.abs;

abstract class Animal {
	abstract void name();
	abstract void type();
}

class Cow extends Animal {

	@Override
	void name() {
		System.out.println("name of animal is cow");		
	}

	@Override
	void type() {
		System.out.println("cow is a pet animal");
		// TODO Auto-generated method stub
		
	}
	
}



public class AbsTest {
  /**
   * The main entry point
   * @param args the argument values
   */
  public static void main(String[] args) {
    Animal[] arr = new Animal[]{new Cow(),new Lion()};
    for (Animal a : arr) {
      a.name();
      a.type();
  }
}
