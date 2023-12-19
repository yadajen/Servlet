<%--natthaphol nirattisaikul 65130500105--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Midterm Exam</title>
</head>
<body>
<h1>Midterm Exam Web App by Natthaphol 65130500105</h1>
<c:if test="${user !=null}">
    <h1>Welcome ${user.name} (${user.email})</h1>
</c:if>
<hr>
<form action="register" method="post">
    User name:
    <input type="text" name="uName">
    Email Address:
    <input type="text" name="email">
    <input type="submit">
</form>
</body>
</html>
