package com.fdmgroup.test;


import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Fruit;

public class BasketTest {
	
	private Basket basket;
	Map<Fruit, Integer> items;
	
	@Before
	public void init() {
		basket = new Basket();
	}
	
	@Test
    public void testBasket_ifNoItemAdded_ReturnListSizeofZero(){
    	
    	items = basket.getItems();
    	assertEquals(0, items.size());	
    }
	
	@Test 
	public void testBasket_ifAppleItemAddedWithSizeOf3_ReturnSizeOfThree(){
		Fruit apple = new Fruit("Apple", 4.53);
		basket.addFruit(apple, 3);
		items = basket.getItems();
		int quantity = 0;
		if(items.containsKey(apple)) {
			 quantity = items.get(apple);
		}
    	assertEquals(3, quantity);
	}
	
	
	@Test 
	public void testBasket_ifPeachItemAddedWithTotalSizeOf5_ReturnSizeOfFive(){
		Fruit apple = new Fruit("Apple", 4.53);
		Fruit peach = new Fruit("Peach", 1.32);
		basket.addFruit(peach, 5);
		basket.addFruit(apple, 2);
		items = basket.getItems();
		int quantity = 0;
		if(items.containsKey(peach)) {
			 quantity = items.get(peach);
		}
    	assertEquals(5, quantity);
	}
	
	
}
