package com.ecart.eshopping.basket.validator;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

/**
 * Test for BasketAndItemValidator
 * @author suresh
 *
 */

public class BasketAndItemValidatorTest {

	Basket basket;
	BasketAndItemValidator basketAndItemValidator;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		basketAndItemValidator = new BasketAndItemValidator();
	}
	
	/**
	 * Test a basket with no items and throw exception
	 */
	@Test(expected = ValidationException.class)
	public void testEmptyBasketAndThrowException() {
		basketAndItemValidator.validateBasketAndBasketItemList(basket);//basket is empty no item added
	}
	
	/**
	 * Test when the basket is null and throw exception
	 */
	@Test(expected = ValidationException.class)
	public void testNullBasketAndThrowExpection() {
		basket = null; //basket is null
		basketAndItemValidator.validateBasketAndBasketItemList(basket);//basket is empty no item added

	}
	
	/**
	 * Test when the basket item is null and throw exception
	 */
	@Test(expected = ValidationException.class)
	public void testForNullBasketItemThrowExpection() {
		basketAndItemValidator.validateBasketItem(null);//Item is null

	}
	
	/**
	 * Add a item with null price and test for exception
	 */
	@Test(expected = ValidationException.class)
	public void testItemPriceForNullAndthrowException() {
		BasketItem apples = new Apples();
		apples.setPrice(null);
		basketAndItemValidator.ensurePriceAvailableForItem(apples);
	}
	
	/**
	 * Add a item with zero price and test for exception
	 */
	@Test(expected = ValidationException.class)
	public void testItemPriceForNegativeAndthrowException() {
		BasketItem apples = new Apples();
		BigDecimal price = new BigDecimal(-1); 
		apples.setPrice(price.negate());
		basketAndItemValidator.ensurePriceAvailableForItem(apples);
	}
	
	/**
	 * Add a item with zero price and test for exception
	 */
	@Test(expected = ValidationException.class)
	public void testItemPriceForZeroAndthrowException() {
		BasketItem apples = new Apples();
		apples.setPrice(BigDecimal.ZERO);
		basketAndItemValidator.ensurePriceAvailableForItem(apples);
	}
}
