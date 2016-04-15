package com.ecart.eshopping.entity;

import org.junit.Test;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public class BasketItemTest {

	@Test(expected=ValidationException.class)
	public void testItemNameValidationCheck() throws ValidationException {
		BasketItem basketItem = new BasketItem();
		basketItem.setItemName(null);
	}
	
	@Test(expected=ValidationException.class)
	public void testItemPriceValidationException() throws ValidationException {
		BasketItem basketItem = new BasketItem();
		basketItem.setItemPrice(-1);
	}

}
