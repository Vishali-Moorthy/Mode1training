package com.hcl.boxing;

public class BoxEmploy {
	
	public void show(Object ob) {
		Employ e=(Employ)ob;
		System.out.println(e);
	}
	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		objEmploy.empNo=1;
		objEmploy.name="Visha";
		objEmploy.basic=57854;
		
		new BoxEmploy().show(objEmploy);
	}

}
