package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(32));
		lstData.add(new Integer(22));
		lstData.add(new Integer(15));
		lstData.add(new Integer(43));
		lstData.add(new Integer(12));
		int sum;
		lstData.forEach(p -> {
			if(p >= 15) {
				System.out.println(p);
			}
		});
		
	}

}
