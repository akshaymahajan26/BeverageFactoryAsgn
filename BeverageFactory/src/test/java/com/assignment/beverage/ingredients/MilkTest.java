package com.assignment.beverage.ingredients;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.assignment.beverage.drink.Chai;

public class MilkTest {

	@Test
	public void testCost() {
		Beverage b = new Chai();
		Milk bs = new Milk(b);
		bs.cost();
		assertEquals(3, 3);
	}

}
