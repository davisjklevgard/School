<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java Web Programming: Register</title>

    <%@include file="includes/header.jsp"%>

</head>
<body id="back">
<div class="container">
    <div class="hero-unit">
        <h1>Register for the Student Website</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <p>
        <span style="color:red;">WARNING:</span> This will over-write the existing database.
    </p>

    <h3 style="color:${style};">${message}</h3>
    <form action="RegisterUser" method="post">
        <label for="firstName">First Name: </label>
        <input type="text" name="firstName" id="firstName"><br>

        <label for="lastName">Last Name: </label>
        <input type="text" name="lastName" id="lastName"><br>

        <label for="email">Email: </label>
        <input type="text" name="email" id="email"><br>

        <input type="submit" value="Register">
    </form>


    <%@include file="includes/footer.jsp"%>
</div>




</body>
</html>
