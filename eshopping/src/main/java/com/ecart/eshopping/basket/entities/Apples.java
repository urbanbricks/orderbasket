package com.ecart.eshopping.basket.entities;

import java.math.BigDecimal;

/**
 * Apples entity
 * @author suresh
 *
 */
public class Apples implements BasketItem {
	
	String name = "Apples";
	
	// TODO prices and quantity are hardcoded for test purpose.
	// TODO in production implementation this will be populated from database table or property files
	
	BigDecimal price = BigDecimal.valueOf(0.55);
	int quantity = 4;

	public String getItemName() {
		
		return name;
	}

	public void setItemName(String name) {
		this.name = name;
		
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;		
	}
}
