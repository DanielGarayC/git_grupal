package com.example.webapplication2.servlets;
import com.example.webapplication2.beans.Empleado;
import com.example.webapplication2.daos.empleadoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/agregarEmpleado")
public class AgregarEmpleadoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        request.getRequestDispatcher("agregarEmpleado.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idStr = request.getParameter("id");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");

        if (idStr != null && firstName != null && lastName != null) {
            try {
                int id = Integer.parseInt(idStr);
                Empleado empleado = new Empleado(id, firstName, lastName);
                empleadoDAO.agregarEmpleado(empleado);
                response.sendRedirect("listaEmpleados");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("error.jsp"); //
        }
    }
}
