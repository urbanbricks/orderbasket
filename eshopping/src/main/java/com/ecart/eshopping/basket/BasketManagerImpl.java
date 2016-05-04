package com.ecart.eshopping.basket;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.validator.BasketAndItemValidator;

/**
 * This class compute total cost of all items in the given basket
 * @author suresh

 */

public class BasketManagerImpl implements BasketManager {
	BasketAndItemValidator basketAndItemValidator;
	public BasketManagerImpl(BasketAndItemValidator validator){
		this.basketAndItemValidator = validator;
	}
	
	/*
	 * When calculate basket total check for null basket and 
	 * 
	 * @see
	 * com.ecart.eshopping.basket.BasketManager#computeBasketTotal(com.ecart.
	 * eshopping.basket.entities.Basket)
	 */
	public BigDecimal computeBasketTotal(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;

		basketAndItemValidator.validateBasketAndBasketItemList(basket);

		for (BasketItem basketItem : basket.getItemsInBasket()) {
			basketAndItemValidator.validateBasketItem(basketItem);
			basketAndItemValidator.ensurePriceAvailableForItem(basketItem);
			totalBasketPrice = totalBasketPrice.add(calculatePriceForItem(basketItem));
		}
		return totalBasketPrice;
	}
	
	public BigDecimal computeBasketTotal_j8(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;

		basketAndItemValidator.validateBasketAndBasketItemList(basket);
		
		totalBasketPrice = basket.getItemsInBasket().stream().map(BasketManagerImpl::calculatePriceForItem).reduce((a,c)-> a.add(c)).get();
			

		return totalBasketPrice;
	}
	
	
	/**
	 * Calculate total price for an item
	 * 
	 * @param basketItem
	 * @return basketItem
	 */
	private static BigDecimal calculatePriceForItem(final BasketItem basketItem) {
		return basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));

	}

	}
