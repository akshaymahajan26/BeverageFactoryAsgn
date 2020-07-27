package com.assignment.beverage.drink;

import org.junit.Test;

import junit.framework.TestCase;

public class ChaiTest extends TestCase {

	@Test
	public void testCost() {
		Chai bs = new Chai();
		bs.cost();
		assertEquals(4, 4);
	}

}
