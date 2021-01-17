package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;


public class CartDaoSqlImpl implements CartDao {

	@Override
	public void addCartItem(long userId, long menuItemId) {
		Connection connection = ConnectionHandler.getConnection();

		String query = "insert into cart(user_id,item_id) values(?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			preparedStatement.setLong(2, menuItemId);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * get all the cart items
	 * 
	 * @param userId
	 * @throws CartEmptyException
	 */
	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		List<MenuItem> menuItemList = new ArrayList<>();

		Connection connnection = ConnectionHandler.getConnection();

		Cart cart = new Cart(menuItemList, 0);

		String query = "select * from menu_item m join cart c on m.item_id=c.item_id where c.user_id=?";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			float value = 0.00f;
			while (resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				float price = resultSet.getFloat(3);
				value = value + price;
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
			cart.setTotal(value);
			cart.setMenuItemList(menuItemList);

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
	 * remove the item from cart
	 * 
	 * @param userId
	 * @param menuItemId
	 */
	@Override
	public void removeCartItem(long userId, long menuItemId) {

		Connection connnection = ConnectionHandler.getConnection();

		String query = "delete from cart where user_id=? and item_id=?";

		try {
			PreparedStatement preparedStatement = connnection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			preparedStatement.setLong(2, menuItemId);
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

}
