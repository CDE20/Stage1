package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;


public class MenuItemDaoSqlImpl implements MenuItemDao {

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		Connection connection = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<>();
		String query = "select * from menu_item";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int menuItemId = resultSet.getInt("menu_item_id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				boolean active = resultSet.getBoolean("active");
				Date date = resultSet.getDate("date_of_launch");
				String category = resultSet.getString("category");
				boolean freeDelivery = resultSet.getBoolean("free_delivery");

				menuItemList.add(new MenuItem(menuItemId, name, price, active, date, category, freeDelivery));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		Connection connection = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<>();

		String query = "select * from menu_item " + "where active = true and date_of_launch < curdate()";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int menuItemId = resultSet.getInt("menu_item_id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				boolean active = resultSet.getBoolean("active");
				Date date = resultSet.getDate("date_of_launch");
				String category = resultSet.getString("category");
				boolean freeDelivery = resultSet.getBoolean("free_delivery");

				menuItemList.add(new MenuItem(menuItemId, name, price, active, date, category, freeDelivery));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return menuItemList;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		Connection connection = ConnectionHandler.getConnection();
		String query = "update menu_item "
				+ "set "
				+ "name = ?, "
				+ "price = ?, "
				+ "active = ?, "
				+ "date_of_launch = ?, "
				+ "category = ?, "
				+ "free_delivery = ?"
				+ "where menu_item_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, menuItem.getName());
			preparedStatement.setFloat(2, menuItem.getPrice());
			preparedStatement.setBoolean(3, menuItem.isActive());
			java.util.Date dateOfLaunch = menuItem.getDateOfLaunch();
			java.sql.Date sqlDate = new java.sql.Date(dateOfLaunch.getTime());
			preparedStatement.setDate(4,sqlDate);
			preparedStatement.setString(5, menuItem.getCategory());
			preparedStatement.setBoolean(6, menuItem.isFreeDelivery());
			preparedStatement.setFloat(7, menuItem.getId());
			
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		Connection connection = ConnectionHandler.getConnection();
		MenuItem menuItem = null;
		
		String query = "select * from menu_item "
				+ "where menu_item_id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, menuItemId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				boolean active = resultSet.getBoolean("active");
				Date date = resultSet.getDate("date_of_launch");
				String category = resultSet.getString("category");
				boolean freeDelivery = resultSet.getBoolean("free_delivery");
				
				menuItem = new MenuItem(menuItemId, name, price, active, date, category, freeDelivery);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return menuItem;	
	}

}
