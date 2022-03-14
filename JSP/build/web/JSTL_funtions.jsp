<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Funtions</title>
    </head>
    <body>
        <h1>JSTL Funtions Tags Tutorial</h1>
        
        <c:set var="name" value="ashish gupta"></c:set>
        <h3><c:out value="${name}"></c:out></h3>
        
        <h2>Lenght of name is:<c:out value="${fn:length(name)}"></c:out></h2>
        <c:out value="${fn:toUpperCase(name)}"></c:out>
        

    </body>
</html>
