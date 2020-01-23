package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetApp {
	public static String name;
	public static String description;
	public static void main(String[] args) {

		VirtualPetShelter pets = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		int x = 0;
		do {

			System.out.println("");

			// check pets in shelter
			System.out.println("Would you like to see the Roster? y/n");
			String answer = input.nextLine();
			if (answer.contains("y")) {
				pets.getRoster();
			}
			System.out.println("");

			// caring for pets
			careMenu();
			String userChoice = input.nextLine();

			// admittance
			if (userChoice.contentEquals("0")) {
				System.out.println("What is the pet's name?");
				name = input.nextLine();
				System.out.println("Describe" + name);
				description = input.nextLine();
				VirtualPet pet = new VirtualPet(0, 0, 0, getName(), "Alive", getDescription());
				pets.addNewPetToShelter(pet);
			}
			//feed them
			if (userChoice.contains("1")) {
				pets.feedAll();
				System.out.println("Pets love food!");
				System.out.println("");
			}
			//water them
			else if (userChoice.contentEquals("2")) {
				pets.waterAll();
				System.out.println("They lap it up!");
				System.out.println("");
			} 
			//play with them
			else if (userChoice.contentEquals("3")) {
				pets.walkAll();
				System.out.println("Riots at the pet park!");
				System.out.println("");
			} 
			//ignore them
			else if (userChoice.contentEquals("4")) {
				System.out.println("Sad eyes watch you.");
				System.out.println("");
			} 
			else if (userChoice.contentEquals("end")) {
				x = 1;
				System.out.println("");
			} 
			//adopting
			else if (userChoice.contains("5")) {
				System.out.println("Who would you like to adopt?");
				pets.getRoster();
				System.out.println("Type the name exactly as it appears.");
				String userAdopt = input.nextLine();
				pets.adoptPet(userAdopt);
				System.out.println("You and " + userAdopt + " have a nice life toghether.");
				System.out.println("");
			}
			else if (userChoice.contains("6")) {
				System.out.println("Who do you want to play with?");
				pets.getRoster();
				System.out.println("Type the name exactly as it appears.");
				String userPlay = input.nextLine();
				pets.playPet(userPlay);
				System.out.println("");
			}
			else {
			}
			// tick
			pets.tickThePets();
		} while (x == 0);

		System.out.println("This shelter has been closed.");
		input.close();
	}

	private static String getDescription() {
		
		return description;
	}

	private static void careMenu() {
		System.out.println("Here are care optons:");
		System.out.println(" 0. Add a pet to the shelter.");
		System.out.println(" 1. Feed All Pets");
		System.out.println(" 2. Water All Pets");
		System.out.println(" 3. Walk All Pets");
		System.out.println(" 4. Skip Care");
		System.out.println(" 5. Adopt a pet");
		System.out.println(" To leave the shelter type \" end \"");

	}

	private static String getName() {
		return name;
	}

}
