<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/2/2019
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit a Customer</title>
</head>
<body>
<form action="saveCustomer" method="post">

    <p>First Name: <input name="first" value="${customer.first}" /></p>
    <p>Last Name: <input name="last" value="${customer.last}"/></p>
    <p>Phone Number: <input name="phone" value="${customer.phone}"/></p>

    <input type="submit" value="Add Customer">
</form>
</body>
</html>
