package com.ecart.eshopping.dao;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.exception.DataBaseException;

public class BasketDAOImpl implements BasketDAO {
	
	/**	Create a new basket in the database with a unique basket id
	 *  
	 * @param basket
	 * @return
	 * @throws DataBaseException
	 */
	public Basket create() throws DataBaseException {
		// TODO Need to implement the code
		return null;
	}
	
	/**	Update basket and line items tables in the database. 
	 * 
	 * @param basket
	 * @return
	 * @throws DataBaseException
	 */
	public boolean update(Basket basket) throws DataBaseException {
		// TODO Need to implement the code
		return false;
	}
	
	/** Load the basket and its line items from the database table
	 * 
	 * @param basketID
	 * @return
	 * @throws DataBaseException
	 */
	public Basket load(long basketID) throws DataBaseException {
		// TODO Need to implement the code
		return null;
	}

}
