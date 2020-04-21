package com.fdmgroup.model;

public class Apple implements Fruit {

	double amount = 4.53;
	
	@Override
	public double getPrice() {
		return amount;
	}

}
