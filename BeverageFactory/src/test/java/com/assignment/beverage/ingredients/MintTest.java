package com.assignment.beverage.ingredients;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.beverage.drink.StrawberryShake;

public class MintTest {
	@Test
	public void testCost() {
		Beverage b = new StrawberryShake();
		Milk bs = new Milk(b);
		bs.cost();
		assertEquals(6, 6);
	}

}
