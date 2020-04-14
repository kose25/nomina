<%-- 
    Document   : registrarEmpleado
    Created on : 14/04/2020, 07:32:47 AM
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
        <h1>Registrar Empleado</h1>
        <form name="registrar" method="POST">
            <input type="number" name="codigo" value="" placeholder="ingrese codigo" required>
            <br>
            <input type="number" name="cedula" placeholder="ingrese cedula" min="1" required>
            <br>
            <label>Fecha Nacimiento</label>
            <input type="date" name="fechaBorn" required>
            <br>
            <label>Fecha ingreso</label>
            <input type="date" name="fechaIngreso" required>
            <br>
            <label>Fecha Nacimiento</label>
            <input type="date" name="fechaRetiro">
            <br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
