package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDog {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		Dog dog = (Dog) applicationContext.getBean("getDog");
		dog.play();
	}

}
