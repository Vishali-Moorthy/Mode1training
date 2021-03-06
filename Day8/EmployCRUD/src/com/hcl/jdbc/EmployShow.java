package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShow {
	public static void main(String[] args) {
		Connection con = DaoConnection.getConnection();
		String cmd = "select * from employ";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Empno " + rs.getInt("empno"));
				System.out.println("Employ Name " + rs.getString("name"));
				System.out.println("Department " + rs.getString("dept"));
				System.out.println("Designation " + rs.getString("desig"));
				System.out.println("Salary " + rs.getInt("basic"));
				System.out.println("----------------------");
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
