package com.hcl.intf;

interface ITraining {
	void name();
	void email();
}

class Hema implements ITraining {

	@Override
	public void name() {
		System.out.println("name is Hema");		
	}

	@Override
	public void email() {
		System.out.println("hema@gmail.com");		
	}
	
}
class Keerthana implements ITraining {

	@Override
	public void name() {
		System.out.println("name is keerthana");
	}

	@Override
	public void email() {
		System.out.println("keerthana@gmail.com");
	}
	
}
public class IntfDemo {
	
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[] {
				new Hema(),
				new Keerthana()};
		for (ITraining t : arr) {
			t.name();
			t.email();
			
		}
		}
	}


