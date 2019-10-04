<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/3/2019
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Static Resources</title>
</head>
<body>

<img src="resources/images/dog.jpg" />
<img src="<spring:url value='/resources/images/dog.jpg' /> " />

<pre>
    <mvc:resources mapping="/abc/**" location="/resources/" />
</pre>
<img src="abc/images/user/cat.jpg" width="35%" height="35%" />
<img src="abc/images/dog.jpg" />


</body>
</html>
