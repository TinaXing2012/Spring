<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/2/2019
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add a new Customer</title>
</head>
<body>

<h1>Add a new Customer</h1>
<form:form action="saveCustomer" modelAttribute="customer">

    <p>First Name: <form:input path="first" /></p>
    <p>Last Name: <form:input path="last" /></p>
    <p>Phone Number: <form:input path="phone" /></p>
    <p>Select your country:
        <%--<form:select path="country.id" items="${countryList}"/>--%>
        <%--<form:select path="country.id" items="${countryMap}"/>--%>
        <%--<form:select path="country.id" items="${countryObjList}" itemLabel="id" itemValue="name"/>--%>

        <form:select path="country.id">
            <form:option value="----">Please select a Category</form:option>
            <form:options items="${countryObjList}" itemLabel="name" itemValue="id"></form:options>
        </form:select>
    </p>

    <input type="submit" value="Add Customer">
</form:form>
</body>
</html>
