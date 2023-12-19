<%--natthaphol nirattisaikul 65130500105--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Midterm Exam</title>
</head>
<body>
<h1>Prime Checker History::</h1>
<hr>
<h1>Midterm Exam Web App by Natthaphol 65130500105</h1>
<c:if test="${user !=null}">
  <h1>Welcome ${user.name} (${user.email})</h1>
</c:if>
<hr>
<table>
  <tr>
    <th>No</th>
    <th>Number</th>
    <th>Is Prime ?</th>
  </tr>
  <c:forEach items="${primeList}" var="prime" varStatus="vs">
    <tr>
      <td>${vs.count}</td>
      <td>${prime.number}</td>
      <td>
        <c:if test="${prime.prime}">yes</c:if>
        <c:if test="${!prime.prime}">no</c:if>
      </td>
    </tr>
  </c:forEach>
</table>
<hr>
No of prime = ${requestScope.count}
</body>
</html>
