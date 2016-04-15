package com.ecart.eshopping.basket;

import com.ecart.eshopping.exception.DataBaseException;
import com.ecart.eshopping.exception.ValidationException;

public interface BasketManager {
	
	/**
	 * This method creates new basket with a unique basket id in database and return the basket id
	 * @return
	 * @throws DataBaseException
	 */
    public long newBasket() throws DataBaseException;
    
    /**
     * Creates new basket item for the given item details. 
	 * Load the basket from database for the given basket id and add the new item to the basket.
	 * Finally persist the basket in the database. 
     * @param basketID
     * @param itemName
     * @param quantity
     * @param itemPrice
     * @return
     * @throws ValidationException
     * @throws DataBaseException
     */
    public boolean addItemTobasket(long basketID, String itemName, int quantity, double itemPrice) throws ValidationException, DataBaseException;
    
    /**
     * Load the basket from database and get the basket total
     * @param basketID
     * @return
     * @throws ValidationException
     * @throws DataBaseException
     */
    public double getBasketTotal(long basketID) throws ValidationException, DataBaseException;

}
