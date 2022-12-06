<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/30/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Customer</title>
</head>
<body>
<a href="/dskhach">Back to Customer list</a>

<form method="post">
    <label>Id: <input name="id" id="id" type="number" value="${requestScope['khach'].getId()}" disabled></label><br>
    <label>Name: <input name = "name" id="name" type="text" value="${requestScope['khach'].getName()}"></label><br>
    <label>Email: <input name = "email" id = "email" type="text" value="${requestScope['khach'].getEmail()}"></label><br>
    <label>Address: <input name = "address" id = "address" type="text" value="${requestScope['khach'].getAddress()}"></label><br>
    <label>Avatar: <input name = "avatar" id = "avatar" type="text" value="${requestScope['khach'].getAvatar()}"></label><br>
    <input type="submit" value="Edit">
</form>
</body>
</html>
