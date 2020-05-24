<%--
  Created by IntelliJ IDEA.
  User: fuentes
  Date: 15/09/2019
  Time: 07:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>primeros pasos</h1>
<h3>hola mundo <%=new java.util.Date()%></h3>
<h1>expresiones jsp</h1>
<%=new String("texto en minusculas").toUpperCase() %>
<h1>expresiones matematicas</h1>
<%=5+7-8*5+6-2%>
<h1>booleanos</h1>
<%= 10<41 %>
<h1>scriplet</h1>
<%
    for(int i=0;i<10;i++){
        out.println("ciclo for: "+i);
    }
    if(false){ %>
    <h4>if</h4>
    <%}else{%>
       <h4>else</h4>
   <% }%>
<h1>declaraciones en jsp</h1>
<%!
    private int res;
    public int suma(int a,int b){
        res=a+b;
        return res;
    }
    public int multiplica(int a,int b){
        res=a*b;
        return res;
    }
%>
<h1>suma de 7+5 es:</h1>
<%=suma(7,5)%>

<h1>la multiplicacion de 4*9 es:</h1>
<%= multiplica(4,9)%>
</body>
</html>
