<%--
  Created by IntelliJ IDEA.
  User: demon
  Date: 2020/9/7
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account</title>
</head>
<body>
<a href="account/findAll">所有账户</a>
<h3>创建账户</h3>
<form action="account/add" method="post">
    用户名：<input type="text" name="username"/>
    余额：<input type="text" name="balance"/>
    <input type="submit" value="创建账户"/>
</form>
</body>
</html>
