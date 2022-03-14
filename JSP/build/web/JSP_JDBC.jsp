<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP JDBC</title>
    </head>
    <body>
        <h1>JSP JDBC Tutorial</h1>
        
        <%@page import="java.sql.Connection, java.sql.DriverManager, java.sql.Statement, java.sql.ResultSet" %>
        <%
            String url ="jdbc:mysql://localhost:3306/java";
            String username="root";
            String pass="";

            //Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Get Connection
            Connection con =DriverManager.getConnection(url,username,pass);

            //Create Statement
            Statement stmt=con.createStatement();

            //Execute Query
            String query="SELECT * FROM student";
            ResultSet rs=stmt.executeQuery(query);
            
//            rs.next();
            %>
            
            <table>
                <tr>
                <td>Student id</td>
                <td>Name</td>
                <td>Major</td>
                </tr>
            <%
                while(rs.next()){
            %>
            <tr>
            <td><%=rs.getString(1)%> </td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            </tr>
             <%
                 }
             %>
            </table>

    </body>
</html>
