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
<h1>Prime Checker::</h1>
<hr>
<form action="is_prime" method="post">
    Enter number to check:
    <input type="text" name="num"><br>
    <c:if test="${color=='red'}">
        <p style="color: ${color}">${result}</p>
    </c:if>
    <input type="submit">
    <hr>
    <c:if test="${color=='blue'}">
        <p style="color: ${color}">${result}</p>
    </c:if>
</form>
</body>
</html>
