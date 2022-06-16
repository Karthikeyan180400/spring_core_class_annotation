package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCarMusicSystem {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCofig.class);
		Car car = (Car) applicationContext.getBean("car");
		car.playSong();
	}

}
