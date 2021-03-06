package com.hcl.collections;

public class Employ {
  int empno;
  String name;
  double basic;
  /**
   * The main entry point.
   * @param empno has the employ num
   * @param name has the employ name
   * @param basic has the employ salary
   */
  
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}
