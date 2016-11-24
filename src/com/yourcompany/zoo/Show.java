package com.yourcompany.zoo;

import com.yourcompany.zoo.animal.Animal;
import com.yourcompany.zoo.animal.Dolphin;
import com.yourcompany.zoo.animal.Panda;
import com.yourcompany.zoo.people.Trainer;

public class Show {
	public void startAShow(String type) throws Exception {
		Trainer trainer;
		Animal animal;

		if (type.equals("dolphin")) {
			trainer = new Trainer("Lucy");
			animal = new Dolphin("Noodle", trainer);
		} else {
			trainer = new Trainer("xiaowang");
			animal = new Panda("lingling", trainer);
		}

		animal.playTricks();
	}

	public static void main(String[] args) throws Exception {
		new Show().startAShow(args[0]);
	}
}
