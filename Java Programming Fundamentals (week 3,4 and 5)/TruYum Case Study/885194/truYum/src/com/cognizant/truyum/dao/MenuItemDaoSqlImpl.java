package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @author Pratik
 *
 */
public class MenuItemDaoSqlImpl {

	public List<MenuItem> getMenuItemListAdmin() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from menu_item;");
		ResultSet resultSet = preparedStatement.executeQuery();
		MenuItem menuItem = null;
		while (resultSet.next()) {
			menuItem = new MenuItem(resultSet.getLong(1),
					resultSet.getString(2), 
					resultSet.getFloat(3),
					resultSet.getBoolean(4),
					resultSet.getDate(5),
					resultSet.getString(6), 
					resultSet.getBoolean(7));
			menuItemList.add(menuItem);
		}
		return menuItemList;
	}

	public List<MenuItem> getMenuItemListCustomer() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from menu_item where active=1 and dateOfLaunch<=CURDATE();");
		ResultSet resultSet = preparedStatement.executeQuery();
		MenuItem menuItem = null;
		while (resultSet.next()) {
			menuItem = new MenuItem(resultSet.getLong(1), resultSet.getString(2), resultSet.getFloat(3),
					resultSet.getBoolean(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getBoolean(7));
			menuItemList.add(menuItem);
		}
		return menuItemList;
	}

	public MenuItem getMenuItem(long menuItemId) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from menu_item where menuItemId='" + menuItemId + "';");
		ResultSet resultSet = preparedStatement.executeQuery();
		resultSet.next();
		MenuItem menuItem = new MenuItem(resultSet.getLong(1), resultSet.getString(2), resultSet.getFloat(3),
				resultSet.getBoolean(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getBoolean(7));
		return menuItem;

	}

	public void editMenuItem(MenuItem menuItem) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionHandler.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(
				"update menu_item set name=? , price=? , active=? , dateOfLaunch=? , category=? , freeDelivery=? where menuItemId=?;");
		preparedStatement.setString(1, menuItem.getName());
		preparedStatement.setFloat(2, menuItem.getPrice());
		preparedStatement.setBoolean(3, menuItem.isActive());
		preparedStatement.setDate(4, new Date(menuItem.getDateOfLaunch().getTime()));
		preparedStatement.setString(5, menuItem.getCategory());
		preparedStatement.setBoolean(6, menuItem.isFreeDelivery());
		preparedStatement.setLong(7, menuItem.getId());
		preparedStatement.executeUpdate();
	}

}