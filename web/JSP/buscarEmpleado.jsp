<%-- 
    Document   : buscarEmpleado
    Created on : 14/04/2020, 07:33:03 AM
    Author     : kose_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar empleado</h1>
        <br>
        <form name="buscar" method="POST" action="../buscarEmpleado.do">
            <input type="number" placeholder="ingrese codigo" min="1" max="99999" required name="codigo">
            <input type="submit" value="Buscar" >
        </form>
    </body>
</html>
