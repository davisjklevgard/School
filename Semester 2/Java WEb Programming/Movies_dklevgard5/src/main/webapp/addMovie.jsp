<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Add a new movie</title>

  <%@include file="includes/header.jsp"%>

</head>
<body id="back">
<div class="container">
  <div class="hero-unit">
    <h1>Add a new movie to the database</h1>
  </div>

  <%@include file="includes/navigation.jsp"%>
  

  <h3 style="color:${style};">${message}</h3>
  <form action="AddMovie" method="post">
    <label for="title">Title: </label>
    <input type="text" name="title" id="title"><br>

    <label for="director">Director: </label>
    <input type="text" name="director" id="director"><br>

    <label for="lengthInMinutes">Length in Minutes: </label>
    <input type="text" name="lengthInMinutes" id="lengthInMinutes"><br>

    <input type="submit" value="Add Movie">
  </form>


  <%@include file="includes/footer.jsp"%>
</div>




</body>
</html>
