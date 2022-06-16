package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMobileSim {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCofig.class);
		Mobile mobile = (Mobile) applicationContext.getBean("mobile");
		mobile.seeSim();
	}

}
