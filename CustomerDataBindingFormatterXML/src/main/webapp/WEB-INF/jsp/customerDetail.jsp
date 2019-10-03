<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/2/2019
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Detail</title>
</head>
<body>
<p>Name: ${customer.first} ${customer.last}</p>
<p>Phone Number: ${customer.phone.areaCode} - ${customer.phone.prefix}- ${customer.phone.number}</p>
</body>
</html>
