<%-- 
    Document   : exitoBuscarEmpleado
    Created on : 14/04/2020, 04:33:22 PM
    Author     : stive
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DTO.Empleado"%>
<%@page import="Negocio.Nomina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
         <%
        //Nomina nomina = (Nomina)(request.getSession().getAttribute("empleado"));
        //request.getSession().setAttribute("nomina", nomina);
        //ArrayList<Empleado> empleado = (ArrayList) request.getSession().getAttribute("empleado");
        Empleado empleado = (Empleado) (request.getSession().getAttribute("empleado"));
    %>
    <p> Datos del empleado
        <%=empleado.toString()%>
        
    </p>
    </body>
</html>
