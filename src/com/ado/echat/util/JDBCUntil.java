package com.ado.echat.util;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class JDBCUntil {
	static String  url;
	static String  username;
	static String  password;
	static ThreadLocal<Connection> threadLocal=new ThreadLocal<Connection>();
	static{
		File xmlFile=new  File("/data"+File.separator+"JDBC.xml");
	   SAXReader reader=new SAXReader();
	   try {
		Document document= reader.read(xmlFile);
		Element root=document.getRootElement();
       List<Element> list= root.elements();
        url=list.get(1).attribute("class").getValue();
        username=list.get(2).attribute("class").getValue();
        password=list.get(3).attribute("class").getValue();
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
		
		
		
	}
	/**
	 * 获取连接
	 * @return
	 */
	public   static Connection   getConnection(){
      Connection  con=threadLocal.get();
      if(null==con){
    	  try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }

		
		return con;
	}
	
	public  void  closeConnection(Connection con){
	if(null!=con){
		threadLocal.remove();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	}	
	
	

}
