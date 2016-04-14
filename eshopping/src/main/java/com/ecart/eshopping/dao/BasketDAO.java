package com.ecart.eshopping.dao;

import com.ecart.eshopping.basket.Basket;
import com.ecart.eshopping.exception.DataBaseException;

public interface BasketDAO {
	
	public Basket create(Basket basket) throws DataBaseException;
	
	public boolean updateDelete(Basket basket) throws DataBaseException;
	
	public Basket load(String basketID) throws DataBaseException;
	
}
