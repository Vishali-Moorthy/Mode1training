package com.hcl.main;

public class Test  
{     
    int i;
    static int x = 2; 
    Test() { i = x; }  
    public static void main(String[] args) {     
         Test t = new Test(); 
         System.out.println("x = " + t.x); 
    } 
}