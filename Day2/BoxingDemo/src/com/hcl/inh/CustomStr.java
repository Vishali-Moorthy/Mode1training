package com.hcl.inh;

public class CustomStr {
	 static String name;
	 public CustomStr(String name) {
		 this.name=name;
	 }
	 public int length() {
		 char[] arr=name.toCharArray();
		 int i=0;
		 for (char c:arr) {
			 i++;
		 }
		 return i;
	 }
	 public int pos() {
		char[] arr=name.toCharArray();
		int i=0;
		for(char c:arr) {
			
		}
		return i;
	 }
	 public void subs() {
		 System.out.println(name.substring(1, 4));
	 }
	 public void equ() {
		 String name1="Visha";
		 System.out.println(name.equals(name1));
	 }
	 public void upcase() {
		 System.out.println(name.toUpperCase());
	 }
	 public void lowcase() {
		 System.out.println(name.toLowerCase());
	 }
	public static void main(String[] args) {
		CustomStr obj=new CustomStr("Visha");
		System.out.println(obj.length());
		System.out.println(obj.pos());
		obj.upcase();
		obj.lowcase();
		obj.subs();
		obj.equ();
	}

}
