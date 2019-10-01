package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deptno;
		String dname,head;
		System.out.println("Enter deptno ");
		deptno = sc.nextInt();
		System.out.println("Enter department name ");
		dname = sc.next();
		System.out.println("Enter head ");
		head = sc.next();
		String cmd = "update Department set dname=?,head=? WHERE deptno=?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setString(2, head);
			pst.setInt(3, deptno);
			pst.executeUpdate();
			System.out.println("***Record updated***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
