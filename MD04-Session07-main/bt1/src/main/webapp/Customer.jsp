<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/22/2023
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table border="1">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.birthday}</td>
            <td>${item.address}</td>
            <td>
                <img src="${item.image}" height="100" width="100">
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
