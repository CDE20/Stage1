package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * 
 * @author 
 *
 */
public class MenuItemDaoSqlImpl implements MenuItemDao {

	/**
	 * get menu items list for admin
	 */
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		List<MenuItem> menuItemList = new ArrayList<>();

		Connection connnection = ConnectionHandler.getConnection();

		String query = "select * from menu_item";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				float price = resultSet.getFloat(3);
				String act = resultSet.getString(4);
				Date dateOfLaunch = resultSet.getDate(5);
				String category = resultSet.getString(6);
				String free = resultSet.getString(7);

				boolean active = false;
				if (act.equalsIgnoreCase("yes")) {
					active = true;
				}
				boolean freeDelivery = false;
				if (free.equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}

				MenuItem menuItem = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
				menuItemList.add(menuItem);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return menuItemList;
	}

	/**
	 * get menu item list for customer
	 */
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> menuItemList = new ArrayList<>();

		Connection connnection = ConnectionHandler.getConnection();

		String query = "select * from menu_item where isactive = true and dateoflaunch < curdate()";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				float price = resultSet.getFloat(3);
				String act = resultSet.getString(4);
				Date dateOfLaunch = resultSet.getDate(5);
				String category = resultSet.getString(6);
				String free = resultSet.getString(7);

				boolean active = false;
				if (act.equalsIgnoreCase("yes")) {
					active = true;
				}
				boolean freeDelivery = false;
				if (free.equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}

				MenuItem menuItem = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
				menuItemList.add(menuItem);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return menuItemList;
	}

	/**
	 * modify the menu items
	 * 
	 * @param menuItem
	 */
	@Override
	public void modifyMenuItem(MenuItem menuItem) {

		Connection connnection = ConnectionHandler.getConnection();

		long id = menuItem.getId();
		String name = menuItem.getName();
		float price = menuItem.getPrice();
		boolean active = menuItem.isActive();
		java.sql.Date date = new java.sql.Date(menuItem.getDateOfLaunch().getTime());
		String category = menuItem.getCategory();
		boolean free = menuItem.isFreeDelivery();
		String act;
		if (active == true) {
			act = "Yes";
		} else {
			act = "No";
		}
		String freeDelivery;
		if (free == true) {
			freeDelivery = "Yes";
		} else {
			freeDelivery = "No";
		}

		String query = "update menu_item set item_name=?,item_price=?,active_status=?,date_of_launch=?,category=?,free_delivery=? where item_id=?";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setFloat(2, price);
			preparedStatement.setString(3, act);
			preparedStatement.setDate(4, date);
			preparedStatement.setString(5, category);
			preparedStatement.setString(6, freeDelivery);
			preparedStatement.setLong(7, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * gets menu item based on menuItemId
	 * 
	 * @param menuItemId
	 */
	@Override
	public MenuItem getMenuItem(long menuItemId) {

		MenuItem menuItem = null;
		Connection connnection = ConnectionHandler.getConnection();

		String query = "select * from menu_item where item_id = ?";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			preparedStatement.setLong(1, menuItemId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				float price = resultSet.getFloat(3);
				String act = resultSet.getString(4);
				Date dateOfLaunch = resultSet.getDate(5);
				String category = resultSet.getString(6);
				String free = resultSet.getString(7);

				boolean active = false;
				if (act.equalsIgnoreCase("yes")) {
					active = true;
				}
				boolean freeDelivery = false;
				if (free.equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}

				menuItem = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return menuItem;
	}

}