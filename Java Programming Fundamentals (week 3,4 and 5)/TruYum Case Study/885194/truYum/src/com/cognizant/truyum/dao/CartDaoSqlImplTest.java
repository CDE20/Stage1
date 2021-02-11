package com.cognizant.truyum.dao;

import java.sql.SQLException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImplTest {
	public static void testAddCartItem() throws ClassNotFoundException, SQLException, CartEmptyException {
		CartDaoSqlImpl cartDaoSqlImpl = new CartDaoSqlImpl();
		cartDaoSqlImpl.addCartItem(1, 5);
		List<MenuItem> carts = cartDaoSqlImpl.getAllCartItems(1);
		for (MenuItem menuItem : carts) {
			System.out.println(menuItem.toString());
		}
	}
	public static void testGetAllCartItems() throws ClassNotFoundException, CartEmptyException, SQLException {
		CartDaoSqlImpl cartDaoSqlImpl = new CartDaoSqlImpl();
		List<MenuItem> carts = cartDaoSqlImpl.getAllCartItems(1);
		for (MenuItem menuItem : carts) {
			System.out.println(menuItem.toString());
		}		
	}
	public static void testRemoveCartItem() throws ClassNotFoundException, SQLException, CartEmptyException {
		CartDaoSqlImpl cartDaoSqlImpl = new CartDaoSqlImpl();
		cartDaoSqlImpl.removeCartItem(1,5);
		List<MenuItem> carts = cartDaoSqlImpl.getAllCartItems(1);
		for (MenuItem menuItem : carts) {
			System.out.println(menuItem.toString());
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, CartEmptyException {
		testAddCartItem();
		testGetAllCartItems();
		testRemoveCartItem();
//		
	}
}