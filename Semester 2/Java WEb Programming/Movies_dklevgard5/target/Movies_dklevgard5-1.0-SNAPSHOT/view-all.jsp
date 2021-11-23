<%--
  Created by IntelliJ IDEA.
  User: davisklevgard
  Date: 11/22/21
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java Web Programming: Class List</title>

    <meta name="description" content="This is a servlet example that demonstrates how to use IO to output the content of
                                an excel spreadsheet to a web page.">
    <%@include file="includes/header.jsp"%>

</head>
<body id="back">
<div class="container">
    <div class="hero-unit">
        <h1>Class List</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <div class="container">
        <c:choose>
            <c:when test="${empty movies}">
                <p>Sorry, the list of movies was empty!</p>
            </c:when>
            <c:otherwise>
                <!-- The list has people in it -->
                <c:forEach var="person" items="${movies}">
                    <h2>${movie.title}</h2>
                    <p>${movie.title} is ${movie.lengthInMinutes} minutes long.<br>
                            ${movie.title} director is ${movie.director}</p>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </div>

    <%@include file="includes/footer.jsp"%>
</div>




</body>
</html>