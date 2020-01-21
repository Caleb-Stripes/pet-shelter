package org.wecancodeit;

import java.util.HashMap;

public class VirtualPetShelter {

	private int newPetHunger;
	private int newPetThirst;
	private int newPetBoredom;
	private String newPetName = null;
	private String newPetStatus = "Alive";
	private int petIndex;
	
	public Object newPet(int newPetHunger, int newPetThirst, int newPetBoredom, Object newPetName,
			String newPetStatus) {
		return null;
	}

	HashMap<Integer, VirtualPet> shelter = new HashMap<Integer, VirtualPet>();
	
	public void addNewPetToShelter() {
		shelter.put(getPetIndex(),getNewPet());
	}
	
	public int getPetIndex() {
		this.petIndex = (shelter.size() + 1);
		return this.petIndex;
		
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

	public String getNewPetName() {
		// TODO Auto-generated method stub
		return null;
	}

	public VirtualPet getNewPet() {
		VirtualPet newPet = new VirtualPet(newPetHunger, newPetThirst, newPetBoredom, newPetName, newPetStatus);

		return newPet;
	}

	public void resetNewPetVariables() {
		newPetHunger = 0;
		newPetThirst = 0;
		newPetBoredom = 0;
		newPetName = null;
		newPetStatus = null;
	}

}
