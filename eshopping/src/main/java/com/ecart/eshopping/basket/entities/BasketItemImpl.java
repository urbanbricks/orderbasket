package com.ecart.eshopping.basket.entities;

import com.ecart.eshopping.exception.ValidationException;

public class BasketItemImpl implements BasketItem {
	
	private String itemName;
	private int itemQuantity;
	private long itemPrice;
	
	public BasketItemImpl(){

	}
	
	/**
	 * Gets the item name that is associated with the item.
	 * @return
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
     * Sets the item name that is associated with the item.
     * @param itemName
     * @throws ValidationException
     */
	public void setItemName(String name) throws ValidationException {
		
		if (name == null)
			throw new ValidationException();
		
		this.itemName = name;
		
	}
	
	/**
     * Gets the price of the item.
     * @return
     */
	public long getItemPrice() {
		return itemPrice;
	}
	
	/**
     * Sets the price of the item.
     * @param itemPrice
     * @throws ValidationException
     */
	public void setItemPrice(long itemPrice) throws ValidationException {
		if (itemPrice < 0)
			throw new ValidationException();
		
		this.itemPrice = itemPrice;
		
	}

	/**
     * Gets the quantity of the this item in the basket
     * @return
     */
	public long getItemQuantity() {

		return itemQuantity;
	}
	
	/**
     * Sets the quantity of the this item in the basket
     * @param itemQuantity
     * @throws ValidationException
     */
	public void setItemQuantity(int itemQuantity) throws ValidationException {
		this.itemQuantity = itemQuantity;
	}

}
