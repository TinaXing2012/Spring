<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/5/2019
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add A new User</title>
</head>
<body>

<h1>Add a new User</h1>
<form:form modelAttribute="newUser">
    <p>User Name: <form:input path="name"/></p>
    <p>Email: <form:input path="email"/></p>
    <p>Birthday: <form:input path="birthday"/></p>
    <p>Age: <form:input path="age"/></p>
    <p>Role:
        <form:select path="role">
            <form:option value="">Select Role</form:option>
            <form:options items="${roles}"/>
        </form:select>
    </p>

    <p>Address Info:</p>
    <p>Street: <form:input path="addr.street"/></p>
    <p>State: <form:input path="addr.state"/></p>
    <p>Zip code: <form:input path="addr.zipcode"/></p>

    <input type="submit" value="Add"/>

</form:form>

</body>
</html>
