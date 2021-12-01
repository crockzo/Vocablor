package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.Entity.User;
public class UserDao {

	private Connection connection;
	
	public UserDao(Connection connection) {
		this.connection = connection;
	}
	
	public boolean saveUser(User user) {
		
		boolean flag = false;
		try {
			PreparedStatement ps = connection.prepareStatement("insert into tbl_user (name, username, password, gender) values (?, ?, ?, ?);");
			ps.setString(1, user.getName());
			ps.setString(2,  user.getUsername());
			ps.setString(3,  user.getPassword());
			ps.setInt(4, user.getGender());
			
			ps.execute();
			
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public User isValid(String username, String password) {
		User user = null;
		
		try {
			PreparedStatement pd = connection.prepareStatement("select userid, name, username, joindate, gender from tbl_user where username = ? and password = ?;");
			pd.setString(1, username);
			pd.setString(2, password);
			
			ResultSet rs = pd.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				int uid = rs.getInt("userid");
				String uname = rs.getString("username");
				java.sql.Date date = rs.getDate("joindate");
				int gender = rs.getInt("gender");
				
				user = new User(uid, name, uname, date, gender);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
}
