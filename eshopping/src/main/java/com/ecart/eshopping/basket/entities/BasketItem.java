package com.ecart.eshopping.basket.entities;

import com.ecart.eshopping.exception.ValidationException;

public interface BasketItem {
	
	
    
	/**
	 * Gets the item name that is associated with the item.
	 * @return
	 */
    public String getItemName();
    
    /**
     * Sets the item name that is associated with the item.
     * @param itemName
     * @throws ValidationException
     */
    public void setItemName(String itemName) throws ValidationException;
    
    /**
     * Gets the price of the item.
     * @return
     */
    public long getItemPrice();
    
    /**
     * Sets the price of the item.
     * @param itemPrice
     * @throws ValidationException
     */
    public void setItemPrice(long itemPrice) throws ValidationException;
    
    /**
     * Gets the quantity of the this item in the basket
     * @return
     */
    public long getItemQuantity();
    
    /**
     * Sets the quantity of the this item in the basket
     * @param itemQuantity
     * @throws ValidationException
     */
    public void setItemQuantity(int itemQuantity) throws ValidationException;

}
