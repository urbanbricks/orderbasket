package com.ecart.eshopping.basket;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

/**
 * This class compute total cost of all items in the given basket
 * @author suresh
 * 
 * @see some other stuff....
 * 
 * 
 * 
 *
 */
public class BasketManagerImpl implements BasketManager {
	
	/**
     * Compute total cost of all items in the given basket
     * @return
     */	
	
	public BigDecimal computeBasketTotal(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;
		
		if(basket == null || basket.getItemsInBasket().isEmpty())
			throw new ValidationException("Basket cannot be Null And Should have Items in it");
		
		for(BasketItem basketItem : basket.getItemsInBasket()){
			if (basketItem == null)
				throw new ValidationException("Item cannot be null");
			ensurePriceAvailableForItem(basketItem);
			totalBasketPrice = totalBasketPrice.add(calculatePriceForItem(basketItem));
		}
		return totalBasketPrice;
	}

	private BigDecimal calculatePriceForItem(final BasketItem basketItem) {
		return  basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));
		
	}

	private void ensurePriceAvailableForItem(BasketItem basketItem) {
		if (basketItem.getPrice() == null)
			throw new ValidationException("price cannot be Empty for " + basketItem.getItemName());
	}
	
}
