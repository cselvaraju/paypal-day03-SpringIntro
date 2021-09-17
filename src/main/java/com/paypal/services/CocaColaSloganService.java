package com.paypal.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cokeSloganService")
@Qualifier("cokeSlogan")
public class CocaColaSloganService implements SloganService {

	@Override
	public String generateSlogan() {
		return "Open Happiness";
	}

}
