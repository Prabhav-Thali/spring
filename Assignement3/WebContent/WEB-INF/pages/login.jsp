<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<sf:form modelAttribute="Admin" method="POST">

USERName:<sf:input path="uname" /><sf:errors path="uname"/><br>
		<br>
Password:<sf:input type="password" path="pass" /><sf:errors path="pass"/><br>
		<br>


		<input type="submit" value="Submit">

	</sf:form>
</body>
</html>