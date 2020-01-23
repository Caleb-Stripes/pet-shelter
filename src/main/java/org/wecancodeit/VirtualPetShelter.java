package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int petKey;
	private int totalKeys;

	private Map<Integer, VirtualPet> shelter = new HashMap<Integer, VirtualPet>();

	public Collection<VirtualPet> getAllPets() {
		return shelter.values();
	}

	public int getPetKey() {
		totalKeys++;
		petKey = (totalKeys);
		return petKey;
	}

	public void tickThePets() {
		for (VirtualPet pet : getAllPets()) {
			pet.tick();
			pet.getStatus();
			if (pet.status.contains("Dead")) {
				System.out.println(pet.getPetName() + " has left this world behind.");
				shelter.remove(this.petKey);
			}
		}
	}

	public String newPetName;

	public String getNewPetName() {
		return newPetName;
	}

	public void addNewPetToShelter(VirtualPet pet) {
		shelter.put(getPetKey(), pet);
	}

	public void getRoster() {
		for (VirtualPet pet : getAllPets()) {
			System.out.println(this.petKey + pet.petName);
		}
	}

	public void feedAll() {
		for (VirtualPet pet : getAllPets()) {
			pet.eat();
		}
		
	}

	public void waterAll() {
		for (VirtualPet pet : getAllPets()) {
			pet.drink();
		}
		
	}

	public void walkAll() {
		for (VirtualPet pet : getAllPets()) {
			pet.play();
		}
		
	}
	
	


	
	
	
}
	
	
	// was designed to enter custom not default values for the parameters of a new pet	
//	private int newPetHunger;
//	private int newPetThirst;
//	private int newPetBoredom;
//	private String newPetName = null;
//	private String newPetStatus = "Alive";
// methods to return the new pets parameter values for new pet initialization	
//	public int getNewPetHunger() {
//		return newPetHunger;
//
//	}
//
//	public int setNewPetHunger(int newPetHunger) {
//		this.newPetHunger = newPetHunger;
//		return newPetHunger;
//	}
//
//	public int getNewPetThirst() {
//		return newPetThirst;
//	}
//
//	public int setNewPetThirst(int newPetThirst) {
//		this.newPetThirst = newPetThirst;
//		return newPetThirst;
//	}
//
//	public int getNewPetBoredom() {
//		return newPetBoredom;
//	}
//
//	public void setPetBoredom(int newPetBoredom) {
//		this.newPetBoredom = newPetBoredom;
//
//	}

	// This method will create the blank slate for a new pet so that after pet
	// creation
	// Variables will be reset...I am not certain I need this, unless for some
	// reason
	// the variables where to be static.

// used for custom new pet parameter values
//	int shelterSize;
//	//This method will give us the number of pets currently in the shelter
//	public int getShelterSize() {
//		this.shelterSize = shelter.size();
//		return this.shelterSize;
//	}
//	
//	public int funds;

//	//This is a representation of the cost to manage the shelter based on number of pets
//	public Object Tick() {
//		int cost = (getShelterSize() * 2);
//		return (funds - cost);
//	}

