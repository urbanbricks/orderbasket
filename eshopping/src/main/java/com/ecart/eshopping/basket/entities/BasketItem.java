package com.ecart.eshopping.basket.entities;

import com.ecart.eshopping.exception.ValidationException;

public interface BasketItem {
	
	
    /*********************** Item description ********************************/
    /**
    * This is a description that is associated with the item and would normally
    * show on the invoice.
    */
    public String getItemName();
    public void setItemName(String itemName) throws ValidationException;
    
    /************************ Item Price **************************************/
    /**
    * This is the price of the item before applying any discounts.
    */
    public long getItemPrice();
    public void setItemPrice(long itemPrice) throws ValidationException;
    
    /************************ Item Quantity **************************************/
    /**
    * This is the quantity of the this item in the basket.
    */
    public long getItemQuantity();
    public void setItemQuantity(int itemQuantity) throws ValidationException;

}
