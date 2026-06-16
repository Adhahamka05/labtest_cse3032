<%-- 
    Document   : index
    Created on : 16 Jun 2026, 2:59:57 PM
    Author     : MP2-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.html" %>
        <h2>Welcome to DriveSmart</h2>
        <a href="book_session.jsp">Book a Session</a><br>
        <a href="ScheduleServlet">View Schedule</a>
        <%@ include file="footer.html" %>
    </body>
</html>
