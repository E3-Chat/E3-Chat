<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Treat Page</title>
</head>
<body>
<%
   String name=request.getParameter("username");
   String password=request.getParameter("userpwd");
   
   Cookie cookie_name=new Cookie("name",name);
   Cookie cookie_pwd=new Cookie("password",password);
   
   session.setAttribute("name", name);
   session.setAttribute("password", password);
   
   response.addCookie(cookie_name);
   response.addCookie(cookie_pwd);
   
   response.sendRedirect("welcome.jsp");
   
%>
</body>
</html>