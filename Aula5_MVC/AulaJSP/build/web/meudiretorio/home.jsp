<%-- 
    Document   : home
    Created on : 06/09/2016, 21:19:57
    Author     : tiago.bscarton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <% 
            String visitante = request.getParameter("nome");
            if (visitante == null || visitante.isEmpty()) {
                visitante = "visitante";
            }        
        %>
        Olá, <%= visitante %>
        
    </body>
</html>
