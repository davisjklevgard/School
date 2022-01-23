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
        <h1>Add a new person to the database</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <p>
       <span style="color:red;">WARNING:</span> This will over-write the existing database.
    </p>

    <h3 style="color:${style};">${message}</h3>
    <form action="AddPerson" method="post">
        <label for="firstName">First Name: </label>
        <input type="text" name="firstName" id="firstName"><br>

        <label for="lastName">Last Name: </label>
        <input type="text" name="lastName" id="lastName"><br>

        <label for="age">Age: </label>
        <input type="text" name="age" id="age"><br>

        <label for="favoriteColor">Favorite Color: </label>
        <input type="text" name="favoriteColor" id="favoriteColor"><br>

        <input type="submit" value="Add Person">
    </form>


    <%@include file="includes/footer.jsp"%>
</div>




</body>
</html>