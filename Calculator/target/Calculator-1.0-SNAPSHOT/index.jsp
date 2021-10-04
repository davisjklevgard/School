<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<div align ="center">
<h1>Web Calculator</h1>
    <form action="calculate" method="post">
        <p>
            Input number A <label>
            <input type = "number" name ="a" required />
        </label>
        </p>
        <p>
            Input number B <label>
            <input type = "number" name ="a" required />
        </label>
        </p>
         <input type="submit" value="RUN" />
    </form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</div>
</body>
</html>