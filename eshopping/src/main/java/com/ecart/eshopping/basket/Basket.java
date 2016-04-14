package com.ecart.eshopping.basket;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public interface Basket {
	
	public String getBasketID();
	
	/****************** Add an item to the basket ****************************/
    /**
     */
    public boolean addBasketItem(BasketItem item) throws ValidationException;
    
    /*********************** Quantity ****************************************/
    /**
    * The number of physical items in the basket.
    */
    public long getBasketQuantity();
    
    /************************** Total ****************************************/
    /**
    * Total value of the basket.
    */
    public long getBasketTotal();
    
}
