<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--To use JSTL tags in your Project you must include JSTL Library-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core Tags Tutorial</h1>
        
        <c:set var="i" value="20" scope="application"></c:set>
        <!--out tag alternative to expression tags  < %= %> -->
        <c:out value="${i}"></c:out>
        
        <%--<c:remove var="i"></c:remove>--%>
        <h3><c:out value="${i}">Default Print</c:out></h3>
        
        <!--If : Test Condition : True=> Print-->
        <c:if test="${i>18}">
            <h2>You are Adult!!!</h2>
        </c:if>
        
        <!--Choose :when(if), when(else if), otherwise(else)-->
        <c:choose>
            <c:when test="${i>0}">
                <h2>case 1: Number is Positive</h2>
            </c:when>
                
            <c:when test="${i<0}">
                <h2>case 2: Number is Negative</h2>
            </c:when>
                
            <c:otherwise>
                <h2>Default Case: Number is 0</h2>
            </c:otherwise>            
        </c:choose>
         
        <!--For each loop-->      
        <c:forEach var="i" begin="0" end="10">
            <h4>Value of i is <c:out value="${i}"></c:out> </h4>    
        </c:forEach>
            
        <!--Redirect-->   
        <%--<c:redirect url="www.google.com"></c:redirect>--%> 
        
        <c:url var="myurl" value="facebook.com">
            <c:param name="q" value="ashish ka account"></c:param>
        </c:url>
        
        <h1><c:out value="${myurl}"></c:out></h1>              
    </body>
</html>
