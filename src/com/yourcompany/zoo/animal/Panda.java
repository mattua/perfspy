package com.yourcompany.zoo.animal;

import com.yourcompany.zoo.people.Trainer;

public class Panda extends Animal{

	public Panda(String name, Trainer trainer) {
		super(name, trainer);		
	}

	@Override
	public void playTricks() {	
		beingCute();
	}
	
	private String beingCute(){
		return "being cute...";
	}
	
}
