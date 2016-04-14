package com.ecart.eshopping.dao;

import com.ecart.eshopping.basket.Basket;
import com.ecart.eshopping.exception.DataBaseException;

public interface BasketDAO {
	
	/**	Create a new basket in the database with a unique basket id
	 *  
	 * @param basket
	 * @return
	 * @throws DataBaseException
	 */
	public Basket create(Basket basket) throws DataBaseException;
	
	/**	Update basket and line items tables in the database. 
	 * 
	 * @param basket
	 * @return
	 * @throws DataBaseException
	 */
	public boolean update(Basket basket) throws DataBaseException;
	
	/** Load the basket and its line items from the database table
	 * 
	 * @param basketID
	 * @return
	 * @throws DataBaseException
	 */
	 
	public Basket load(String basketID) throws DataBaseException;
	
}
