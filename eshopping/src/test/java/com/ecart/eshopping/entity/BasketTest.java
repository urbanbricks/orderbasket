package com.ecart.eshopping.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;

public class BasketTest {

	// some fruits
	BasketItem bananas, oranges, apples;

	Basket basket;

	@Before
	public void setUp() throws Exception {
		bananas = new Bananas();
		oranges = new Apples();
		apples = new Oranges();

		basket = new Basket();
	}

	@Test
	public void testBasketaddedItems() {
		basket.addBasketItem(bananas);
		basket.addBasketItem(oranges);
		basket.addBasketItem(apples);
		Assert.assertTrue(basket.getListItems().contains(bananas));
		Assert.assertTrue(basket.getListItems().contains(oranges));
		Assert.assertTrue(basket.getListItems().contains(apples));
	}

}
