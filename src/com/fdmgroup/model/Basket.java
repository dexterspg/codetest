package com.fdmgroup.model;

import java.util.HashMap;
import java.util.Map;

public class Basket {
	
	private String name;
	private Map<Fruit, Integer> items;
	
	public Basket() {
		super();
	    this.items = new HashMap<>();
	}

	public Basket(String name) {
		super();
		this.name = name;
		this.items = new HashMap<>();
	}
	
   public void addFruit(String name, double price, Integer quantity) {
	   	   Fruit fruit = new Fruit(name,price);
		   items.put(fruit, quantity);
   }
   
   public void addFruit(Fruit fruit, Integer quantity) {
	   items.put(fruit, quantity);
   }
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Fruit, Integer> getItems() {
		return items;
	}

	public void setItems(Map<Fruit, Integer> items) {
		this.items = items;
	}

	 
	
	
}
