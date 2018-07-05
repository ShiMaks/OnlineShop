<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>

    <h3>Users</h3>
    <tr>
        <th>Name</th>
        <th>Inform</th>

    </tr>
    <br>
    <br>
    <c:forEach items="${users}" var="user">
    <tr>

        <td>${user.name}"/></td>
        <td><a href="/admin/userInform${user.id}">Look</a></td>

    </tr>
    </c:forEach>

    <br>
    <br>
    <br>
    <br>

    <h3>Orders</h3>
    <tr>
        <th>OrderNumber</th>
        <th>Client</th>
        <th>Date</th>
        <th>Status</th>
    </tr>

   <tr>
        <c:forEach items="${orders}" var="order">
            <td>${order.id}</td>
            <td>${order.client.name}</td>
            <td>${order.dataOrder}</td>
            <td>${order.status}</td>
        </c:forEach>
    </tr>
</body>
</html>
