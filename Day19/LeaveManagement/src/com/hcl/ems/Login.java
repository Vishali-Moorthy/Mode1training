package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	   private int emp_id;
	   private String SecretCode;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getSecretCode() {
		return SecretCode;
	}
	public void setSecretCode(String secretCode) {
		SecretCode = secretCode;
	}
	   
	public static boolean authenticate(int user, String pwd){
			PreparedStatement pst;
			Connection con=DaoConnection.getConnection();
			String cmd="select * from employlogin where EMP_ID=? AND SecretCode=?";
			boolean flag=true;
			try {
				pst=con.prepareStatement(cmd);
				pst.setInt(1, user);
				pst.setString(2, pwd);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					flag=true;
				} else {
					flag=false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
}
}

