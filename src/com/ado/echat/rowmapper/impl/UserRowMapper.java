package com.ado.echat.rowmapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ado.echat.entity.User;
import com.ado.echat.rowmapper.RowMapper;

public class UserRowMapper  implements RowMapper{

	public Object getObjectMapper(ResultSet rs) throws SQLException {
		User user=new User();
		user.setUserName(rs.getString("userName"));
		user.setPassWord(rs.getString("passWord"));
		user.setFakeName("fakeName");
		user.setSex(rs.getString("sex"));
		user.setAge(Integer.valueOf(rs.getString("age)")));
		user.setFriendIDList(prase(rs, "friend"));
		user.setHobbyList(prase(rs, "hobby"));
		
		// TODO Auto-generated method stub
		return user;
		
		
		
	}
	private   List<String>  prase(ResultSet rs,String lable) throws SQLException{
		List<String > objectList=new  ArrayList<String >();
		String []object=rs.getString(lable).split(",");
		for (int i = 0; i < object.length; i++) {
        objectList.add(object[i]);
		}
		
		return objectList;
	}
	

}
