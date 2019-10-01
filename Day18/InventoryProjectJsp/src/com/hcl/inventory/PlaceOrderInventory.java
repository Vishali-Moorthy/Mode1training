package com.hcl.inventory;

public class PlaceOrderInventory {
	private String stockid;
	private int quantityorder;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public int getQuantityorder() {
		return quantityorder;
	}
	public void setQuantityorder(int quantityorder) {
		this.quantityorder = quantityorder;
	}
	
	public String placeorderInventory() {
		return InventoryBAL.placeorderInventoryBal(stockid, quantityorder);
	}

}
