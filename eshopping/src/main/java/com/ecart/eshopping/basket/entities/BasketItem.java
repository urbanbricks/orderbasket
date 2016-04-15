package com.ecart.eshopping.basket.entities;

import com.ecart.eshopping.exception.ValidationException;

/**
 * BasketItem entity class
 * @author suresh
 *
 */

//TODO Need to add JPA annotations
public class BasketItem {
	//	TODO Auto generate ID. Need to add JPA annotations
	//	Composite key
	private long basketID;
	private String itemName;
	
	private int itemQuantity;
	private double itemPrice;
	
	/**
	 * Gets the associated basket id
	 * @return
	 */
	public long getBasketID() {
		return basketID;
	}
	/**
	 * Sets the associated basket id
	 * 
	 */
	public void setBasketID(long basketID) {
		this.basketID = basketID;
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
	public double getItemPrice() {
		return itemPrice;
	}
	
	/**
     * Sets the price of the item.
     * @param itemPrice
     * @throws ValidationException
     */
	public void setItemPrice(double itemPrice) throws ValidationException {
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
