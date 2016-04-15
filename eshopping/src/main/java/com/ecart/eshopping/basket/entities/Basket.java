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
	
	protected List<BasketItem> basketItems = new ArrayList<BasketItem>();
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
		return basketItems.add(item);
	}
	
	/**
	 * Add an Collection of Items to the basket 
	 * @param List<BasketItem>
	 * @return 
	 * @throws ValidationException
	 */
	public boolean addBasketItem(List<BasketItem> items) {
		return basketItems.addAll(items);
	}

	/**
	 * Gets the list of items
	 * @return
	 */
	public List<BasketItem> getItemsInBasket(){
		return basketItems;
	}
}
