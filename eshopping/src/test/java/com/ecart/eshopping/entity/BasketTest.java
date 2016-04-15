package com.ecart.eshopping.entity;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;
import com.ecart.eshopping.exception.ValidationException;

public class BasketTest {
	
	@Test
	public void testBasketaddedItems() {
		BasketItem bananas = new Bananas();
		BasketItem oranges = new Apples();
		BasketItem apples = new Oranges();
		Basket basket = new Basket();
		basket.addBasketItem(bananas);
		basket.addBasketItem(oranges);
		basket.addBasketItem(apples);
		Assert.assertTrue(basket.getListItems().contains(bananas));
		Assert.assertTrue(basket.getListItems().contains(oranges));
		Assert.assertTrue(basket.getListItems().contains(apples));
	}
	
}
