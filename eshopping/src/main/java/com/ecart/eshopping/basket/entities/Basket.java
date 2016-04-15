package com.ecart.eshopping.basket.entities;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.exception.ValidationException;

/**
 * Basket Entity class
 * @author suresh
 *
 */

//TODO Need to add JPA annotations
public class Basket {
	
	protected List<BasketItem> items = new ArrayList<BasketItem>();
	
	//	TODO Auto generate ID. Need to add JPA annotations
	protected long basketID;
	
	/**
	 * Returns ID of this basket
	 * @return
	 */
	public long getBasketID() {
		return basketID;
	}
	
	/**
	 * set basket id
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
	
	public boolean addBasketItem(BasketItem item) throws ValidationException {
		if (item == null)
			throw new ValidationException("Adding null basket Item is not allowed");
		return items.add(item);
	}

	/**
	 * Gets the list of items
	 * @return
	 */
	public List<BasketItem> getListItems(){
		return items;
	}
	
	/**
     * Total value of the basket
     * @return
     */	
	public double getBasketTotal() {
		double totalPrice =0d;
		for(BasketItem basketItem : items){
			totalPrice += (basketItem.getItemPrice() * basketItem.getItemQuantity());
		}
		return totalPrice;
	}

}
