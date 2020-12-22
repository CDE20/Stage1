package com.cognizant.truyum.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImpl implements MenuItemDao {

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		String query = "select * from menu_item";
		ArrayList<MenuItem> menuItemList = new ArrayList<>();
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				menuItemList.add(new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4),
						rs.getDate(5), rs.getString(6), rs.getBoolean(7)));
			}
			return menuItemList;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		String query = "select * from menu_item where active=1 and dateoflaunch<=CURDATE()";
		ArrayList<MenuItem> menuItemList = new ArrayList<>();
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				menuItemList.add(new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4),
						rs.getDate(5), rs.getString(6), rs.getBoolean(7)));
			}
			return menuItemList;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		String query = "delete from menu_item where id="+menuItem.getId();
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			int result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		String query = "select * from menu_item where id="+menuItemId;
		try {
			PreparedStatement ps = ConnectionHandler.getConection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), rs.getBoolean(4),
						rs.getDate(5), rs.getString(6), rs.getBoolean(7));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
