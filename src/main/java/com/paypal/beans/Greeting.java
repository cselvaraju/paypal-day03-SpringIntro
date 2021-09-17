package com.paypal.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myGreeting")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Greeting {

	private String message;

	public Greeting() {
		System.out.println("Creating Greeting instance using default constructor");
		message = "Default message";
	}

	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String greet() {
		return getMessage();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method Called...");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp method called...");
	}
}
