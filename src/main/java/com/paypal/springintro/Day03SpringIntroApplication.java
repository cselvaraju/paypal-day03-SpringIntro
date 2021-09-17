package com.paypal.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paypal.beans.CocaCola;
import com.paypal.beans.Greeting;
import com.paypal.beans.Organization;

@SpringBootApplication
public class Day03SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day03SpringIntroApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
		
//		Greeting greeting = (Greeting) context.getBean("myGreeting");
//		System.out.println("Hashcode: " + greeting.hashCode());
//		System.out.println(greeting.greet());
//		
//		System.out.println("=========");
//		
//		Greeting g2 = (Greeting) context.getBean("myGreeting");
//		System.out.println("Hashcode: " + g2.hashCode());
//		System.out.println(g2.greet());
		
//		CocaCola coke = (CocaCola) context.getBean("cocaCola");
//		System.out.println(coke.slogan());
		
		
		// Let's use the interface Organization instead
		// This promotes loose coupling
		
//		Organization org = (Organization) context.getBean("newCokeBean");
//		System.out.println(org);
		
//		Organization org = (Organization) context.getBean("myCokeBean");
//		System.out.println(org);
		
//		org = (Organization) context.getBean("nike");
//		System.out.println(org.slogan());
		
		Greeting greeting = (Greeting) context.getBean("myGreeting");
		System.out.println(greeting.greet());;
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
