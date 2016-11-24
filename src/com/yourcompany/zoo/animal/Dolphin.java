package com.yourcompany.zoo.animal;

import java.util.ArrayList;
import java.util.List;

import com.yourcompany.zoo.people.Trainer;

public class Dolphin extends Animal {
	private List friends = new ArrayList();

	public Dolphin(String name, Trainer trainer) {
		super(name, trainer);
		friends.add(trainer);
		//a bit narcissistic, friends with himself 100 times
		for (int i = 0; i < 100; i++) {
			friends.add(this);
		}
	}

	@Override
	public void playTricks() throws Exception {
		shakeHands(this.getTrainer());

		tailWalk(10);

		for (int i = 0; i < 5; i++) {
			backflip(i);
		}
	}

	private void addFriend(Object friend) {
		this.friends.add(friend);
	}

	private void tailWalk(int length) {
		System.out.println(this.getName() + " is tail walking " + length + " meters ...");
	}

	private void backflip(int index) throws Exception {
		System.out.println(this.getName() + " is backflipping " + index + " time ...");
		//mimic slow methods
		Thread.sleep(1 * 1000);
	}

	private void shakeHands(Trainer trainer) {
		System.out.println(this.getName() + " is shaking hands with " + trainer.getName() + " ...");
		trainer.award(this);
	}
}
