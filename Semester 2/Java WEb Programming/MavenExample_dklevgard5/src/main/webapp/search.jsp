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
            <label for="firstName"> Search by First Name:</label>
            <input type="text" name="firstName" id="firstName">
            <input type="submit" value="Search">
        </form>

    <%@include file="includes/footer.jsp"%>
    </div>
</body>
</html>
