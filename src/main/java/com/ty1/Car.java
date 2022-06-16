package com.ty1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	MusicSystem musicSystem;

	public Car(@Autowired MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public void playSong() {
		musicSystem.play();

	}
}
