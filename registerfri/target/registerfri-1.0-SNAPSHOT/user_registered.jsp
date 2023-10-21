<%--
  Created by IntelliJ IDEA.
  User: Yadajen
  Date: 29/9/2566
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="margin-left: 100px;background-color: ${cookie.bg_color_cookie.value}">
<h3>Course Register History</h3>
<c:if test="${message!=null}">
    <span style="color: red; font-size: larger"${message}"<br></span>
</c:if>
<c:if test="${message==null}">
<c:forEach items="${courseRegistered.history}" var="entry">
    <h3>${semesters[entry.key]}</h3><hr>
    <c:forEach items="${entry.value}" var="subject">
        ${subject.subjectId}, ${subject.title}, ${subject.credit}<br>
    </c:forEach>
    ----------------------------<br><br>
    </c:forEach>
</c:if>
</body>
</body>
</html>
