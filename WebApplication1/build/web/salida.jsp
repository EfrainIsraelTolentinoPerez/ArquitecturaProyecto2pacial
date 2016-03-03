<%-- 
    Document   : salida
    Created on : 3/03/2016, 01:30:17 AM
    Author     : BEER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gracias</title>
    </head>
    <body background="descargaaa.jpg"></body>
    <body>
        <h1>Gracias su informacion se ha enviado correctamente!</h1>
        <p>
            <%= request.getParameter("nombrecompleto")%>, Has enviado tu información exitosamente.
           
            </p>
            
            <ul>
                <% 
                    String[] CasillasSeleccionadas =
                            request.getParameterValues("proLeng");
                    if (CasillasSeleccionadas != null){
                        for(int i=0; i < CasillasSeleccionadas.length;
                                i++){
                            %>
                            
                            <li>
                                <%= CasillasSeleccionadas[i]%>
                            </li>>
                            <%}
                    }
                        %>
                        
                        
                    
            
    </body>
</html>
