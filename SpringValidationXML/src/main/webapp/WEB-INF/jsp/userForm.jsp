<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/5/2019
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add A new User</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<p>Channel Name: ${channel}</p>
<p><a href="?lang=en_US">English</a>|<a href="?lang=zh_CN">Chinese</a></p>
<h1><spring:message code="userForm.title" /></h1>
<form:form modelAttribute="newUser" enctype="multipart/form-data">
    <form:errors path="*" cssClass="error"/>
    <p><spring:message code="user.name" /><form:input path="name"/><form:errors path="name" cssClass="error"/></p>
    <p><spring:message code="user.email"/>
   <form:input path="email"/><form:errors path="email" cssClass="error"/></p>
    <p><spring:message code="user.birthday" text="My Birthday"/>
        <form:input path="birthday"/><form:errors path="birthday" cssClass="error"/></p>
    <p>Age: <form:input path="age"/><form:errors path="age" cssClass="error"/></p>
    <p>Role:
        <form:select path="role">
            <form:option value="">Select Role</form:option>
            <form:options items="${roles}"/>
        </form:select>
        <form:errors path="role" cssClass="error"/>
    </p>

    <p>Profile Image: <from:input path="profileImage" type="file" /></p>

    <p>Address Info:</p>
    <p>Street: <form:input path="addr.street"/><form:errors path="addr.street" cssClass="error"/></p>
    <p>State: <form:input path="addr.state"/><form:errors path="addr.state" cssClass="error"/></p>
    <p>Zip code: <form:input path="addr.zipcode"/><form:errors path="addr.zipcode" cssClass="error"/></p>

    <input type="submit" value="Add"/>

</form:form>

</body>
</html>
