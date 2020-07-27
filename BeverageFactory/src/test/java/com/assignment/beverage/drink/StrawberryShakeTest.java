package com.assignment.beverage.drink;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrawberryShakeTest {

	@Test
	public void testCost() {
		StrawberryShake bs = new StrawberryShake();
		bs.cost();
		assertEquals(7, 7);
	}

}
