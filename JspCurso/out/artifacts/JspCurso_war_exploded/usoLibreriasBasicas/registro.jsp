<%--
  Created by IntelliJ IDEA.
  User: fuentes
  Date: 22/09/2019
  Time: 05:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>usuario</h1>
    nombre: <%= request.getParameter("nombre")%> <%= request.getParameter("apellido") %>
    <br>
    nombre: <% out.println(request.getParameter("nombre")+" "+request.getParameter("apellido") );%>
</body>
</html>
