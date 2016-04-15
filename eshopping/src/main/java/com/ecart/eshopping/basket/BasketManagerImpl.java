package com.ecart.eshopping.basket;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.dao.BasketDAO;
import com.ecart.eshopping.exception.DataBaseException;
import com.ecart.eshopping.exception.ValidationException;
import com.ecart.eshopping.factory.ShoppingFactory;

/**
 * This class manages basket creation and addition of items to the basket
 * @author suresh
 *
 */
public class BasketManagerImpl implements BasketManager {
	
	private BasketDAO basketDAO; 
	private ShoppingFactory shoppingfactory;
	
	
	public BasketManagerImpl(BasketDAO basketDAO, ShoppingFactory shoppingfactory) {
		this.basketDAO = basketDAO;
		this.shoppingfactory = shoppingfactory;
	}

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
	public boolean addItemTobasket(long basketID, String itemName, int quantity, double itemPrice) throws ValidationException, DataBaseException {
		BasketItem basketItem = createBasketItem(basketID, itemName,quantity,itemPrice);
		Basket basket = basketDAO.load(basketID);
		basket.addBasketItem(basketItem);
		return basketDAO.update(basket);
	}
	
	/**
     * Load the basket from database and get the basket total
     * @param basketID
     * @return
     * @throws ValidationException
     * @throws DataBaseException
     */
	public double getBasketTotal(long basketID) throws DataBaseException {
		Basket basket = basketDAO.load(basketID);
		return basket.getBasketTotal();
	}
	
	/**
	 * This method creates new basket with a unique basket id in database table (auto generated id) and return the basket id
	 * @return
	 * @throws DataBaseException
	 */
	public long newBasket() throws DataBaseException {
		Basket basket = shoppingfactory.getNewBasket();
		basket = basketDAO.create(basket);
		return basket.getBasketID();
		
	}
	
	/**
	 * Creates basket item and populate its attributes
	 * @param itemName
	 * @param quantity
	 * @param itemPrice
	 * @return
	 * @throws ValidationException
	 */
	private BasketItem createBasketItem(long basketID, String itemName, int quantity, double itemPrice) throws ValidationException {
		BasketItem basketItem = shoppingfactory.getNewBasketItem();
		basketItem.setItemName(itemName);
		basketItem.setItemPrice(itemPrice);
		basketItem.setItemQuantity(quantity);
		basketItem.setBasketID(basketID);
		return basketItem;
	}
	
}
