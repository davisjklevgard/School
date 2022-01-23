<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java Web Programming: Populate Database</title>

    <%@include file="includes/header.jsp"%>

</head>
<body id="back">
<div class="container">
    <div class="hero-unit">
        <h1>Populate the Database</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <p>
       <span style="color:red;">WARNING:</span> This will over-write the existing database.
    </p>

    <form action="Populate" method="get">
        <label> Are you sure?</label><input type="submit" value="Populate!">
    </form>

    <h2>${message}</h2>
    <%@include file="includes/footer.jsp"%>
</div>




</body>
</html>