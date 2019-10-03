<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/2/2019
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new Customer</title>
</head>
<body>

<h1>Add a new Customer</h1>
<form action="saveCustomer" method="post">

    <p>First Name: <input name="first" /></p>
    <p>Last Name: <input name="last" /></p>
    <p>Phone Number: <input name="phone" /></p>

    <input type="submit" value="Add Customer">
</form>
</body>
</html>
