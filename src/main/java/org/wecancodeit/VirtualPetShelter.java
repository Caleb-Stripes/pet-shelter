package org.wecancodeit;

import java.util.HashMap;

public class VirtualPetShelter {

	private int newPetHunger;
	private int newPetThirst;
	private int newPetBoredom;
	private String newPetName = null;
	private String newPetStatus = "Alive";
	private static int petKey = 0;
	
	public Object newPet(int newPetHunger, int newPetThirst, int newPetBoredom, Object newPetName,
			String newPetStatus) {
		return null;
	}

	HashMap<Integer, VirtualPet> shelter = new HashMap<Integer, VirtualPet>();
	
	public void addNewPetToShelter() {
		shelter.put(getPetKey(),getNewPet());
	}
	
	public int petsShelteredForAllTime;
	
	public static int getPetKey() {
		petKey = (petKey + 1);
		return petKey;
		
	}
	
	public int getNewPetHunger() {
		return newPetHunger;

	}

	public int setNewPetHunger(int newPetHunger) {
		this.newPetHunger = newPetHunger;
		return newPetHunger;
	}

	public int getNewPetThirst() {
		return newPetThirst;
	}

	public int setNewPetThirst(int newPetThirst) {
		this.newPetThirst = newPetThirst;
		return newPetThirst;
	}

	public int getNewPetBoredom() {
		return newPetBoredom;
	}

	public void setPetBoredom(int newPetBoredom) {
		this.newPetBoredom = newPetBoredom;

	}

	//This method should return the new pets name
	//it should be used in a creation loop in the App
	public String getNewPetName() {
		//needs coding***
		return null;
	}

	//This method makes a new pet based on the VirtualPetShelter class variables
	public VirtualPet getNewPet() {
		VirtualPet newPet = new VirtualPet(newPetHunger, newPetThirst, newPetBoredom, newPetName, newPetStatus);

		return newPet;
	}

	//This method will create the blank slate for a new pet so that after pet creation
	//Variables will be reset...I am not certain I need this, unless for some reason
	//the variables where to be static.
	public void resetNewPetVariables() {
		newPetHunger = 0;
		newPetThirst = 0;
		newPetBoredom = 0;
		newPetName = null;
		newPetStatus = null;
	}

	int shelterSize;
	//This method will give us the number of pets currently in the shelter
	public int getShelterSize() {
		this.shelterSize = shelter.size();
		return this.shelterSize;
	}
	
	//This is a representation of the cost to manage the shelter based on number of pets
	public Object Tick() {
		int cost = (getShelterSize() * 2);
		return cost;
	}

}
