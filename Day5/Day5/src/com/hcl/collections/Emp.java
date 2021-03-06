package com.hcl.collections;

public class Emp implements Comparable {
  int empno;
  String name;
  double basic;
  /**
   * The main entry point.
   * @param empno has the emloye number
   * @param name has the employee name
   * @param basic has the employee salary
   */
  
  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  
  @Override
  public String toString() {
    return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  
  @Override
  public int compareTo(Object o) {
    Emp e = (Emp)o;
    return name.compareTo(e.name);
  }
}
