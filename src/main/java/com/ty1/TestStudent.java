package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCofig.class);
		Student student = (Student) applicationContext.getBean("student");
		student.display();

	}
}
