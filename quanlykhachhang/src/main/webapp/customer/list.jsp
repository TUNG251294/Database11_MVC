

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/30/2022
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh Sach Khach Hang</title>
</head>
<body>
<a href="/dskhach?action=add">Add new Customer</a>

<table border="1">
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
    <th>Avatar</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  <c:forEach items="${requestScope['dsKhachHang']}" var="KhachHang">
    <tr>
      <td><a href="/dskhach?action=view&id=${KhachHang.getId()}">${KhachHang.getId()}</a></td>
      <td>${KhachHang.getName()}</td>
      <td>${KhachHang.getEmail()}</td>
      <td>${KhachHang.getAddress()}</td>
      <td><img src="${KhachHang.getAvatar()}" height="40px" width="40px" alt="not found"></td>
      <td><a href="/dskhach?action=edit&id=${KhachHang.getId()}">Edit</a></td>
      <td><a href="/dskhach?action=delete&id=${KhachHang.getId()}">Delete</a></td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
