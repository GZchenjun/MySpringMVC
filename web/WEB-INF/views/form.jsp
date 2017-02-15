<%--
  Created by IntelliJ IDEA.
  User: interface
  Date: 2017/2/14
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=path%>/admin/adminAdd/test/1000?aa=xiaomi" method="post">
        <input type="text" name="name"/>
        <input type="password" name="pwd"/>
        <input type="submit"/>
    </form>
</body>
</html>
