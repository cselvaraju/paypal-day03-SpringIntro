package com.paypal.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nikeSloganService")
@Qualifier("nikeSlogan")
public class NikeSloganService implements SloganService {

	@Override
	public String generateSlogan() {
		// TODO Auto-generated method stub
		return "Just Do It";
	}

}
