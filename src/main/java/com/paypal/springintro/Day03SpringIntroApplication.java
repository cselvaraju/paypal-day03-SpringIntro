package com.paypal.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paypal.beans.CocaCola;
import com.paypal.beans.CollectionsDI;
import com.paypal.beans.Greeting;
import com.paypal.beans.Person;

@SpringBootApplication
public class Day03SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day03SpringIntroApplication.class, args);
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Greeting greeter = (Greeting) ctx.getBean("myBean");
//		System.out.println(greeter.greet());
//		
//		Greeting g2 = (Greeting) ctx.getBean("secondBean");
//		System.out.println(g2.greet());
//		
//		CocaCola coke = (CocaCola) ctx.getBean("coke");
//		System.out.println(coke);
//		
//		CocaCola coke2 = (CocaCola) ctx.getBean("coke2");
//		System.out.println(coke2);
//		
//		CocaCola coke3 = (CocaCola) ctx.getBean("coke3");
//		System.out.println(coke3);
//		
//		CocaCola coke4 = (CocaCola) ctx.getBean("coke4");
//		System.out.println(coke4);
//		
//		CocaCola coke5 = (CocaCola) ctx.getBean("coke5");
//		System.out.println(coke5);
//	
//		CocaCola coke6 = (CocaCola) ctx.getBean("coke6");
//		System.out.println(coke6);
//		
//		CocaCola coke7 = (CocaCola) ctx.getBean("coke7");
//		System.out.println(coke7);
//		
//		Person second = (Person) ctx.getBean("secondPerson");
//		System.out.println(second);
//		
////		Person p = ctx.getBean("firstPerson", Person.class);
////		System.out.println(p);
////		
////		System.out.println("----------");
////		
////		Person p2 = ctx.getBean("firstPerson", Person.class);
////		System.out.println(p2);
//		
//		((ClassPathXmlApplicationContext)ctx).close();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collections-beans.xml");
		CollectionsDI myCollection = (CollectionsDI) context.getBean("myCollectionBean");
		System.out.println(myCollection);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
