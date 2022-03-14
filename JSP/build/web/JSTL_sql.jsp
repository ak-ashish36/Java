<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL SqL</title>
    </head>
    <body>
        <h1>JSTL Sql Tags Tut</h1>
        
        <sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/java" user="root" password="" var="myds"></sql:setDataSource> 
        <sql:query dataSource="${myds}" var="rs">SELECT * FROM student;</sql:query>
        
        <table>
            <tr>
                <td>Student id</td>
                <td>Name</td>
                <td>Major</td>
            </tr>
        <c:forEach var="row" items="${rs.rows}">
            <tr>
                <td><c:out value="${row.student_id}"></c:out></td>
                <td><c:out value="${row.name}"></c:out></td>
                <td><c:out value="${row.major}"></c:out></td>               
            </tr>
        </c:forEach>  
        </table>
        
    </body>
</html>
