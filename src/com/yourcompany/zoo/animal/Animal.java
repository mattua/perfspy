package com.yourcompany.zoo.animal;

import com.yourcompany.zoo.people.Trainer;

public abstract class Animal {
	
	
	public static void main(String[] args){
		
		System.out.println("Hey mate");
		
	}
	
	private String name;
	private Trainer trainer;

	public Animal(String name, Trainer trainer) {
		super();
		this.name = name;
		this.trainer = trainer;
	}

	public String getName() {
		return name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public abstract void playTricks() throws Exception;
}
