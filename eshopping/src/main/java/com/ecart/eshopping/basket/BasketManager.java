package com.ecart.eshopping.basket;

import java.math.BigDecimal;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.exception.ValidationException;

public interface BasketManager {
	
    /**
     * 
     * @author Selvaps 
     * compute basket total
     * @param basketID
     * @return
     * @throws ValidationException
     */
    public BigDecimal computeBasketTotal(Basket basket) throws ValidationException;

}
