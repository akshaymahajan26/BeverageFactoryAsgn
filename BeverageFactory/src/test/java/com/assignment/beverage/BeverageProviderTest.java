package com.assignment.beverage;

import org.junit.Before;
import org.junit.Test;

import com.assignment.beverage.ingredients.Beverage;

import junit.framework.TestCase;

public class BeverageProviderTest extends TestCase {

	@Test
	public void testOrderEvalCorrectOrder() {
		BeverageProvider bp = new BeverageProvider();
		Beverage bv = null;
		assertNotNull(bp.orderEval(bv, "Chai"));
	}
	
	@Test
	public void testOrderEvalIncorrectOrder() {
		BeverageProvider bp = new BeverageProvider();
		Beverage bv = null;
		assertNull(bp.orderEval(bv, "Test"));
	}
	
	

}
