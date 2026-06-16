<%-- 
    Document   : schedule
    Created on : 16 Jun 2026, 2:49:34 PM
    Author     : MP2-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Schedule</title>
    </head>
    <html>
        <body>
            <h2>Centralized Schedule</h2>
            <table border="1">
                <tr>
                    <th>ID</th><th>Name</th><th>Branch</th><th>Lesson</th><th>Status</th>
                </tr>
                <c:forEach var="s" items="${sessionList}">
                    <tr>
                        <td>${s.session_id}</td>
                        <td>${s.student_name}</td>
                        <td>${s.branch_location}</td>
                        <td>${s.lesson_type}</td>
                        <td>${s.status}</td>
                    </tr>
                </c:forEach>

            </table>
        </body>
    </html>

