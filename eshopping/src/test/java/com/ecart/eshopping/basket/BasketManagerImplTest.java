package com.ecart.eshopping.basket;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Collections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;
import com.ecart.eshopping.exception.ValidationException;

public class BasketManagerImplTest {

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
	public void testCalculateBasketTotalWithDefaultPrice() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket);
			Assert.assertEquals(8.58, basketTotal.doubleValue(), 0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}

	}

	@Test
	public void testCalculateBasketTotalWithAmendedPrice() {
		bananas.setPrice(BigDecimal.valueOf(1));
		oranges.setPrice(BigDecimal.valueOf(1));
		apples.setPrice(BigDecimal.valueOf(1));
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket);
			Assert.assertEquals(12, basketTotal.doubleValue(), 0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}

	}

	@Test(expected = ValidationException.class)
	public void when_Basket_Is_Empty_Exception_isThrown() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket);
		Assert.assertEquals(0, basketTotal.doubleValue(), 0);
	}

	@Test(expected = ValidationException.class)
	public void when_basket_Null_Expection_Thrown() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		basketManagerImpl.computeBasketTotal(null);

	}

	@Test(expected = ValidationException.class)
	public void testNullItemInBasket() {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		basket.addBasketItem(Collections.EMPTY_LIST);
		basketManagerImpl.computeBasketTotal(basket);
	}

	@Test(expected = ValidationException.class)
	public void testNullPriceForItem() {
		oranges.setPrice(null);
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		basket.addBasketItem(bananas);
		basket.addBasketItem(oranges);
		basketManagerImpl.computeBasketTotal(basket);
	}
}
