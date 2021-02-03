package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImpl implements MenuItemDao{

	public List<MenuItem> getMenuItemListAdmin()
	{	
		List<MenuItem> lst = new ArrayList<MenuItem>();
		try {
			Connection conn = ConnectionHandler.getConnection();
			String sql = "select me_id,me_name,me_price,me_active,me_dol,me_category,me_freedelivery from menu_item";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			stmt.clearParameters();
			while(rs.next()) {
				long id = rs.getLong("me_id");
				String name = rs.getString("me_name");
				float price = rs.getFloat("me_price");
				String active = rs.getString("me_active");
				Date dateOfLaunch = rs.getDate("me_dol");
				String category = rs.getString("me_category");
				String freeDelivery = rs.getString("me_freedelivery");
				
				boolean a = false;
				boolean d = false;
				if(active.equals("yes")) {
					a=true;
				}
				if(freeDelivery.equals("yes")) {
					d=true;
				}
				
				MenuItem m= new MenuItem(id,name,price,a, dateOfLaunch, category,d);
				lst.add(m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		
		List<MenuItem> lst = new ArrayList<MenuItem>();
		try {
			Connection conn = ConnectionHandler.getConnection();
			String sql = "select me_id,me_name,me_price,me_active,me_dol,me_category,me_freedelivery from menu_item where me_active='yes' and me_dol<'2018-12-02'";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			stmt.clearParameters();
			while(rs.next()) {
				long id = rs.getLong("me_id");
				String name = rs.getString("me_name");
				float price = rs.getFloat("me_price");
				String active = rs.getString("me_active");
				Date dateOfLaunch = rs.getDate("me_dol");
				String category = rs.getString("me_category");
				String freeDelivery = rs.getString("me_freedelivery");
				
				boolean a = false;
				boolean d = false;
				if(active.equals("yes")) {
					a=true;
				}
				if(freeDelivery.equals("yes")) {
					d=true;
				}
				
				MenuItem m= new MenuItem(id,name,price,a, dateOfLaunch, category,d);
				lst.add(m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}
	
	public MenuItem getMenuItem(long menuItemId){
		
		MenuItem m = null;
		try {
			Connection conn = ConnectionHandler.getConnection();
			String sql = "select me_id,me_name,me_price,me_active,me_dol,me_category,me_freedelivery from menu_item where me_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1, menuItemId);
			ResultSet rs = stmt.executeQuery();
			stmt.clearParameters();
			while(rs.next()) {
				long id = rs.getLong("me_id");
				String name = rs.getString("me_name");
				float price = rs.getFloat("me_price");
				String active = rs.getString("me_active");
				Date dateOfLaunch = rs.getDate("me_dol");
				String category = rs.getString("me_category");
				String freeDelivery = rs.getString("me_freedelivery");
				
				boolean a = false;
				boolean d = false;
				if(active.equals("yes")) {
					a=true;
				}
				if(freeDelivery.equals("yes")) {
					d=true;
				}
				
				m= new MenuItem(id,name,price,a, dateOfLaunch, category,d);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
	@Override
	public void modifyMenuItem(MenuItem menuItem){
		
		long id= menuItem.getId();
		String name= menuItem.getName();
		float price = menuItem.getPrice();
		boolean active= menuItem.isActive();
		Date dateOfLaunch= menuItem.getDateOfLaunch();
		String category= menuItem.getCategory();
		boolean freeDelivery = menuItem.isFreeDelivery(); 
		String a;
		String d;
		if(active==true) {
			a="yes";
		}
		else {
			a="no";
		}
		if(freeDelivery==true) {
			d="yes";
		}
		else {
			d="no";
		}
		
		try {
			Connection conn = ConnectionHandler.getConnection();
			String sql = "update menu_item set me_name=?, me_price=?, me_active=?, me_dol=?, me_category=?, me_freedelivery=? where me_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setFloat(2, price);
			stmt.setString(3, a);
			stmt.setDate(4, new java.sql.Date(dateOfLaunch.getTime()));
			stmt.setString(5, category);
			stmt.setString(6, d);
			stmt.setLong(7, id);
			stmt.executeUpdate();
			stmt.clearParameters();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
