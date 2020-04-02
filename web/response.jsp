<%-- 
    Document   : response
    Created on : 16/03/2020, 03:41:58 PM
    Author     : manuel martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATOS</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />

        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="year"/>
        <jsp:setProperty name="mybean" property="semestre"/>
        <jsp:setProperty name="mybean" property="fecha"/>
        
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />,
            <br>
            La edad es: <jsp:getProperty name="mybean" property="resultado2" /> años
            <br>
            El semestre es: <jsp:getProperty name="mybean" property="resultado1" />
        </h1>
    </body>
</html>
