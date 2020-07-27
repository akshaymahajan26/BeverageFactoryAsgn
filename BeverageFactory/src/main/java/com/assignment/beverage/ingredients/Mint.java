package com.assignment.beverage.ingredients;

public class Mint extends Condiment{
	Beverage beverage;

	public Mint(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() - 0.5;
	}

}
