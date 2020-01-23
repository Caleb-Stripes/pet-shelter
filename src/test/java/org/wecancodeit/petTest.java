package org.wecancodeit;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class petTest {

	VirtualPet underTest = new VirtualPet(0, 0, 0, null, null, null);
	
		@Test
		public void hungerShouldBeZeroAtStart() {
			int  result = underTest.getHunger();
			assertEquals(0, result);
		}

		@Test
		public void thirstShouldBeZeroAtStart() {
			int result = underTest.getThirst();
			assertEquals(0, result);
		}
		
		@Test
		public void boredomShouldBeZeroAtStart() {
			int result = underTest.getBoredom();
			assertEquals(0, result);
		}
		
		@Test
		public void hungerShouldDecreaseBy3AfterEat() {
			underTest.shelterPet();
			int beforeEat = underTest.getHunger();
			underTest.eat();
			int result = underTest.getHunger();
			assertEquals(beforeEat-3, result);
		}
		
		@Test
		public void thirstShouldDecreaseBy5AfterDrink() {
			underTest.shelterPet();
			int beforeDrink = underTest.getThirst();
			underTest.drink();
			int result = underTest.getThirst();
			assertEquals(beforeDrink-5, result);
		}
		
		@Test
		public void boredomShouldDecreaseBy2AfterPlay() {
			underTest.shelterPet();
			int beforePlay = underTest.getBoredom();
			underTest.play();
			int result = underTest.getBoredom();
			assertEquals(beforePlay-2, result);
			
		}
		
		@Test
		public void ifHungerGoesBelowZeroShouldBeZero() {
			underTest.testPet();
			int beforeHunger = underTest.getHunger();
			underTest.eat();
			int afterHunger = underTest.getHunger();
			assertEquals(1, beforeHunger);
			assertEquals(0, afterHunger);
		}

		@Test
		public void tickShouldIncreaseAllBy1() {
			int boredomBeforeTick = underTest.getBoredom();
			int hungerBeforeTick = underTest.getHunger();
			int thirstBeforeTick = underTest.getThirst();
			underTest.tick();
			int boredomResult = underTest.getBoredom();
			int hungerResult = underTest.getHunger();
			int thirstResult = underTest.getThirst();
			assertEquals(boredomBeforeTick + 1, boredomResult);
			assertEquals(hungerBeforeTick + 1, hungerResult);
			assertEquals(thirstBeforeTick + 1, thirstResult);
		}
		
		@Test
		public void petStatusShouldBeDead() {
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			underTest.tick();
			String result = underTest.getStatus();
			assertEquals("Dead", result);
		}
		
		@Test
		public void shelterPetHungerShouldAllBe5() {
			underTest.shelterPet();
			int result = underTest.getHunger();
			assertEquals(5, result);
		}
		
		@Test
		public void shelterPetThirstShouldAllBe5() {
			underTest.shelterPet();
			int result = underTest.getThirst();
			assertEquals(5, result);
		}
		
		@Test
		public void shelterPetBoredomShouldAllBe5() {
			underTest.shelterPet();
			int result = underTest.getBoredom();
			assertEquals(5, result);
		}

}
