<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page errorPage="errorpage.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Handeling</title>
    </head>
    <body>
        <h1>Taglib Directives</h1>      
        <%!
            int x=20;
            int y=5;
            int num=x/y;
        %>
        <h3><%=num%></h3>
    </body>
</html>
<%
        response.sendRedirect("CustomTags.jsp");

%>