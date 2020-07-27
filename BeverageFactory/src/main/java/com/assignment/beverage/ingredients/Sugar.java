package com.assignment.beverage.ingredients;

public class Sugar extends Condiment {
	Beverage beverage;

	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() - 0.5;
	}

}
