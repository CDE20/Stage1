package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;


public class CartDaoSqlImplTest {

	/**
	 * tests the addCartItem() method
	 */
	public static void testAddCartItem() {
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.addCartItem(1, 1);
		cartDao.addCartItem(1, 4);
		
	}

	/**
	 * tests the getAllCartItems() method
	 */
	public static void testGetAllCartItems() {
		CartDao cartDao = new CartDaoSqlImpl();
		try {
			List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
			for (MenuItem menuItem : menuItemList) {
				System.out.println(menuItem);
			}

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

	/**
	 * tests the removeCartItem() method
	 */
	public static void testRemoveCartItem() {
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.removeCartItem(1, 4);
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		testGetAllCartItems();
		testAddCartItem();
		System.out.println("");
		testGetAllCartItems();
		System.out.println("");
		testRemoveCartItem();
		System.out.println("");
		testGetAllCartItems();
	}
}
