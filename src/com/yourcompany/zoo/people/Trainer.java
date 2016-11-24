package com.yourcompany.zoo.people;

import com.yourcompany.zoo.animal.Dolphin;

public class Trainer {
	private String name;
		
	public Trainer(String name) {	
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String award(Dolphin dolphin){
		return "10 fish";
	}
	
	public static void main(String[] args){
		
		System.out.println("Boom");
	}
	
}
