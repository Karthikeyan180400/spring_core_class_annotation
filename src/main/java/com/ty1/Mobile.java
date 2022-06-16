package com.ty1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	Sim sim;

	void seeSim() {
		sim.simName();
	}

}
