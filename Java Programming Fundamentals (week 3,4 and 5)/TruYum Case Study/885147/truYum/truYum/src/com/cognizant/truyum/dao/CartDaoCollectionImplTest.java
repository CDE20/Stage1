package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	public static void main(String[] args) throws CartEmptyException {
		System.out.println("testAddCartItem()");
		testAddCartItem();
		
		System.out.println("\ntestGetAllCartItems()");
		testGetAllCartItems();

		System.out.println("\ntestRemoveCartItem()");
		testRemoveCartItem();
	}

	public static void testAddCartItem() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 1);
		cartDao.addCartItem(1, 4);
		cartDao.addCartItem(2, 3);
		try {
			System.out.println("Cart Items of userId = 1");
			List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
			menuItemList.stream().forEach(i -> System.out.println(i));

			System.out.println("\nCart Items of userId = 2");
			menuItemList = cartDao.getAllCartItems(2);
			menuItemList.stream().forEach(i -> System.out.println(i));

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}

	}

	public static void testGetAllCartItems() throws CartEmptyException {
		CartDao cartDao = new CartDaoCollectionImpl();
		System.out.println("Cart Items of userId = 1");
		List<MenuItem> menuItemList = cartDao.getAllCartItems(1);

		menuItemList.stream().forEach(i -> System.out.println(i));
		
		System.out.println("\nCart Items of userId = 3");
		menuItemList = cartDao.getAllCartItems(3);

		menuItemList.stream().forEach(i -> System.out.println(i));
	}

	public static void testRemoveCartItem() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1, 4);

		try {
			System.out.println("Cart Items of userId = 1");
			List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
			System.out.println("Removed cart item of userid = 1 menuItemId = 4");
			menuItemList.stream().forEach(i -> System.out.println(i));

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}
}