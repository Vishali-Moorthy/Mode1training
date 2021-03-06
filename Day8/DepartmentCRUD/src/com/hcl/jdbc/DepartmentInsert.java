package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentInsert {
	public static void main(String[] args) {
		int deptno;
		String dname,loc,head;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department no ");
		deptno = Integer.parseInt(sc.nextLine());
		System.out.println("Department Name ");
		dname = sc.nextLine();
		System.out.println("Location ");
		loc = sc.nextLine();
		System.out.println("Head ");
		head = sc.nextLine();
		String cmd = "insert into department values(?,?,?,?)";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.setString(4, head);
			pst.executeUpdate();
			System.out.println("***Record inserted***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
