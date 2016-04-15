package com.ecart.eshopping.helper;

import java.util.ArrayList;
import java.util.List;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Lemons;
import com.ecart.eshopping.basket.entities.Oranges;
import com.ecart.eshopping.basket.entities.Peaches;

/**
 * Helper to create list of basket items
 * @author selvaps
 *
 */
public final class BasketItemsHelper {
	
	/**
	 * Creates list of apples 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getApples(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Apples()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of oranges 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getOranges(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Oranges()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of bananas 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getBananas(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Bananas()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of lemons 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getLemons(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Lemons()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of Peaches 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getPeaches(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Peaches()); 
		}
		return basketItemList;
	}
}
