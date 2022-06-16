package com.ty1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	double salary;

	@Value(value = "100")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "Karthikeyan")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "25000")
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
	}

}
