package com.ecart.eshopping.basket.entities;

import java.math.BigDecimal;

/**
 * Oranges entity
 * @author suresh
 *
 */
public class Oranges implements BasketItem {
	
	String name = "Oranges";
	// TODO prices and quantity are hardcoded for test purpose.
	// TODO in production implementation this will be populated from database table or property files
	BigDecimal price = BigDecimal.valueOf(0.40);
	int quantity = 6;

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
