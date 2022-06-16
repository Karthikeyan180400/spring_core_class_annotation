package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCow {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Cow cow = (Cow) applicationContext.getBean("cow");
		cow.eat();
	}

}
