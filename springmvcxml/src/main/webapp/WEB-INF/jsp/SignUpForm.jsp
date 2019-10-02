<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/1/2019
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up Form</title>
</head>
<body>

<form action="signup" method="post">
    <p>First Name: <input name="firstName"></p>
    <p>Last Name: <input name="lastName"></p>
    <p>Address:</p>
    <input name="address"/>
    <p>Street: <input name="address.street"></p>
    <p>ZipCode: <input name="address.zipcode"></p>
    <input type="submit" value="Sign Up" />
</form>

</body>
</html>
