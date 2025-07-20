package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerpage")
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //String state = request.getParameter("state");

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("JDBC Driver Loaded Successfully!");
            // Create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject", "root", "Admin");

            // Insert query
            String query = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
           // ps.setString(4, state);

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<h2>Registration Successful!</h2>");
                response.sendRedirect("login.html");
            } else {
                out.println("<h2>Registration Failed!</h2>");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        }
    }
}
