package com.ecart.eshopping.basket.entities;

import com.ecart.eshopping.exception.ValidationException;

public class BasketItemImpl implements BasketItem {
	
	private String itemName;
	private int itemQuantity;
	private long itemPrice;
	
	public BasketItemImpl(){

	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String name) throws ValidationException {
		
		if (name == null)
			throw new ValidationException();
		
		this.itemName = name;
		
	}

	public long getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(long itemPrice) throws ValidationException {
		if (itemPrice < 0)
			throw new ValidationException();
		
		this.itemPrice = itemPrice;
		
	}

	public long getItemQuantity() {

		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) throws ValidationException {
		this.itemQuantity = itemQuantity;
	}

}
