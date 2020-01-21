package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String shelter = "funded";
		
		do {
			for (int funds = 1; funds > 0; VirtualPetShelter.Tick()) {
			if (funds == 0) {
				shelter = "unfunded";
				break;
			}
			}
		} while (shelter.contentEquals("funded"));
/*Menu you to give options
 * scanner input to choose option
 * option to put in a new pet method programmed .put
 * option to check on a new pet
 * option to see the shelter
 * option to see a specific pet
 * option to adopt a pet... .remove?
 * option to walk a pet
 * option to feed a pet
 * option to water a pet
 */
		
		input.close();
	}

}
