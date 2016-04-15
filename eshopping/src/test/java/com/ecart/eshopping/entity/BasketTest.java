package com.ecart.eshopping.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.helper.BasketItemsHelper;

/**
 * Test Basket class
 * @author selvaps
 *
 */
public class BasketTest {

	private Basket basket ; 
	
	
	@Before
	public void setUp() throws Exception {
		basket = new Basket();
	}
	
	/**
	 * Test single item added to basket
	 */
	@Test
	public void testSingleItemaddedToBasket() {
		basket.addBasketItem(new Bananas());
		assertEquals(1 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of apples added to basket
	 */
	@Test
	public void testApplesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getApples(2));
		assertEquals(2 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of bananas added to basket
	 */
	@Test
	public void testBananasAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getBananas(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of oranges added to basket
	 */
	@Test
	public void testOrangesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getOranges(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of lemons added to basket
	 */
	@Test
	public void testLemonsAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getLemons(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of peaches added to basket
	 */
	@Test
	public void testPeachesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getPeaches(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
}
