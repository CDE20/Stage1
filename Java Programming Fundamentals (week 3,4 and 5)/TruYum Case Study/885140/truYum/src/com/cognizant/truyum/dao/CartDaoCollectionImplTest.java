package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	private static CartDaoCollectionImpl C = new CartDaoCollectionImpl();

	public static void main(String[] args) {

		System.out.println("Adding Item in the cart\n");
		// Adding Items in the cart
		testAddCartItem();

		System.out.println("Item Added to cart successfully\n");
		// View items in the cart

		System.out.println("Retrieving List of Cart Items of a particular user\n");

		testGetAllCartItems();

		System.out.println("Removing item from the cart of a particular User\n");
		testRemoveCartItem();

		System.out.println("Cart after removing successfully");
		testGetAllCartItems();

	}

	public static void testAddCartItem() {

		// C = new CartDaoCollectionImpl();
		C.addCartItem(1, 101);
		C.addCartItem(1, 103);
		C.addCartItem(2, 105);
		/*
		 * try { List<MenuItem> list = C.getAllCartItems(1); for (MenuItem menuItem :
		 * list) { System.out.println(list); }
		 * 
		 * } catch (CartEmptyException e) { e.printStackTrace(); }
		 */
	}

	public static void testGetAllCartItems() {
		// C = new CartDaoCollectionImpl();
		try {
			List<MenuItem> list = C.getAllCartItems(1);
			for (MenuItem menuItem : list) {
				System.out.println(menuItem);
			}
		} catch (CartEmptyException e) {
			System.out.println(e);
		}
	}

	public static void testRemoveCartItem() {

		C.removeCartItem(1, 101);
		try {
			C.getAllCartItems(1);

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

}
