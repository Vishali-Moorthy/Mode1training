package com.hcl.boxing;

public class Employ {
	
	int empNo;
	String name;
	double basic;
	
	
	


	@Override
	public boolean equals(Object obj) {
		
		Employ e = (Employ) obj;
		if(e.basic==basic) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Employ [empNo=" + empNo + ", name=" + name + ", basic=" + basic + "]";
	}
	
	

}
