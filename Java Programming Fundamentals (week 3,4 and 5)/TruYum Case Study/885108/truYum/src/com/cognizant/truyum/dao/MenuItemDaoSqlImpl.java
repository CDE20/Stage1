package com.cognizant.truyum.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImpl implements MenuItemDao {
	
	private static Connection conn = null;
	private static ResultSet rs = null;
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		String sql = "select * from menu";
		List<MenuItem> list = new ArrayList<MenuItem>();
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
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
					MenuItem M = new MenuItem(rs.getInt(1),rs.getString(2),rs.getFloat(3),active,rs.getDate(5),rs.getString(6),freeDelivery);
					list.add(M);   
					
				//System.out.println(rs.getInt(1) + rs.getString(4));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		String sql = "select * from menu where active='Yes' and Date_of_launch<= '2020-12-12'";
		List<MenuItem> list = new ArrayList<MenuItem>();
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
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
				MenuItem M = new MenuItem(rs.getInt(1),rs.getString(2),rs.getFloat(3),active,rs.getDate(5),rs.getString(6),freeDelivery);
				list.add(M);   
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public MenuItem getMenuItem(long menuItemId) {
		String sql = "select * from menu where id=?";
		MenuItem M = null;
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, menuItemId);
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
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return M;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		String sql = "update menu SET name=?,price=?,active=?,date_of_launch=?,category=?,free_delivery=? where Id = " + menuItem.getId();
		//MenuItem M = null;
		try {
			conn = ConnectionHandler.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, menuItem.getName());
			ps.setFloat(2, menuItem.getPrice());
			String active = "No";
			String freeDelivery = "No";
			if(menuItem.isActive())
				active = "Yes";
			if(menuItem.isFreeDelivery())
				freeDelivery = "Yes";
			ps.setString(3, active);
			int year = 1900 + menuItem.getDateOfLaunch().getYear();
			int day = menuItem.getDateOfLaunch().getDay();
			int month = 1 + menuItem.getDateOfLaunch().getMonth();
			String str = year + "-" + month + "-" + day;
			Date d = Date.valueOf(str);  
			ps.setDate(4, d); 
			ps.setString(5, menuItem.getCategory());
			ps.setString(6, freeDelivery);
			int count = ps.executeUpdate();
			if(count>0)
				System.out.println("Update Successful");
			else
				System.out.println("No rows Updated");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
	}

}