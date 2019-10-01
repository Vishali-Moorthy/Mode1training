package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaO {
	
public LeaveHistory MyLeaveDetails(int EMP_ID){
	
	Connection con=DaoConnection.getConnection();
	String cmd="Select * from Leave_history where EMP_ID=?";
	LeaveHistory obj=null;
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, EMP_ID);
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			obj=new LeaveHistory();
			obj.setEMP_ID(EMP_ID);
			obj.setLEA_ID(rs.getInt("lEA_ID"));
			obj.setLEA_START_DATE(rs.getDate("lEA_START_DATE"));
			obj.setLEA_END_DATE(rs.getDate("lEA_END_DATE"));
			obj.setLEA_NO_OF_DAYS(rs.getInt("lEA_NO_OF_DAYS"));
			obj.setLEA_REASON(rs.getString("lEA_REASON"));
			obj.setLEA_TYPE(rs.getString("lEA_TYPE"));
			obj.setLEA_APPLIED_ON(rs.getDate("lEA_APPLIED_ON"));
			obj.setLEA_MGR_COMMENTS(rs.getString("lEA_MGR_COMMENTS"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
	
}
	
	public Employee ManagerDetails(int EMP_MGR_ID){
		Connection con=DaoConnection.getConnection();
		String cmd="select * from Employee where EMP_MGR_ID=?";
		Employee obj=null;
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, EMP_MGR_ID);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				obj=new Employee();
				obj.setEMP_MGR_ID(EMP_MGR_ID);
				obj.setEMP_ID(rs.getInt("EMP_ID"));
				obj.setEMP_NAME(rs.getString("EMP_NAME"));
								obj.setEMP_EMAIL(rs.getString("EMP_EMAIL"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		}
	
	
public Employee EmployeeDetails(int EMP_ID){
Connection con=DaoConnection.getConnection();
String cmd="select * from Employee where EMP_ID=?";
Employee obj=null;
try {
	PreparedStatement pst = con.prepareStatement(cmd);
	pst.setInt(1, EMP_ID);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		obj=new Employee();
		obj.setEMP_ID(EMP_ID);
		obj.setEMP_NAME(rs.getString("EMP_NAME"));
		obj.setEMP_DPT_NAME(rs.getString("EMP_DPT_NAME"));
		obj.setEMP_EMAIL(rs.getString("EMP_EMAIL"));
		obj.setEMP_DATE_JOINED(rs.getDate("EMP_DATE_JOINED"));
		obj.setEMP_MGR_ID(rs.getInt("EMP_MGR_ID"));
		obj.setEMP_MOB_NO(rs.getString("EMP_MOB_NO"));
		obj.setEMP_LEAVE_BALANCE(rs.getInt("EMP_LEAVE_BALANCE"));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return obj;
}
}
