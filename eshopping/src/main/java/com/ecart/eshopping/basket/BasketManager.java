package com.ecart.eshopping.basket;

import com.ecart.eshopping.exception.DataBaseException;
import com.ecart.eshopping.exception.ValidationException;

public interface BasketManager {
	
	/**
     * Generates a new Basket.
     */
    public String newBasket() throws DataBaseException;
    
    /**
     * Adds an item to the basket.
     */
    public boolean addItemTobasket(String basketID, String itemName, int quantity, long itemPrice) throws ValidationException, DataBaseException;
    
    /**
     * Get basket total.
     */
    public long getBasketTotal(String basketID) throws ValidationException, DataBaseException;

}
