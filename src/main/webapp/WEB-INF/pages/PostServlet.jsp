<%--
  Created by IntelliJ IDEA.
  User: Elias
  Date: 02/12/2019
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PostServlet</title>
</head>
<body>
    <h1>Hello ${postName}</h1>
    <h1>You reached the POST servlet</h1>
    <h2><a href="${pageContext.request.contextPath}/getservlet">Back to the GET servlet</a> </h2>
    <form method="get" action="getservlet">
        <input type="submit" value="back to GET servlet">
    </form>
</body>
</html>
