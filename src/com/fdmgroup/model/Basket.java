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
	
   public void addFruit(String name, Integer quantity) {
	   Fruit fruit = FruitInventory.loadFruit(name);
   	   if(fruit != null) {
	      items.put(fruit, quantity);
	      System.out.println(fruit);
   	   }else {
   		   System.out.println("Fruit not added");
   	   }
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
