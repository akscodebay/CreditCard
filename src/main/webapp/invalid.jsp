<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CreditCard-Invalid</title>
<style type="text/css">
body{
background-color: orange;
}
div{
padding: 20px;
text-align: center;
font-size: 50px;
}
a{
margin-left: 44%;
text-decoration: none;
font-size: 30px;
}
a:hover{
background-color: lightgreen;
}
</style>
</head>
<body>
<div id="msg">Invalid PAN Entry!!!</div>
<a href="<c:url value="/" />">Enter Again</a>
</body>
</html>