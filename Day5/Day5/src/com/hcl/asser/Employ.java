package com.hcl.asser;

import java.io.Serializable;

public class Employ implements Serializable {
  int empno;
  String name;
  transient double basic;
  /**
   * The main entry point.
   * @param empno has employee number
   * @param name has employee name
   * @param basic has employe basic
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
