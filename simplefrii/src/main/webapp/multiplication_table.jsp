<%--
  Created by IntelliJ IDEA.
  User: Yadajen
  Date: 19/9/2566
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Multiplication_table</title>
    <style>
        td{
            margin:12px;
            border: darkcyan solid 1px;
            padding: 2px 5px 2px 5px;
            border-spacing: inherit;
        }
    </style>
    <h3>Multiplication Table of ${param.number}</h3>
<c:if test="${message==null}">
    <table>
        <tr>
            <td style="background-color: chartreuse" colspan="5">Multiplication Table</td>
        </tr>
        <c:forEach begin="1" end="24" var="n">
            <tr>
                <td>${param.number}</td>
                <td> x </td>
                <td> ${n} </td>
                <td> = </td>
                <td> ${param.number * n} </td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<c:if test="${message!=null}">
    <h4>Error:: <hr>
        ${requestScope.message} <span style="color: red">(${param.number})</span>
    </h4>
</c:if>
</head>
<body>
Your browser : ${header["User-Agent"]}
</body>
</html>
