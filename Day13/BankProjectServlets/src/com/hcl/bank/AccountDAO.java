package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	PreparedStatement pst;
	Connection con;
	
	public String withdrawAccountDao(int accountNo,int withdrawAmount) {
		con = DaoConnection.getConnection();
		String result = " ";
		Accounts objAccounts = searchAccountDao(accountNo);
		if (objAccounts != null) {
			int amount = objAccounts.getAmount();
			String status = objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result = "Account closed";
			} else {
			if(amount - withdrawAmount >= 1000) {
				String cmd = " update Accounts set amount = amount - ? " + " where AccountNo = ? ";
				try {
					pst = con.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd = " Insert into Trans(AccountNo,TransAmount, " + "TransType) values(?,?,?) ";
					pst = con.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.setString(3, "D");
					pst.executeUpdate();
					result = "Amount debited";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = e.getMessage();
				}
			} else {
				result = "Insufficient funds";
			}
			}
		} else {
			result = "Account No not found";
		}
		
		return result;
	}
	
	public String depositAccountDao(int accountNo,int depAmount) {
		con = DaoConnection.getConnection();
		String result = " ";
		String cmd = " update Accounts set amount = amount + ? " + "where AccountNo = ? ";
		Accounts objAccounts = searchAccountDao(accountNo);
		if (objAccounts == null) {
			result = "Account no not found";
		} else {
			String status = objAccounts.getStatus();
			if (status.equalsIgnoreCase("inactive")) {
				result = "Account closed";
			} else {
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TransAmount," + "TransType) values (?,?,?) ";
			pst = con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.setString(3, "C");
			pst.executeUpdate();
			result = "Amount Credited..";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		}
		}
		return result;
	}
	
	public String closeAccountDao(int accountNo) {
		con = DaoConnection.getConnection();
		String result = " ";
		Accounts objAccounts = searchAccountDao(accountNo);
		if(objAccounts == null) {
			result = "Account no not found";
		} else {
		String cmd = " update Accounts set status = 'Inactive' " + " where accountno = ? ";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result = "Account closed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		}
		return result;
		
	}
	public String updateAccountDao (int accountNo,String city,String state) {
		con = DaoConnection.getConnection();
		Accounts objAccounts = searchAccountDao(accountNo);
		String cmd = "Update Accounts set city=?, state=? " + " where AccountNo=? ";
		String result = " ";
		if(objAccounts== null) {
			result = "Account No not found";
		} else {
			String status = objAccounts.getStatus();
			//System.out.println(status);
			if(status.equalsIgnoreCase("inactive")) {
				result = "Account closed already";
			} else {
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result = "Account updated..";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
	  }
	}
		return result;
	}
	
	
	public Accounts searchAccountDao(int accountNo) {
		con = DaoConnection.getConnection();
		String cmd = " select * from Accounts where accountNo=? ";
		Accounts objAccounts = null;
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				objAccounts = new Accounts();
				objAccounts.setFirstname(rs.getString("firstname"));
				objAccounts.setLastname(rs.getString("lastname"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("State"));
				objAccounts.setAmount(rs.getInt("Amount"));
				objAccounts.setCheqFacil(rs.getString("cheqfacil"));
				objAccounts.setAccountType(rs.getString("AccountType"));
				objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
	}
	
	public String createAccountDao(Accounts objAccounts) {
		con = DaoConnection.getConnection();
		String cmd = "Insert into Accounts(Accountno,Firstname, "
				      + " lastname,city,state,Amount,CheqFacil, "
				      + "AccountType) values(?,?,?,?,?,?,?,?) ";
		String result = " ";
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstname());
			pst.setString(3, objAccounts.getLastname());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());;
			pst.executeUpdate();
			result = "Account created successfully..";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	public int generateAccountNoDao() {
		con = DaoConnection.getConnection();
		int accno = 0;
		String cmd = "select case when max(accountNo) IS NULL " 
		               + "THEN 1 else MAX(accountNo)+1 END accno from Accounts";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accno;
	}

}
