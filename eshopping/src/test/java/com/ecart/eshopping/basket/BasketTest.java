package com.ecart.eshopping.basket;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public class BasketTest {
	
	@Test
	public void testBasketaddedItems() {
		BasketItem bananas = createBasketItem(1, "Bananas", 1.5, 1);
		BasketItem oranges = createBasketItem(1, "Oranges", 0.25, 5);
		BasketItem apples = createBasketItem(1, "Apples", 0.5, 4);
		Basket basket = new Basket();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			Assert.assertTrue(basket.getListItems().contains(bananas));
			Assert.assertTrue(basket.getListItems().contains(oranges));
			Assert.assertTrue(basket.getListItems().contains(apples));
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
	}
	
	@Test(expected=ValidationException.class)
	public void testBasketaddedItemsValidationException() throws ValidationException {
		BasketItem bananas = null;
		Basket basket = new Basket();
		basket.addBasketItem(bananas);
	}
	
	@Test
	public void testBasketTotal() {
		BasketItem bananas = createBasketItem(2, "Bananas", 1.5, 1);
		BasketItem oranges = createBasketItem(2, "Oranges", 0.25, 5);
		BasketItem apples = createBasketItem(2, "Apples", 0.5, 4);
		Basket basket = new Basket();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			Assert.assertEquals(4.75,basket.getBasketTotal(),0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
	}
	
	/**
	 * build basket item for the given attribute
	 * @param basketId
	 * @param name
	 * @param price
	 * @param quantity
	 * @return
	 */
	private BasketItem createBasketItem(long basketId, String name, double price, int quantity){
		BasketItem basketItem = new BasketItem();
		basketItem.setBasketID(basketId);
		try {
			basketItem.setItemName(name);
			basketItem.setItemPrice(price);
			basketItem.setItemQuantity(quantity);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return basketItem;
	}

}
