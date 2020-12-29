package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl implements CartDao {

	@Override
	public void addCartItem(long userId, long menuItemId) {
		Connection connection = ConnectionHandler.getConnection();
		String query = "insert into cart (user_id, menu_item_id) "
				+ "values "
				+ "(?, ?) ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			preparedStatement.setLong(2, menuItemId);
			
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected + " rows affected.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		Connection connection = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<>();
		Cart cart = new Cart(menuItemList, 0);
		
		String query = "select * from cart c "
				+ "inner join menu_item m "
				+ "on c.cart_id = m.menu_item_id "
				+ "where c.user_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
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
			
			query = "select sum(m.price) as total "
					+ "from cart c "
					+ "inner join menu_item m "
					+ "where c.user_id = ?";
			
			PreparedStatement preparedStatement2 = connection.prepareStatement(query);
			preparedStatement2.setLong(1, userId);
			ResultSet resultSet2 = preparedStatement.executeQuery();
			while (resultSet2.next()) {
				double sum = resultSet2.getDouble(1);
				cart.setTotal(sum);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (menuItemList.isEmpty()) {
			throw new CartEmptyException("Cart is Empty");
		}
		
		return menuItemList;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		Connection connection = ConnectionHandler.getConnection();
		String query = "delete from cart where user_id = ? and menu_item_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			preparedStatement.setLong(2, menuItemId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
