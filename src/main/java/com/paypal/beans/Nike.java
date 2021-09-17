package com.paypal.beans;

import org.springframework.stereotype.Component;

@Component
public class Nike implements Organization {

	@Override
	public String slogan() {
		// TODO Auto-generated method stub
		return "Just Do It";
	}

}
