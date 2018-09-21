package com.ado.echat.util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ado.echat.rowmapper.RowMapper;


public class JDBCTemplate {
	/**
	 * 澧炲垹鏀�
	 * @param sql
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public static int executeUpdate(String sql,Object ...param) throws SQLException{
		int rows =-1;
		Connection con=JDBCUntil.getConnection();
		PreparedStatement ps=  con.prepareStatement(sql);
	if(null!=ps&&param.length>0){
		for (int i = 0; i < param.length; i++) {
			 
			ps.setObject(i+1, param[i]);
			
			
		}
	
		
	}
	rows=ps.executeUpdate();
	close(null,ps);
	
	return rows;	
	}
	/**
	 * 鏌ヨ
	 * @param sql
	 * @param rowMapper
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	
     public static List<Object>   executeQuery(String sql,RowMapper rowMapper,Object...param ) throws SQLException{
    	 
    	 List<Object> list = new ArrayList<Object>();
 		Connection conn =JDBCUntil.getConnection();//鑾峰彇杩炴帴
 		PreparedStatement ps = conn.prepareStatement(sql);
 		if(null != param && param.length>0) {
 			for (int i = 0; i < param.length; i++) {
 				ps.setObject((i+1), param[i]);// 鍗犱綅绗︿粠1寮�濮�   涓嬫爣浠�0寮�濮�
 			}
 		}
 		ResultSet rs=ps.executeQuery();
 		while(rs.next()){
 			   list.add(rowMapper.getObjectMapper(rs));
 			
 		}
 		
 		
		return list;
    	 
    	 
    	 
     }
	
	/**
	 * 鍏抽棴
	 * @param rs
	 * @param ps
	 * @throws SQLException
	 */
	public static void close(ResultSet rs, PreparedStatement ps) throws SQLException{
		if(null!=rs){
			rs.close();
		}
		if(null!=ps){
			ps.close();
		}
		
		
	}
	
	
	
	
}
