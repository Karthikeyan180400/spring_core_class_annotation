package com.ty1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	int id;
	String name;
	int age;

	public Person(@Value(value = "10") int id, @Value(value = "Karthi") String name, @Value(value = "18") int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Age " + age);
	}

}
