<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/e_login.css">
<title>Insert title here</title>
<script type="text/javascript">
   function e_regist(){
	   location.href="regist.jsp"	   
   }
</script>
</head>
<body>
<div>
<form action="do_Login.jsp" method="post">
    用户名:<input type="text" name="username"/><br/>
    <hr/>
   密&nbsp;&nbsp;码:&nbsp;<input type="password" name="userpwd"/><br/>
   <hr/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="submit" value="登录" />
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="button" value="注册"onclick="e_regist()"/>
</form>
</div>
</body>
</html>