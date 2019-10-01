package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	
	@Test
	public void testWithdrawAccount() {
		assertEquals("Amount debited", AccountBAL.withdrawAccountBal(3, 3000));
		assertEquals("Insufficient funds", AccountBAL.withdrawAccountBal(3, 300000));
		assertEquals("Account No not found", AccountBAL.withdrawAccountBal(-3, 300000));
		assertEquals("Account closed", AccountBAL.withdrawAccountBal(1, 300));
	}
	@Test
	public void testDepositAccount() {
		assertEquals("Amount Credited..", AccountBAL.depositAccountBal(3, 3000));
		assertEquals("Account no not found", AccountBAL.depositAccountBal(-3, 3000));
		assertEquals("Account closed", AccountBAL.depositAccountBal(1, 3000));
	}
	@Test
	public void testCloseAccount() {
		assertEquals("Account closed", AccountBAL.closeAccountBal(4));
		assertEquals("Account no not found", AccountBAL.closeAccountBal(-4));
	}
	@Test
	public void testUpdateAccount() {
		assertEquals("Account updated..", AccountBAL.updateAccountBal(2, "Bangalore", "Karanataka"));
		assertEquals("Account No not found", AccountBAL.updateAccountBal(-2, "Bangalore", "Karanataka"));
		assertEquals("Account closed already", AccountBAL.updateAccountBal(1, "Chennai", "TamilNadu"));
	}
	@Test
	public void testSearchAccount() {
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
	}
	@Test
	public void testCreateAccount() {
		Accounts objAccounts = new Accounts();
		int accno = AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstname("Bindhu");
		objAccounts.setLastname("Sree");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("Ka");
		objAccounts.setAmount(46467);
		objAccounts.setCheqFacil("Yes");
		objAccounts.setAccountType("Savings");
		assertEquals("Account created successfully..", AccountBAL.createAccountBal(objAccounts));
	}
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void testGenerateAccountNo() {
		int accno = 0;
		Connection con = DaoConnection.getConnection();
		String cmd = "select max(accountno)+1 accno from Accounts ";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
		    accno = rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
		
	}
    @Test
    public void testGettersAndSetters() {
    	Accounts objAccounts = new Accounts();
    	objAccounts.setAccountNo(1);
    	objAccounts.setFirstname("Sai");
    	objAccounts.setLastname("Krishna");
    	objAccounts.setCity("Chennai");
    	objAccounts.setState("TN");
    	objAccounts.setAmount(65754);
    	objAccounts.setCheqFacil("Yes");
    	objAccounts.setAccountType("Savings");
    	objAccounts.setStatus("active");
    	
    	assertEquals(1, objAccounts.getAccountNo());
    	assertEquals("Sai", objAccounts.getFirstname());
    	assertEquals("Krishna", objAccounts.getLastname());
    	assertEquals("Chennai", objAccounts.getCity());
    	assertEquals("TN", objAccounts.getState());
    	assertEquals(65754, objAccounts.getAmount());
    	assertEquals("Yes", objAccounts.getCheqFacil());
    	assertEquals("Savings", objAccounts.getAccountType());
    	assertEquals("active", objAccounts.getStatus());
    	
    }
	

}
