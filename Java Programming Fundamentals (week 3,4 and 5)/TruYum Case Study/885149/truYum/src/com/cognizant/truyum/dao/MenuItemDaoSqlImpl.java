package com.cognizant.truyum.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImpl implements MenuItemDao {

	@Override
	public List<MenuItem> getMenuItemAdmin() {
		// TODO Auto-generated method stub
		// ConnectionHandler ch = new ConnectionHandler();
		List<MenuItem> menu = new ArrayList<>();
		try {
			Connection con = ConnectionHandler.getConnection();

			PreparedStatement pstmt = con.prepareStatement("Select * from menu_item;");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				long id = rs.getLong("id");
				String name = rs.getString("Name");
				float price = rs.getFloat("Price");
				boolean active = false;
				if (rs.getString("Active").equalsIgnoreCase("yes")) {
					active = true;
				}
				Date dateOfLaunch = rs.getDate("dateOfLaunch");
				String category = rs.getString("Category");
				boolean freeDelivery = false;
				if (rs.getString("FreeDelivery").equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}
				MenuItem m = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
				menu.add(m);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menu;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		List<MenuItem> menu = new ArrayList<>();
		try {
			Connection con = ConnectionHandler.getConnection();
			Date d = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			// Date d = new Date();
			// System.out.println(format.format(d));
			String dt = format.format(d);
			PreparedStatement pstmt = con
					.prepareStatement("Select * from menu_item where active='yes' and dateOfLaunch < '" + dt + "';");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				long id = rs.getLong("id");
				String name = rs.getString("Name");
				float price = rs.getFloat("Price");
				boolean active = false;
				if (rs.getString("Active").equalsIgnoreCase("yes")) {
					active = true;
				}
				Date dateOfLaunch = rs.getDate("dateOfLaunch");
				String category = rs.getString("Category");
				boolean freeDelivery = false;
				if (rs.getString("FreeDelivery").equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}
				MenuItem m = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
				menu.add(m);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menu;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		ConnectionHandler c = new ConnectionHandler();
		long id = menuItem.getId();
		String name=menuItem.getName();
		float Price=menuItem.getPrice();
		String cat=menuItem.getCategory();
		try {
			Connection conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement("update menu_item set name = ?,price = ?,category = ? where id = ?  ");
			ps.setLong(4,id);
			ps.setString(1, name);
			ps.setFloat(2, Price);
			ps.setString(3, cat);
			int n = ps.executeUpdate();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		MenuItem m1 = null;
		ConnectionHandler c = new ConnectionHandler();
		try {
			Connection conn = c.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("Select * from menu_item where id = " + menuItemId + ";");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				long id = rs.getLong("id");
				String name = rs.getString("Name");
				float price = rs.getFloat("Price");
				boolean active = false;
				if (rs.getString("Active").equalsIgnoreCase("yes")) {
					active = true;
				}
				Date dateOfLaunch = rs.getDate("dateOfLaunch");
				String category = rs.getString("Category");
				boolean freeDelivery = false;
				if (rs.getString("FreeDelivery").equalsIgnoreCase("yes")) {
					freeDelivery = true;
				}
				m1 = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m1;

	}

}
