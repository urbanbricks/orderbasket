package com.ecart.eshopping.basket;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public class BasketImpl implements Basket {
	
	protected List<BasketItem> items = new ArrayList<BasketItem>();
	protected String basketID = null;
	
	/**
	 * Returns ID of this basket
	 * @return
	 */
	public String getBasketID() {
		return basketID;
	}
	
	/**
	 * Add an item to the basket
	 * @param item
	 * @return
	 * @throws ValidationException
	 */
	
	public boolean addBasketItem(BasketItem item) throws ValidationException {
		if (item == null)
			throw new ValidationException();
		return items.add(item);
	}

	/**
     * Basket quantity
     * @return
     */
	
	public long getBasketQuantity() {
		return items.size();
	}
	
	/**
     * Total value of the basket
     * @return
     */	
	public long getBasketTotal() {
		long totalPrice =0l;
		for(BasketItem basketItem : items){
			totalPrice =+ basketItem.getItemPrice() * basketItem.getItemQuantity();
		}
		return totalPrice;
	}
}
