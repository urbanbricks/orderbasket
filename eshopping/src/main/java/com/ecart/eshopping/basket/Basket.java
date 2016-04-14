package com.ecart.eshopping.basket;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public interface Basket {
	
	/**
	 * Returns ID of this basket
	 * @return
	 */
	public String getBasketID();
	
	/**
	 * Add an item to the basket
	 * @param item
	 * @return
	 * @throws ValidationException
	 */
    public boolean addBasketItem(BasketItem item) throws ValidationException;
    
    /**
     * Basket quantity
     * @return
     */
    public long getBasketQuantity();
    
    /**
     * Total value of the basket
     * @return
     */
    public long getBasketTotal();
    
}
