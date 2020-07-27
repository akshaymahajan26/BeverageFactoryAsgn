package com.assignment.beverage.ingredients;

public class Milk extends Condiment{
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() - 1;
	}
	
}
