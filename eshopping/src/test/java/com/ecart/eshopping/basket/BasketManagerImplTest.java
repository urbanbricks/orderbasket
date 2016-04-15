package com.ecart.eshopping.basket;

import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;
import com.ecart.eshopping.exception.ValidationException;

public class BasketManagerImplTest {

	@Test
	public void testCalculateBasketTotalWithDefaultPrice() {
		BasketItem bananas = new Bananas();
		BasketItem oranges = new Apples();
		BasketItem apples = new Oranges();
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket); 
			Assert.assertEquals(8.58, basketTotal.doubleValue(), 0);basketManagerImpl.computeBasketTotal(basket);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCalculateBasketTotalWithAmendedPrice() {
		BasketItem bananas = new Bananas();
		bananas.setPrice(BigDecimal.valueOf(1));
		BasketItem oranges = new Apples();
		oranges.setPrice(BigDecimal.valueOf(1));
		BasketItem apples = new Oranges();
		apples.setPrice(BigDecimal.valueOf(1));
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket); 
			Assert.assertEquals(12, basketTotal.doubleValue(), 0);basketManagerImpl.computeBasketTotal(basket);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testBasketWithNoItem() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		Basket basket = new Basket();
		basketManagerImpl.computeBasketTotal(basket); 
		BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket); 
		Assert.assertEquals(0, basketTotal.doubleValue(), 0);basketManagerImpl.computeBasketTotal(basket);
	}
	
	@Test(expected=ValidationException.class)
	public void testNullBasket() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		basketManagerImpl.computeBasketTotal(null); 

	}
	
	@Test(expected=ValidationException.class)
	public void testNullItemInBasket() {
		BasketItem bananas = new Bananas();
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
			basket.addBasketItem(bananas);
			basket.addBasketItem(null);
			basketManagerImpl.computeBasketTotal(basket); 
	}
	
	@Test(expected=ValidationException.class)
	public void testNullPriceForItem() {
		BasketItem bananas = new Bananas();
		BasketItem oranges = new Apples();
		oranges.setPrice(null);
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basketManagerImpl.computeBasketTotal(basket); 
	}
}
