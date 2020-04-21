package com.fdmgroup.model;

public class Lemon implements Fruit {

	double amount = 0.99;
	
	@Override
	public double getPrice() {
		return amount;
		
	}

}
