<%--
  Created by IntelliJ IDEA.
  User: Yadajen
  Date: 6/10/2566
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select your theme</title>
</head>
<body style="background-color: ${cookie.bg_color_cookie.value}">
    <h2>Select your theme</h2>
        <hr>
    <form action ="set-theme" method="post">
    <p>
        <input type="radio" name="bgColor" value="pink">
        <button style="background-color: pink">pink</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="lightblue">
        <button style="background-color: lightblue">lightblue</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="bisque">
        <button style="background-color: bisque">base</button>
    </p>
    <p>
        <input type="radio" name="bgColor" value="plum">
        <button style="background-color: plum">purple</button>
    </p>
    <hr>
    <input type="submit" value="OK">
</form>
</body>
</html>
