package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

class CartDaoSqlImplTest {

	public static void testAddCartItem() {
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.addCartItem(1, 2);
		cartDao.addCartItem(1, 3);

		try {
			List<MenuItem> cartItems = cartDao.getAllCartItems(1);
			System.out.println("Cart Items of userId = 1");
			cartItems.stream().forEach(i -> System.out.println(i));

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

	public static void testGetAllCartItems() {
		CartDao cartDao = new CartDaoSqlImpl();
		try {
			List<MenuItem> cartItems = cartDao.getAllCartItems(1);
			System.out.println("Cart Items of userId = 1");
			cartItems.stream().forEach(i -> System.out.println(i));

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

	public static void testRemoveCartItem() {
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.removeCartItem(1, 2);

		try {
			List<MenuItem> cartItems = cartDao.getAllCartItems(1);
			System.out.println("Removed cart item of userid = 1 menuItemId = 2");
			System.out.println("Cart Items of userId = 1");
			cartItems.stream().forEach(i -> System.out.println(i));

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("testAddCartItem()");
		testAddCartItem();

		System.out.println("\ntestGetAllCartItems()");
		testGetAllCartItems();

		System.out.println("\ntestRemoveCartItem()");
		testRemoveCartItem();
	}
}