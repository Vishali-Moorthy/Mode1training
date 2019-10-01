package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	StringBuilder sb = new StringBuilder();
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException {
		boolean isAdded = true;
		if (objCustomer.getCustId() <= 0) {
			sb.append("CustomerId cannot be negative \r\n");
			isAdded = false;
		}
		if (objCustomer.getCustName().length() < 5) {
			sb.append("Customer name not less than 5 characters \r\n" );
			isAdded = false;
		}
		if ((objCustomer.getAnnualPremium() < 20000)) {
			sb.append("Annual premium must be greater than 20000 \r\n");
			isAdded = false;
		}
		if ((objCustomer.getAnnualPremium() > 1000000)) {
			sb.append("Annual premium must be less than 1000000 \r\n");
			isAdded = false;
		}
		if (objCustomer.getModalPremium() < 1000) {
			sb.append("Modal premium must be more than 1000 \r\n");
			isAdded = false;
		}
		if (objCustomer.getModalPremium() > 50000) {
			sb.append("Modal premium must be less than 50000 \r\n");
			isAdded = false;
		}
		if (objCustomer.getPaymentMode() < 1) {
			sb.append("Payment mode should be 1,2 or 3 \r\n");
			isAdded = false;
		}
		if (objCustomer.getPaymentMode() > 3) {
			sb.append("Payment mode should be 1,2 or 3 \r\n");
			isAdded = false;
		}
		if (isAdded == false) {
			throw new CustomerException(sb.toString());
		} else {
			new CustomerDAO().addCustomerDao(objCustomer);
		}
		return isAdded;
	}
	public Customer searchCustomerBal(int custId) {
		return new CustomerDAO().searchCustomerDao(custId);
	}
	public List<Customer> showCustomerBal() {
		return new CustomerDAO().showCustomerDao();
	}
	public String updateCustomerBal(Customer objCustomer) {
		return new CustomerDAO().updateCustomerDao(objCustomer);
	}
	public String deleteCustomerBal(int sno) {
		return new CustomerDAO().deleteCustomerDao(sno);
	}
	
}	
