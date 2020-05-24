<%--
  Created by IntelliJ IDEA.
  User: fuentes
  Date: 22/09/2019
  Time: 05:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>uso Request</h1>
    <p>navegador: <%= request.getHeader("USER-AGENT")%></p>
    <br>
    <p>idioma: <%= request.getLocale()%></p>
</body>
</html>
