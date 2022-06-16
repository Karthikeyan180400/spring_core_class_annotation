package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBikeEngine {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCofig.class);
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.start();
	}

}
