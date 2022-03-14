<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="/WEB-INF/newtag_library.tld" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom Tags</title>
    </head>
    <body>
        <h1>Custom tag Example</h1>
        <t:first_tag></t:first_tag>
        <hr>
        <t:table_tag number="2" color="red" ></t:table_tag>
        <br>
        <t:table_tag number="5" color="blue" ></t:table_tag>

       
    </body>
</html>
