package com.assignment.beverage.ingredients;

public class Soda extends Beverage{

	Beverage beverage;

	public Soda(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() - 0.5;
	}

}
