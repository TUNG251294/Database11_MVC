<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/30/2022
  Time: 1:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer Information</title>
</head>
<body>
<a href="/dskhach">Back to customer list</a>

<p><c:out value="${requestScope['khach'].getId()}"/></p>
<p><c:out value="${requestScope['khach'].getName()}"/></p>
<p><c:out value="${requestScope['khach'].getEmail()}"/></p>
<p><c:out value="${requestScope['khach'].getAddress()}"/></p>

</body>
</html>
