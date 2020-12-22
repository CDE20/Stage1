package com.cognizant.truyum.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImpl implements CartDao{
	private static Connection conn = null;
	private static ResultSet rs = null;

	@Override
	public void addCartItem(long userId, long menuItemId) {

		String sql = "insert into Cart values(?,?,?)";
			try {
				conn = ConnectionHandler.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, 9);
				ps.setLong(2, userId);
				ps.setLong(3, menuItemId);
				int count = ps.executeUpdate();
				if(count>0)
					System.out.println("Values inserted into table");
				else
					System.out.println("Value updation fails");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
			List<MenuItem> list = new ArrayList<>();
			Cart C = new Cart(list,0);
			MenuItem M;
			String sql = "select M.id,M.name,M.price,M.Active,M.date_of_launch,M.category,M.free_delivery from Cart C join Menu M on C.menu_Id = M.id where C.user_id=?";
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, userId);
			rs = ps.executeQuery();
			while(rs.next()) {
				boolean active  = false;
				boolean freeDelivery = false;
				if(rs.getString(4).equalsIgnoreCase("yes")) {
					active = true;
				}
				if(rs.getString(7).equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}
				M = new MenuItem(rs.getInt(1),rs.getString(2),rs.getFloat(3),active,rs.getDate(5),rs.getString(6),freeDelivery);
				list.add(M);
			}
			if(list.isEmpty())
				throw new CartEmptyException("Cart of the User is Empty");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		String sql = "delete from Cart where user_id = ? and menu_id=?";
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, userId);
			ps.setLong(2, menuItemId);
			int count = ps.executeUpdate();
			if(count>0)
				System.out.println("Deleted Succesully");
			else
				System.out.println("Deletion Fail");
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
