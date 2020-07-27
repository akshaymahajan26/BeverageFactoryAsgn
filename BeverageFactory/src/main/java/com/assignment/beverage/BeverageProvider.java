package com.assignment.beverage;

import java.util.ArrayList;
import java.util.List;

import com.assignment.beverage.drink.*;
import com.assignment.beverage.ingredients.*;

public class BeverageProvider {

	public static void main(String[] args) {

		Beverage beverage = null;
		double cost = 0.0;
		List<String> sampleOrders = new ArrayList<>();
		sampleOrders.add("Chai, -sugar");
		sampleOrders.add("Chai, -sugar, -milk");
		sampleOrders.add("Chai");
		sampleOrders.add("[\"Chai, -sugar\", \"Chai\", \"Coffee, -milk\"] ");
		
		for (String sampleOrder : sampleOrders) {
			if (sampleOrder.charAt(0) != '[') {
				beverage = orderEval(beverage, sampleOrder);
				cost = beverage.cost();
				System.out.println("Your order costs: $" + cost);
			} else {
				String bulkOrder = sampleOrder.replaceAll("[\\[\\](){}]", "");
				String[] multipleOrders = bulkOrder.split("\",");
				for (String orderedBeverage : multipleOrders) {
					beverage = orderEval(beverage, orderedBeverage);
					cost = cost + beverage.cost();
				}
				System.out.println("Your multiple orders costs: $" + cost);
			}
		}
	}

	public static Beverage orderEval(Beverage beverage, String order) {

		String[] arr = order.split(",");
		if (arr.length >= 1) {
			String switchCheck = arr[0].trim().replace("\"", "");
			switch (switchCheck) {
			case "Chai":
				beverage = new Chai();
				if (arr.length >= 2) {
					beverage = checkConditments(arr, beverage, 1);
				}
				break;

			case "Coffee":
				beverage = new Coffee();
				if (arr.length >= 2) {
					beverage = checkConditments(arr, beverage, 1);
				}
				break;

			case "Banana Smoothie":
				beverage = new BananaSmoothie();
				if (arr.length >= 2) {
					beverage = checkConditments(arr, beverage, 1);
				}
				break;

			case "Strawberry Shake":
				beverage = new StrawberryShake();
				if (arr.length >= 2) {
					beverage = checkConditments(arr, beverage, 1);
				}
				break;

			case "Mojito":
				beverage = new Mojito();
				if (arr.length >= 2) {
					beverage = checkConditments(arr, beverage, 1);
				}
				break;

			default:
				System.out.println(switchCheck + " is an Invalid order made");
				break;
			}

		}
		return beverage;

	}

	public static Beverage checkConditments(String[] arr, Beverage beverage, int startIndex) {
		for (int i = startIndex; i < arr.length; i++) {
			String switchCheck = arr[i].trim().replace("\"", "");
			switch (switchCheck) {
			case "-milk":
				beverage = new Milk(beverage);
				break;
			case "-sugar":
				beverage = new Sugar(beverage);
				break;
			case "-mint":
				beverage = new Mint(beverage);
				break;
			case "-water":
				beverage = new Water(beverage);
				break;
			case "-soda":
				beverage = new Soda(beverage);
				break;
			default:
				System.out.println(switchCheck + " is an   Invalid condiments made");
				break;
			}
		}
		return beverage;
	}

}
