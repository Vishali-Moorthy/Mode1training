package com.hcl.quiz;

class Employ {
	String name;
	public Employ(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
}
class HrEmploy extends Employ {
	public HrEmploy(String name) {
		super(name);
	}
}
class JavaEmploy extends Employ {
	public JavaEmploy(String name) 
	{
		super(name);
	}
}
public class Quiz3 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]
				{
						new HrEmploy("Shiva"),
						new JavaEmploy("Moni"),
						new HrEmploy("visha"),
						new JavaEmploy("Sri"),
						new HrEmploy("Hari"),
						new JavaEmploy("Ram"),
						new HrEmploy("Priya"),
						new JavaEmploy("Sweta"),
						new HrEmploy("Shiv"),
						new JavaEmploy("Viji"),
				};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy) {
				System.out.println(employ);
			}
			
		}
	}

}
