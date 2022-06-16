package com.ty1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "1")
	int id;
	@Value(value = "Karthi")
	String name;
	@Value(value = "84.3")
	double percentage;

	public void display() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Percentage " + percentage);
	}

}
