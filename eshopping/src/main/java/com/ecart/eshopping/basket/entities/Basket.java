package com.ecart.eshopping.basket.entities;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.exception.ValidationException;

/**
 * Basket Entity class
 * @author suresh
 *
 */

public class Basket {
	
	protected List<BasketItem> items = new ArrayList<BasketItem>();
	protected long basketID;
	
	/**
	 * Returns ID of this basket
	 * @return
	 */
	public long getBasketID() {
		return basketID;
	}
	
	/**
	 * Set basket id
	 */
	public void setBasketID(long basketID) {
		this.basketID = basketID;
		
	}
	
	/**
	 * Add an item to the basket
	 * @param item
	 * @return
	 * @throws ValidationException
	 */
	
	public boolean addBasketItem(BasketItem item) {
		return items.add(item);
	}

	/**
	 * Gets the list of items
	 * @return
	 */
	public List<BasketItem> getListItems(){
		return items;
	}
}
