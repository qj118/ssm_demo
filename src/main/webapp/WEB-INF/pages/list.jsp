<%--
  Created by IntelliJ IDEA.
  User: demon
  Date: 2020/9/7
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表</title>
</head>
<body>
<h1>账户列表</h1>
<c:forEach items="${accounts}" var="account">
    ${account.username} ${account.balance} <br/>
</c:forEach>
</body>
</html>
