package com.fdmgroup.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.model.Apple;
import com.fdmgroup.model.Basket;
import com.fdmgroup.model.Checkout;
import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.Peach;



public class CheckoutTest {
	Basket basket;
	Checkout checkout;
	private Map<Fruit, Integer> items;

	@Before
	public void init() {
		basket = new Basket();
		checkout = new Checkout();
		items = new HashMap<Fruit, Integer>();
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		double price = checkout.calculatePrice(basket);
		assertEquals(0.0, price, 0.01);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneFruitApple() {
		Apple apple = new Apple();
		basket.addFruit(apple, 1);
		
		double unitPriceApple = apple.getPrice(); 
		double price = checkout.calculatePrice(basket);
		assertEquals(unitPriceApple, price, 0.01);

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWith2FruitApples() {
		Apple apple = new Apple();
		basket.addFruit(apple, 2);
		double totalPrice=0.0;
		
		double unitPriceApple = apple.getPrice();
		double price = checkout.calculatePrice(basket);
		System.out.println(price);
		assertEquals(2 * unitPriceApple, price, 0.01);

	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWith2ApplesAndOnePeach() {
		Apple apple = new Apple();
		Peach peach = new Peach();
		
		double unitPriceApple = apple.getPrice();
		double unitPricePeach = peach.getPrice();
		
		basket.addFruit(apple, 2);
		basket.addFruit(peach, 1);
		double price = checkout.calculatePrice(basket);
		System.out.println(price);
		assertEquals(2 * unitPriceApple + unitPricePeach, price, 0.01);

	}
}
