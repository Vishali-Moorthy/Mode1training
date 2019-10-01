package com.hcl.boxing;

public class Cricket {

	static int score;
	
	public void incr(int x) {
		score+=x;
	}
	public static void main(String[] args) {
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket ext=new Cricket();
		
		fb.incr(23);
		sb.incr(14);
		ext.incr(34);
		
		System.out.println(Cricket.score);
	}
}
