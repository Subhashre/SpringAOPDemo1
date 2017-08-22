package org.subha.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.subha.services.CustomerService;

public class app {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		CustomerService customerService=(CustomerService) ac.getBean("customerServiceProxy");
		System.out.println("*********************************");
		customerService.printName();
		System.out.println("*********************************");
		customerService.printURL();
		System.out.println("*********************************");
		customerService.printThrowException();
	}

}
