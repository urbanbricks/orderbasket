package com.ecart.eshopping.basket;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.validator.BasketAndItemValidator;
import com.ecart.eshopping.exception.ValidationException;
import com.ecart.eshopping.helper.BasketItemsHelper;

public class BasketManagerImplTest {

	Basket basket;
	BasketManagerImpl basketManagerImpl;
	BasketAndItemValidator basketAndItemValidator;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		basketAndItemValidator = mock(BasketAndItemValidator.class);
		basketManagerImpl = new BasketManagerImpl(basketAndItemValidator);
	}
	
	/**
	 * Add five items to the basket and test the price calculated are expected.
	 * The prices are default in the fruits.
	 */
	@Test
	public void testCalculateBasketTotal() {
		try {
			basket.addBasketItems(BasketItemsHelper.getBananas(1));
			basket.addBasketItems(BasketItemsHelper.getApples(1));
			basket.addBasketItems(BasketItemsHelper.getOranges(1));
			basket.addBasketItems(BasketItemsHelper.getLemons(1));
			basket.addBasketItems(BasketItemsHelper.getPeaches(1));
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal_j8(basket);
			verify(basketAndItemValidator, times(1)).validateBasketAndBasketItemList(any(Basket.class));
			verify(basketAndItemValidator, times(5)).validateBasketItem(any(BasketItem.class));
			verify(basketAndItemValidator, times(5)).ensurePriceAvailableForItem(any(BasketItem.class));
			Assert.assertEquals(14.76, basketTotal.doubleValue(), 0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
	}
	
	/**
	 * Test WhenValidateBasketItem Throw Exception
	 */
	@Test(expected = ValidationException.class)
	public void testWhenValidateBasketItemThrowException() {
		doThrow(new ValidationException()).when(basketAndItemValidator).validateBasketAndBasketItemList(basket);
		basketManagerImpl.computeBasketTotal(basket);//basket is empty no item added
	}
	
	/**
	 * Test When EnsurePriceAvailableForitem Throw Exception
	 */
	@Test(expected = ValidationException.class)
	public void testWhenEnsurePriceAvailableForitemThrowException() {
		basket.addBasketItems(BasketItemsHelper.getBananas(1));
		doThrow(new ValidationException()).when(basketAndItemValidator).ensurePriceAvailableForItem(basket.getItemsInBasket().get(0));
		basketManagerImpl.computeBasketTotal(basket);

	}
	
}
