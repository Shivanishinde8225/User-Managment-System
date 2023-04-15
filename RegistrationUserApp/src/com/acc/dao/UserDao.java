package com.acc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acc.model.User;
import com.acc.util.DBConnection;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class UserDao {
	public static boolean validateUser(String name,String password) {
		boolean status = false;
		String query2 = "select * from User1 where uname = ? and password = ?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query2)){
				
				
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, password);
				
				
				ResultSet rs= preparedStatement.executeQuery();
				status= rs.next();
			} catch (Exception e) {
				// TODO: handle exception
			}
		return status;
		
	}
	public static int registerUser(User user) {
		int result = 0;
		String query = "insert into User1 (f_name,l_name,uname,password,address,contact) values(?,?,?,?,?,?);";
		try (Connection connection = DBConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setString(3, user.getUname());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setString(6, user.getContact());
			
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	
	public User selectUser(int uid) {
		User user = null;
		String SELECT_USER_BY_ID = "select  f_name, l_name, uname, password, address, "
				+ "contact from user1 where uid = ?;";
		try (Connection connection = DBConnection.getConnection();
	PreparedStatement statement = connection.prepareStatement(SELECT_USER_BY_ID);) 
 {
			statement.setInt(1, uid);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				user = new User(rs.getString("f_name"), rs.getString("l_name"), rs.getString("uname"),rs.getString("password"), rs.getString("address"),rs.getString("contact"));
		}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	
	public boolean deleteUser(int uid) throws SQLException {
		boolean rowDeleted = false;
		//System.out.println(uid);
		String query1 = "delete from User1 where uid =?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query1)){
			preparedStatement.setInt(1, uid);
			rowDeleted = preparedStatement.executeUpdate()>0;
		} 
		return rowDeleted;
		
	}
	
	public boolean updateUser(User user, int id) throws SQLException {
		boolean rowUpdated;
String UPDATE_USERS_SQL = "update user1 set f_name=?, l_name=?, uname=?, password=?, "
				+ "address=?, contact=? where uid = ?;";
		try (Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);) 
{
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setString(3, user.getUname());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getAddress());
			preparedStatement.setString(6, user.getContact());
			preparedStatement.setInt(7, id);
			System.out.println(preparedStatement);
			rowUpdated = preparedStatement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

}
