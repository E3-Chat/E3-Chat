package com.ado.echat.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.ado.echat.dao.UserDao;
import com.ado.echat.entity.User;
import com.ado.echat.rowmapper.impl.UserRowMapper;
import com.ado.echat.util.JDBCTemplate;


public class UserDaoImpl   implements  UserDao{

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub

		
		
		return 0;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> queryByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from user where userName like '?%'";
		List<?> list=JDBCTemplate.executeQuery(sql,new UserRowMapper() , name);
		return   (List<User>) list ;
	}

}
