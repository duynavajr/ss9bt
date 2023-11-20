<%--
  Created by IntelliJ IDEA.
  Date: 11/13/2023
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<ul>
    <c:forEach items="${list}" var="item">
        <li><a href="">${item.name}</a></li>
    </c:forEach>


</ul>
</html>
