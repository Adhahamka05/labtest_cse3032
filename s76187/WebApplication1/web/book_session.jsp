<%-- 
    Document   : book_session
    Created on : 16 Jun 2026, 2:42:36 PM
    Author     : MP2-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Session</title>
    </head>
    <body>
    <h2>Book a Driving Session</h2>
    <form method="POST" action="BookSessionServlet">
        Name: <input type="text" name="student_name"><br>
        Branch: <input type="text" name="branch_location"><br>
        Lesson Type: 
        <select name="lesson_type">
            <option>Manual Car</option>
            <option>Automatic Car</option>
            <option>Motorcycle</option>
        </select><br>
        <input type="submit" value="Book Session">
    </form>
</body>
</html>

