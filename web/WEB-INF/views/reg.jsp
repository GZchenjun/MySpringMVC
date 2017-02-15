<%--
  Created by IntelliJ IDEA.
  User: interface
  Date: 2017/2/14
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="" method="post" modelAttribute="admin">
        <form:input path="name"/>
        <form:password path="pwd"/>
    </form:form>
</body>
</html>
