package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;


public class CartDaoCollectionImplTest {
	
	/**
	 * tests the addCartItem() method
	 * @throws CartEmptyException
	 */
	public static void testAddCartItem() throws CartEmptyException {
		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;
		cartDao.addCartItem(1, 000004);
		cartDao.addCartItem(1, 000001);
		List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
		System.out.println("MenuItem list :" + menuItemList);

	}

	/**
	 * Tests the getAllCartItems() method
	 * @throws CartEmptyException
	 */
	public static void testGetAllCartItems() throws CartEmptyException {
		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;
		List<MenuItem> menuItemList;
		menuItemList = cartDao.getAllCartItems(1);
		for (MenuItem menuItem : menuItemList) {
			System.out.println(menuItem);
		}
	}

	/**
	 * Tests the removeCartItem() method
	 * @throws CartEmptyException
	 */
	public static void testRemoveCartItem() throws CartEmptyException {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1, 000004);

		List<MenuItem> updateMenuItem = cartDao.getAllCartItems(1);
		System.out.println(updateMenuItem);
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			testAddCartItem();
			System.out.println("");
			testGetAllCartItems();
			System.out.println("");
			testRemoveCartItem();
		} catch (CartEmptyException e) {
			System.out.println("Cart is empty");
		}

	}
}
