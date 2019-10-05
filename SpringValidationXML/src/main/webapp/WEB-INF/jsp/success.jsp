<%--
  Created by IntelliJ IDEA.
  User: rXing
  Date: 10/5/2019
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>User Saved Successfully</h1>
<p>Name: ${savedUser.name}</p>
<p>Email: ${savedUser.email}</p>
<p>Birthday: ${savedUser.birthday}</p>
<p>Age: ${savedUser.age}</p>
<p>Role: ${savedUser.role}</p>

<h2>Address Info</h2>
<p>Street: ${savedUser.addr.street}</p>
<p>State: ${savedUser.addr.state}</p>
<p>Zip Code: ${savedUser.addr.zipcode}</p>

</body>
</html>
