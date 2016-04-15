package com.ecart.eshopping.basket.entities;

import java.math.BigDecimal;

/**
 * Basket Item entity
 * @author suresh
 *
 */
public interface BasketItem {
	
	/**
	 * Get Item name
	 * @return
	 */
	public String getItemName();
	
	/**
	 * Set Item name
	 * @param name
	 */
	public void setItemName(final String name);
	
	/**
	 * Get item price
	 * @return
	 */
	public BigDecimal getPrice();
	
	/**
	 * Set item price
	 * @param price
	 */
	public void setPrice(final BigDecimal price);
	
	/**
	 * Get Quantity of items in this line item 
	 * @return
	 */
	public int getQuantity();
	
	/**
	 * Set Quantity of items in this line item
	 */
	public void setQuantity(final int quantity);
}
