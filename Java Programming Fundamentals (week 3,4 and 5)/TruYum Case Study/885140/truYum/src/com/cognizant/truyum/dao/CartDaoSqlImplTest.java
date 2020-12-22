package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImplTest {

	private static CartDaoSqlImpl C = new CartDaoSqlImpl();
	public static void main(String[] args) {
		
		//System.out.println("Adding to a Cart:\n");
		//testAddCartItem();
		
		//System.out.println("Get All Menu Item details for An User");
		//testGetAllCartItems();
		
		System.out.println("Before Deletion of Menu Item of a particular User\n");
		testGetAllCartItems();
		
		System.out.println("\nAfter Deletion:\n");
		testRemoveCartItem();
		testGetAllCartItems();
	}
	
	public static void testAddCartItem() {
		
		C.addCartItem(003, 001);
		
	}
	
	public static void testGetAllCartItems() {
		
		try {
			List<MenuItem> cart = C.getAllCartItems(001);
			for (MenuItem menuItem : cart) {
				System.out.println(menuItem.toString());
			}
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}
	
	public static void testRemoveCartItem() {
		
		C.removeCartItem(001,001);
	}
}
