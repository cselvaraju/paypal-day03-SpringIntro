package com.paypal.beans;

public class CocaCola {

	private String tagLine;
	private int quantity;
	
	public CocaCola() { }
	
	public CocaCola(String tagLine) {
		this.tagLine = tagLine;
		this.quantity = -1;
	}

	public CocaCola(String tagLine, int quantity) {
		this.tagLine = tagLine;
		this.quantity = quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	@Override
	public String toString() {
		return "CocaCola [tagLine=" + tagLine + ", quantity=" + quantity + "]";
	}

}
