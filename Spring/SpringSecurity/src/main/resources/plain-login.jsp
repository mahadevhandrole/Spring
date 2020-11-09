<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${PageContext.request.ContextPath}/authenticateTheUser" method="POST">

<c:if test="${param.error != null}">
<i class="failed">you have entered invalid username & password!!!</i>
</c:if>



User Name:<input type="text" name="username"/>
<br>
Password:<input type="password" name="password">
<br>
<input type="submit" value="Login">
</form:form>

</body>
</html>