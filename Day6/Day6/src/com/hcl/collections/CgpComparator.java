package com.hcl.collections;

import java.util.Comparator;

public class CgpComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    Student e1 = (Student)o1;
	    Student e2 = (Student)o2;
	    if (e1.cgp >= e2.cgp) {
	      return 1;
	    } else {
	      return -1;
	    }
	}
	

}
