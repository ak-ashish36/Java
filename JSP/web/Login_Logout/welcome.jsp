<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");       //Prevent back button
            String name =(String)session.getAttribute("id");
            if(name==null){
                response.sendRedirect("login.jsp");
            }
            %>
            
            <h1>Welcome ${id}</h1>
            
            <form action="logout">
                <button type="submit">Logout</button>
            </form>
    </body>
</html>
