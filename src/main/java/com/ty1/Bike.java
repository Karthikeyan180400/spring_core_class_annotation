package com.ty1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	Engine engine;

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.on();

	}
}
