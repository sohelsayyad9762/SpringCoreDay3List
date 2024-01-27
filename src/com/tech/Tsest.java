package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tsest {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e1= (Employee) ctx.getBean("e");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getMobilnumber());
		System.out.println(e1.getNumber());
		System.out.println(e1.getMaps());

	}

}
