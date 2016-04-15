package com.ecart.eshopping.factory;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;

public class ShoppingFactory {
	
	public ShoppingFactory(){
		
	}
	
	public Basket getNewBasket(){
		
		return new Basket();
		
	}
	
	public BasketItem getNewBasketItem(){
		return new BasketItem();
	}
	

}
