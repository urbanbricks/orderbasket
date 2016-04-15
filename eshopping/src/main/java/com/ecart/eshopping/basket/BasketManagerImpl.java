package com.ecart.eshopping.basket;

import java.math.BigDecimal;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

/**
 * This class compute total cost of all items in the given basket
 * @author suresh
 * 
 * @see some other stuff....
 */
public class BasketManagerImpl implements BasketManager {
	
	/*
	 * When calculate basket total check for null basket and 
	 * 
	 * @see
	 * com.ecart.eshopping.basket.BasketManager#computeBasketTotal(com.ecart.
	 * eshopping.basket.entities.Basket)
	 */
	public BigDecimal computeBasketTotal(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;

		validateBasketAndBasketItemList(basket);

		for (BasketItem basketItem : basket.getItemsInBasket()) {
			if (basketItem == null)
				throw new ValidationException("Item cannot be null");
			ensurePriceAvailableForItem(basketItem);
			totalBasketPrice = totalBasketPrice.add(calculatePriceForItem(basketItem));
		}
		return totalBasketPrice;
	}

	/**
	 * Validate Basket And BasketItemList
	 * 
	 * @param basket
	 */
	private void validateBasketAndBasketItemList(final Basket basket) {
		if (basket == null || basket.getItemsInBasket() == null || basket.getItemsInBasket().isEmpty())
			throw new ValidationException("Basket cannot be Null And Should have Items in it");
	}

	/**
	 * Calculate total price for an item
	 * 
	 * @param basketItem
	 * @return basketItem
	 */
	private BigDecimal calculatePriceForItem(final BasketItem basketItem) {
		return basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));

	}

	/**
	 * Validate basket items
	 * 
	 * @param basketItem
	 */
	private void ensurePriceAvailableForItem(final BasketItem basketItem) {
		if (basketItem.getPrice() == null || basketItem.getPrice() == BigDecimal.ZERO)
			throw new ValidationException(
					"Price should be available and Not equal to Zero " + basketItem.getItemName());
	}
	
}
