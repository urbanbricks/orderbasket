package com.ecart.eshopping.basket;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.dao.BasketDAO;
import com.ecart.eshopping.exception.DataBaseException;
import com.ecart.eshopping.exception.ValidationException;
import com.ecart.eshopping.factory.ShoppingFactory;

public class BasketManagerImpl implements BasketManager {
	
	private BasketDAO basketDAO; 
	private ShoppingFactory shoppingfactory;

	public BasketManagerImpl(BasketDAO basketDAO, ShoppingFactory shoppingfactory) {
		this.basketDAO = basketDAO;
		this.shoppingfactory = shoppingfactory;
	}

	public boolean addItemTobasket(String basketID, String itemName, int quantity, long itemPrice) throws ValidationException, DataBaseException {
		BasketItem basketItem = shoppingfactory.getNewBasketItem();
		basketItem.setItemName(itemName);
		basketItem.setItemPrice(itemPrice);
		basketItem.setItemQuantity(quantity);
		Basket basket = basketDAO.load(basketID);
		return basket.addBasketItem(basketItem);
	}

	public long getBasketTotal(String basketID) throws ValidationException, DataBaseException {
		Basket basket = basketDAO.load(basketID);
		return basket.getBasketTotal();
	}

	public String newBasket() throws DataBaseException {
		Basket basket = shoppingfactory.getNewBasket();
		basket = basketDAO.create(basket);
		return basket.getBasketID();
		
	}
	
}
