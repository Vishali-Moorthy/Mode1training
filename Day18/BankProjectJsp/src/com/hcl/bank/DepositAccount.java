package com.hcl.bank;

public class DepositAccount {
	
	private int accountNo;
	private int depositAmount;

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String depositAccount() {
		return AccountBAL.depositAccountBal(accountNo, depositAmount);
	}

}
