<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/30/2022
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD NEW CUSTOMER</title>
</head>
<body>
<a href="/dskhach">Back to customer list</a>

<p>
  <c:if test='${requestScope["message"] != null}'>
    <span style="color: green">${requestScope["message"]}</span>
  </c:if>
</p>

<form method="post">
  <label><p>Name</p><input name = "name" type="text"></label>
  <label><p>Email</p><input name = "email" type="text"></label>
  <label><p>Address</p><input name = "address" type="text"></label>
  <label><p>Avatar</p><input name = "avatar" type="text"></label>
  <input type="submit" value="Thêm">
</form>
</body>
</html>
