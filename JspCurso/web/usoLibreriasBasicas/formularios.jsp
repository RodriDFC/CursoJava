<%--
  Created by IntelliJ IDEA.
  User: fuentes
  Date: 22/09/2019
  Time: 05:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="registro.jsp">
        <label for="nom">nombre</label>
        <input id="nom" type="text" name="nombre" required>
        <label for="ap">apellido</label>
        <input id="ap" type="text" name="apellido" required>
        <button type="submit">Aceptar</button>
    </form>
</body>
</html>
