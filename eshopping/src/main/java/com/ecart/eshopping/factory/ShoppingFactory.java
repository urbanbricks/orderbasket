package com.ecart.eshopping.factory;

import com.ecart.eshopping.basket.Basket;
import com.ecart.eshopping.basket.BasketImpl;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.BasketItemImpl;

public class ShoppingFactory {
	
	public ShoppingFactory(){
		
	}
	
	public Basket getNewBasket(){
		
		return new BasketImpl();
		
	}
	
	public BasketItem getNewBasketItem(){
		return new BasketItemImpl();
	}
	

}
