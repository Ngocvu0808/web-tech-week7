<%--
  Created by IntelliJ IDEA.
  User: nguyen
  Date: 4/11/21
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/ex7_servlet_war_exploded/login">Đăng xuất</a>
<form action="/ex7_servlet_war_exploded/home" method="post">
    <p>Nhập tên sách để tìm kiếm:</p>
    <input name="book"/>

    <div><button type="submit">tìm kiếm</button></div>
</form>
</body>
</html>
