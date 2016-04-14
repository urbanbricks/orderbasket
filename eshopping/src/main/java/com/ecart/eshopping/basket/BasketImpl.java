package com.ecart.eshopping.basket;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.exception.ValidationException;

public class BasketImpl implements Basket {
	
	protected List<BasketItem> items = new ArrayList<BasketItem>();
	protected String basketID = null;
	


	public String getBasketID() {
		return basketID;
	}

	public boolean addBasketItem(BasketItem item) throws ValidationException {
		if (item == null)
			throw new ValidationException();
		return items.add(item);
	}


	public long getBasketQuantity() {
		return items.size();
	}
	
	public long getBasketTotal() {
		long totalPrice =0l;
		for(BasketItem basketItem : items){
			totalPrice =+ basketItem.getItemPrice() * basketItem.getItemQuantity();
		}
		return totalPrice;
	}
}
