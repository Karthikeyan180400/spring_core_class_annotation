package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCofig.class);
		Employee employee = (Employee) applicationContext.getBean("employee");
		employee.display();
	}

}
