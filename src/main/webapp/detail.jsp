<%--
  Created by IntelliJ IDEA.
  User: nguyen
  Date: 4/11/21
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.ex7_servlet.controller.BookDetailController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/ex7_servlet_war_exploded/login">Đăng xuất</a>
<div style="margin-left: 5px;">
        <%
        BookDetailController bookDetailController = new BookDetailController();
        %>
    <form action="/ex7_servlet_war_exploded/detail" method="post">
        <p>Id:         : </p>
        <p name ="id">${book.id}</p>
        <p>Name:       </p> <input name="name" value="${book.name}" type="text">
        <p>Publisher:  </p><input name="publisher" value="${book.publisher}" type="text">
        <p>Price:      </p><input name="price" value="${book.price}" type="number">
        <button type="submit" >Cập nhật</button>
    </form>
    <form action="/ex7_servlet_war_exploded/delete?bookId=${book.id}" method="post">
        <button type="submit">Xoa</button>
    </form>
</body>
</html>
