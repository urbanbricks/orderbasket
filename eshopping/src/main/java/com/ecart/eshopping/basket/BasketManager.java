package com.ecart.eshopping.basket;

import java.math.BigDecimal;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.exception.ValidationException;

/**
 * @author selvaps
 *
 */
public interface BasketManager {
	
    /**
     * Compute total price for the entire basket items.
     * @param basket
     * @return
     * @throws ValidationException
     */
    public BigDecimal computeBasketTotal(Basket basket) throws ValidationException;

}
