package com.fdmgroup.model;

import java.util.Map;

public class Checkout {
	
	public double calculatePrice(Basket basket) {
		Map<Fruit, Integer> items = basket.getItems();
		double total=0.0; 
		for(Map.Entry entry: items.entrySet()) {
			Fruit fruit = (Fruit) entry.getKey();
			Integer quantity = (Integer) entry.getValue();
			total += (quantity * fruit.getPrice());  
		}
		return total;
	}
}
