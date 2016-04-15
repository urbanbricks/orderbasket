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
 *
 */
public class BasketManagerImpl implements BasketManager {
	
	/**
     * Compute total cost of all items in the given basket
     * @return
     */	
	
	public BigDecimal computeBasketTotal(Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;
		
		if(basket == null)
			throw new ValidationException("Basket cannot be null");
		
		for(BasketItem basketItem : basket.getListItems()){
			if (basketItem == null)
				throw new ValidationException("Item cannot be null");
			if (basketItem.getPrice() == null)
				throw new ValidationException("price cannot be null . Item name " + basketItem.getItemName());
			BigDecimal itemTotalPrice = basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));
			totalBasketPrice = totalBasketPrice.add(itemTotalPrice);
		}
		return totalBasketPrice;
	}
	
}
