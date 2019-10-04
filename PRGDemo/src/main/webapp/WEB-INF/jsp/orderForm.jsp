<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/3/2019
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="saveOrder" method="post" modelAttribute="order">
    <p>Name: <form:input path="productName" /></p>
    <p>Quantity: <form:input path="quantity" /></p>
    <input type="submit" value="Place Order">
</form:form>

</body>
</html>
