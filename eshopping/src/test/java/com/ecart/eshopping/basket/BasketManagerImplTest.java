package com.ecart.eshopping.basket;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.ecart.eshopping.basket.entities.Apples;
import com.ecart.eshopping.basket.entities.Bananas;
import com.ecart.eshopping.basket.entities.Basket;
import com.ecart.eshopping.basket.entities.BasketItem;
import com.ecart.eshopping.basket.entities.Oranges;
import com.ecart.eshopping.exception.ValidationException;

public class BasketManagerImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testAddItemToBasket() {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock,ShoppingFactoryMock);
		Basket basket = new Basket();
		
		try {
			when(ShoppingFactoryMock.getNewBasketItem()).thenReturn(createBasketItem(1, "Bananas", 1.5,1));
			when(basketDAOMock.load(1)).thenReturn(basket);
			basketmanager.addItemTobasket(1, "Bananas", 1, 1.5);
			verify(basketDAOMock,atLeastOnce()).load(1);
			verify(ShoppingFactoryMock,atLeastOnce()).getNewBasketItem();
			verify(basketDAOMock,atLeastOnce()).update(basket);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		} catch (DataBaseException e) {
			fail(" Test failed due to database exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test(expected=ValidationException.class)
	public void testAddItemToBasketValidationException() throws ValidationException, DataBaseException {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketItem basketItemMock = mock(BasketItem.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);
		Basket basket = new Basket();

		when(ShoppingFactoryMock.getNewBasketItem()).thenReturn(basketItemMock);
		doThrow(new ValidationException()).when(basketItemMock).setItemName(any(String.class));
		when(basketDAOMock.load(1)).thenReturn(basket);
		basketmanager.addItemTobasket(1, "Bananas", 1, 1.5);
		
	}
	
	@Test(expected=DataBaseException.class)
	public void testAddItemToBasketDataBaseException() throws ValidationException, DataBaseException {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketItem basketItemMock = mock(BasketItem.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);

		when(ShoppingFactoryMock.getNewBasketItem()).thenReturn(basketItemMock);
		doThrow(new DataBaseException()).when(basketDAOMock).load(1);
		basketmanager.addItemTobasket(1, "Bananas", 1, 1.5);
		
	}
	
	@Test
	public void testBasketTotal() {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);
		Basket basket = new Basket();
		try {
			basket.addBasketItem(createBasketItem(1, "Bananas", 1.5, 1));
			basket.addBasketItem(createBasketItem(1, "Apples", 2.5, 2));
			when(basketDAOMock.load(1)).thenReturn(basket);
			Assert.assertEquals(6.5, basketmanager.getBasketTotal(1),0);
			verify(basketDAOMock, atLeastOnce()).load(1);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		} catch (DataBaseException e) {
			fail(" Test failed due to database exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test(expected=DataBaseException.class)
	public void testBasketTotalDataBaseException() throws DataBaseException {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);

		doThrow(new DataBaseException()).when(basketDAOMock).load(1);
		basketmanager.getBasketTotal(1);
		
	}
	
	@Test
	public void testNewBasket() {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);
		Basket basket = new Basket();
		Basket basketWithID = new Basket();
		basketWithID.setBasketID(1);
		try {
			when(ShoppingFactoryMock.getNewBasket()).thenReturn(basket);
			when(basketDAOMock.create(basket)).thenReturn(basketWithID);
			basketmanager.newBasket();
			Assert.assertEquals(1, basketmanager.newBasket());
			verify(basketDAOMock, atLeastOnce()).create(basket);
			verify(ShoppingFactoryMock,atLeastOnce()).getNewBasket();
		} catch (DataBaseException e) {
			fail(" Test failed due to database exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test(expected=DataBaseException.class)
	public void testNewBasketDataBaseException() throws DataBaseException {
		
		BasketDAO basketDAOMock = mock(BasketDAO.class);
		ShoppingFactory ShoppingFactoryMock = mock(ShoppingFactory.class);
		BasketManagerImpl basketmanager = new BasketManagerImpl(basketDAOMock, ShoppingFactoryMock);
		Basket basket = new Basket();
		
		when(ShoppingFactoryMock.getNewBasket()).thenReturn(basket);
		doThrow(new DataBaseException()).when(basketDAOMock).load(1);
		basketmanager.getBasketTotal(1);
		
	}
	*/
	
/*	*//**
	 * build basket item for the given attribute
	 * @param basketId
	 * @param name
	 * @param price
	 * @param quantity
	 * @return
	 *//*
	private BasketItem createBasketItem(long basketId, String name, double price, int quantity){
		BasketItem basketItem = new BasketItem();
		basketItem.setBasketID(basketId);
		try {
			basketItem.setItemName(name);
			basketItem.setItemPrice(price);
			basketItem.setItemQuantity(quantity);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return basketItem;
	}*/
	
	@Test
	public void testCalculateBasketTotalWithDefaultPrice() {
		BasketItem bananas = new Bananas();
		BasketItem oranges = new Apples();
		BasketItem apples = new Oranges();
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket); 
			Assert.assertEquals(8.58, basketTotal.doubleValue(), 0);basketManagerImpl.computeBasketTotal(basket);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCalculateBasketTotalWithAmendedPrice() {
		BasketItem bananas = new Bananas();
		bananas.setPrice(BigDecimal.valueOf(1));
		BasketItem oranges = new Apples();
		oranges.setPrice(BigDecimal.valueOf(1));
		BasketItem apples = new Oranges();
		apples.setPrice(BigDecimal.valueOf(1));
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		try {
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basket.addBasketItem(apples);
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket); 
			Assert.assertEquals(12, basketTotal.doubleValue(), 0);basketManagerImpl.computeBasketTotal(basket);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
		
	}
	
	@Test(expected=ValidationException.class)
	public void testNullBasket() throws ValidationException {
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
		basketManagerImpl.computeBasketTotal(null); 

	}
	
	@Test(expected=ValidationException.class)
	public void testNullItemInBasket() throws ValidationException {
		BasketItem bananas = new Bananas();
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
			basket.addBasketItem(bananas);
			basket.addBasketItem(null);
			basketManagerImpl.computeBasketTotal(basket); 
	}
	
	@Test(expected=ValidationException.class)
	public void testNullPriceItem() throws ValidationException {
		BasketItem bananas = new Bananas();
		BasketItem oranges = new Apples();
		oranges.setPrice(null);
		Basket basket = new Basket();
		BasketManagerImpl basketManagerImpl = new BasketManagerImpl();
			basket.addBasketItem(bananas);
			basket.addBasketItem(oranges);
			basketManagerImpl.computeBasketTotal(basket); 
	}
}
