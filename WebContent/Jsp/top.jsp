<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/e_top.css"/>
<title>Welcome Page</title>
</head>
<body>
<%
   Cookie[] cookie=request.getCookies();
   String name=null;
   for(int i=0;i<cookie.length;i++){
	   if("name".equals(cookie[i].getName())){
		   name=cookie[i].getValue();
	   }	   
   }   
%>
<div>
      <div class="top_text">E-Chat聊天室</div>
      <div class="pri_infos">
      <span><%=name%>:&nbsp;&nbsp;<a href="info.jsp">[个人资料]</a></span>
      </div>
</div>
</body>
</html>