<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Personal Website</title>
    <link rel="stylesheet" href= "main.css">
</head>
<body>
<div id="wrapper">
    <h1>Welcome</h1>
    <ul class="nav nav-tabs">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="bioPage.jsp">Bio</a></li>
        <li><a href="contact.jsp">Contact</a></li>
    </ul>
<p>Welcome to my personal website. To connect with me, submit your personal information below.
To learn more about me, click the link to my <a href="bioPage.jsp">Bio Page</a></p>
<br/>
<form action="connect" method="get">
    <p style="color: red">${message}</p>
    <label  for="firstName">First Name</label>
    <input type="text" name="firstName" id="firstName"><br>

    <label  for="lastName">Last Name</label>
    <input type="text" name="lastName" id="lastName"><br>

    <label  for="email">Email</label>
    <input type="text" name="email" id="email"><br>

    <input type="submit" value="submit"><br>
</form>
</div>
</body>
</html>