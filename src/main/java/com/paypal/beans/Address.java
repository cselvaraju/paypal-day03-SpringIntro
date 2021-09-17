package com.paypal.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private long pincode;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public long getPincode() {
		return pincode;
	}
	
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nAddress:\nHashcode: " + hashCode() +
				"City: " + city + " PinCode: " + pincode;
	}
	
	
}
