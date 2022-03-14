<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Directive Tags-->
<!--Page directives-->
<%@page import="java.util.Random,java.util.ArrayList" %>
<%--<%@page extends="" %>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Tags</title>
    </head>
    <body>
        <h1>Jsp Tags Tutorial</h1>
        <!--Include directives-->
        <%@include file="header.jsp" %>
       
        <!--Declarative Tag-->
        <%!
           int x= 50;
           int y=30;
           String name="Ashish";
           public int doSum(){
                return x+y;
           }
         %>
         
         <!--Scriptlet Tag-->
         <%
            out.println(name);
            out.println("<h3>Sum is:"+doSum()+"</h3>");
            
            Random r= new Random();
            int rnum=r.nextInt(10);
         %>
         
         <!--Expressive Tags-->
         <h1>Random number is:<%=rnum%></h1>
         <h3 style="color: red;font-size: 30px">Sum= <%=doSum()%> </h3>
         <h3><%=name%></h3>
         
         <h4>Jsp Implicit objects</h4>
         <h4>out,request,response,config,applicaion,session,page,pageContext,exception</h4>
        
    </body>
</html>


