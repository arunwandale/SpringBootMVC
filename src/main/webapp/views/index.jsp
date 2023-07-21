<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Jsp Page </title>
</head>
<body>
	Welcome to Simple JSP
	
	<form action="addAlian" method="POST"> <!-- Adding method tag for @ -->
	
	Enter id   :<input type="text" name="id"><br>
	Enter name :<input type="text" name="name"><br>
	
	<input type="submit">
	</form>
</body>

</html>