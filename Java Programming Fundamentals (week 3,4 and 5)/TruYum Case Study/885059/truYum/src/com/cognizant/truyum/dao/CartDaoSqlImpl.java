package com.cognizant.truyum.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl implements CartDao {

	@Override
	public void addCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		String query = "insert into cart values(?,?)";
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ps.setLong(1, userId);
			ps.setLong(2, menuItemId);
			int result = ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> menuItems = new ArrayList<>();
		Cart cart;
		String query = "select * from menu_items where id in(select id from cart where userId=?)";
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ps.setLong(1, userId);
			ResultSet rs = ps.executeQuery();
			float sum = 0;
			while (rs.next()) {
				sum += rs.getFloat(3);
				menuItems.add(new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4),
						rs.getDate(5), rs.getString(6), rs.getBoolean(7)));
			}
			cart = new Cart(menuItems, sum);
			return cart.getMenuItemList();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		String query = "delete from cart where userid=? and id=?";
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ps.setLong(1, userId);
			ps.setLong(2, menuItemId);
			int result = ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
