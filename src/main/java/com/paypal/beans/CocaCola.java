package com.paypal.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.paypal.services.SloganService;

@Component("myCokeBean")
public class CocaCola implements Organization {

	// Field Injection
//	@Autowired
//	@Qualifier("cokeSlogan")
	private SloganService sloganService;
	
	private int quantity = 99;
	

	// Constructor Injection
	@Autowired
	public CocaCola(@Qualifier("nikeSlogan") SloganService sloganService) {
		System.out.println("CocaCola Constructor Called...");
		this.sloganService = sloganService;
		System.out.println("Component state before exiting constructor");
		System.out.println(this);
	}
	
	public CocaCola(int quantity) {
		this.quantity = quantity;
	}
	
	// Setter Injection
//	@Autowired
//	public void setSloganService(@Qualifier("cokeSlogan") SloganService sloganService) {
//		System.out.println("CocaCola Setter setSloganService Called...");
//		this.sloganService = sloganService;
//	}
	
	
	@Override
	public String slogan() {
		return sloganService.generateSlogan();
	}

	public void setQuantity(int quantity) {
		System.out.println("Setter for quantity called...");
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CocaCola [sloganService=" + sloganService + ", quantity=" + quantity + "]";
	}

	
}
