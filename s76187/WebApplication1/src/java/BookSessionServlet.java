/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MP2-4
 */
@WebServlet("/BookSessionServlet")

public class BookSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String student = request.getParameter("student_name");
        String branch = request.getParameter("branch_location");
        String lesson = request.getParameter("lesson_type");

        SessionBean session = new SessionBean();
        session.setStudent_name(student);
        session.setBranch_location(branch);
        session.setLesson_type(lesson);
        session.setStatus("Booked");

        new SessionDAO().bookSession(session);

        response.sendRedirect("ScheduleServlet");
    }
}

