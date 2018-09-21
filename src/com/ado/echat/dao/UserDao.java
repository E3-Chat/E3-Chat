package com.ado.echat.dao;

import java.sql.SQLException;
import java.util.List;

import com.ado.echat.entity.User;


public interface UserDao {
	
	public  abstract int addUser(User user);
	public  abstract int update(User user);
	public   abstract  int delUser(User user);
	public  abstract  List<User> queryByName(String name) throws SQLException;
	

}
