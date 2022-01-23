<%--
  Created by IntelliJ IDEA.
  User: davisklevgard
  Date: 11/17/21
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Page</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="hero-unit">
            <h1>Welcome to Web Programming</h1>
        </div>

    <%@include file="includes/navigation.jsp"%>

        <form action="Search" method="get">
            <label for="title"> Search by Title:</label>
            <input type="text" name="title" id="title">
            <input type="submit" value="Search">
        </form>

        <form action="Search" method="get">
            <label for="director"> Search by Director:</label>
            <input type="text" name="title" id="director">
            <input type="submit" value="Search">
        </form>

    <%@include file="includes/footer.jsp"%>
    </div>
</body>
</html>
