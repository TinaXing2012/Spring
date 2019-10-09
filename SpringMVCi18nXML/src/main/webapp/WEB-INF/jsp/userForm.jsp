<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/8/2019
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="userform.title" text="Default Title"/> </title>
</head>
<body>
    <p><a href="?language=en_US">English</a>|<a href="?language=zh_CN">Chinese</a> </p>
    <h1><spring:message code="userform.title" text="Default Title"/> </h1>
    <form>
        <p><label><spring:message code="userform.username" text="Default Username: "/>  <input name="username"></label></p>
        <p><label><spring:message code="userform.password" text="Default Password: "/>  <input name="password"></label></p>
        <input type="submit" value="<spring:message code="userform.signup" text="Default Password: "/>" />
    </form>
</body>
</html>
