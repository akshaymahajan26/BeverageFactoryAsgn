package com.assignment.beverage.ingredients;

public class Water extends Condiment{
	Beverage beverage;

	public Water(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() - 0.5;
	}

}
