package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl {
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException, ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		Cart cart = new Cart((List<MenuItem>) new ArrayList<MenuItem>(), 0);
		PreparedStatement preparedStatement = connection.prepareStatement(
				"select * from cart inner join menu_item on cart.menuitemid=menu_item.menuItemId where cart.userid=?;");
		preparedStatement.setLong(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		MenuItem item = null;
		while (resultSet.next()) {
//			item = new MenuItem(resultSet.getLong(3), resultSet.getString(4), resultSet.getFloat(5),
//					resultSet.getBoolean(6), resultSet.getDate(7), resultSet.getString(8), resultSet.getBoolean(9));
			item = new MenuItem(resultSet.getLong("menuItemId"), resultSet.getString("name"),
					resultSet.getFloat("price"), resultSet.getBoolean("active"), resultSet.getDate("dateOfLaunch"),
					resultSet.getString("category"), resultSet.getBoolean("freeDelivery"));
			cart.getMenuItemList().add(item);
		}
		preparedStatement = connection.prepareStatement(
				"select sum(price) from cart inner join menu_item on cart.menuItemId=menu_item.menuItemId where cart.userid=?;");
		preparedStatement.setLong(1, userId);
		resultSet = preparedStatement.executeQuery();
		resultSet.next();
		cart.setTotal(resultSet.getDouble(1));
		return cart.getMenuItemList();
	}

	public void addCartItem(long userId, long menuItemId) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into cart (userId, menuItemId) values (?,?);");
		preparedStatement.setLong(1, userId);
		preparedStatement.setLong(2, menuItemId);
		preparedStatement.executeUpdate();
	}

	public void removeCartItem(long userId, long menuItemId) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("delete from cart where userId=? and menuItemId=?;");
		preparedStatement.setLong(1, userId);
		preparedStatement.setLong(2, menuItemId);
		int rowsAffected = preparedStatement.executeUpdate();
		System.out.println(rowsAffected + " rows deleted.");
	}

}