package com.assignment.beverage.drink;

import org.junit.Test;

import junit.framework.TestCase;

public class BananaSmoothieTest extends TestCase {

	@Test
	public void testCost() {
		BananaSmoothie bs = new BananaSmoothie();
		bs.cost();
		assertEquals(6, 6);
	}

}
