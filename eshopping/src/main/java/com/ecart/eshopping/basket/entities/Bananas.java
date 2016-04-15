package com.ecart.eshopping.basket.entities;

import java.math.BigDecimal;

/**
 * Banana entity
 * @author suresh
 *
 */
public class Bananas implements BasketItem {
	
	String name = "Bananas";
	BigDecimal price = BigDecimal.valueOf(1.99);
	int quantity = 2;

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
