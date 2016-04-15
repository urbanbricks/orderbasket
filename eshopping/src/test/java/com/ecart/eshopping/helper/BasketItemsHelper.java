package com.ecart.eshopping.helper;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;

public final class BasketItemsHelper {
	
	public static List<BasketItem> getApples(int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Apples()); 
		}
		return basketItemList;
	}
	
	public static List<BasketItem> getOranges(int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Oranges()); 
		}
		return basketItemList;
	}
	
	public static List<BasketItem> getBananas(int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Bananas()); 
		}
		return basketItemList;
	}
}
