package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the new pets name?");
		String petName = input.nextLine();
		System.out.println("Welcome " + petName);
//		System.out.println(VirtualPetShelter.newName);
//		VirtualPetShelter.makeNewPet();
//		System.out.println("Welcome to the shelter " + VirtualPetShelter.getNewPetName());
//		
//		
		
		input.close();
	}

}
