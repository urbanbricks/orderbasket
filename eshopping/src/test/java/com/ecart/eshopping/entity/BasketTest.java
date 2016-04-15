package com.ecart.eshopping.entity;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.helper.BasketItemsHelper;

import static org.junit.Assert.*;

public class BasketTest {

	private BasketItem bananas ; 
	private BasketItem apples ; 
	private BasketItem oranges ; 
	private Basket basket ; 
	
	
	@Before
	public void setUp() throws Exception {
		basket = new Basket();
	}
	
	/**
	 * Test all added items are available in the basket
	 */
	@Test
	public void testApplesAddedToBasket() {
		basket.addBasketItem(BasketItemsHelper.getBananas(2));
		assertEquals(2 , basket.getItemsInBasket().size() ) ;
		
	}
	
	// More tests for each fruit . // apple, peaches ...
}
