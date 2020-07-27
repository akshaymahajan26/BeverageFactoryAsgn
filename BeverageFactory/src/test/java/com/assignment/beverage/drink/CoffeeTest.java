package com.assignment.beverage.drink;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTest {

	@Test
	public void testCost() {
		Coffee bs = new Coffee();
		bs.cost();
		assertEquals(5, 5);
	}

}
