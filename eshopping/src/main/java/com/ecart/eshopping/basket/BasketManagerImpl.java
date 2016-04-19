package com.ecart.eshopping.basket;

import java.math.BigDecimal;

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
		final BigDecimal totalBasketPrice = BigDecimal.ZERO;

		basketAndItemValidator.validateBasketAndBasketItemList(basket);

		basket.getItemsInBasket().forEach(b -> {
			basketAndItemValidator.validateBasketItem(b);
			basketAndItemValidator.ensurePriceAvailableForItem(b);
			totalBasketPrice.add(calculatePriceForItem(b));
			
		});
		return totalBasketPrice;
	}
	
	
	/**
	 * Calculate total price for an item
	 * 
	 * @param basketItem
	 * @return basketItem
	 */
	private BigDecimal calculatePriceForItem(final BasketItem basketItem) {
		return basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));

	}

	}
