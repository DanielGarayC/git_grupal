package com.example.webapplication2.daos;
import com.example.webapplication2.beans.Empleado;

import java.sql.*;
import java.util.ArrayList;
public class empleadoDAO {
    public static ArrayList<Empleado> obtenerListaEmpleados(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            String user = "root";
            String pass = "rootroot";
            String url = "jdbc:mysql://127.0.0.1:3306/hr";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("first_name");
                String apellido =rs.getString("last_name");
                Empleado empleado = new Empleado(id,nombre,apellido);


                listaEmpleados.add(empleado);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return listaEmpleados;

    }
    public static void agregarEmpleado(Empleado empleado) throws SQLException {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            String user = "root";
            String pass = "rootroot";
            String url = "jdbc:mysql://127.0.0.1:3306/hr";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO empleados (id, nombre, apellido) VALUES (?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, empleado.getId());
            statement.setString(2, empleado.getFirst_name());
            statement.setString(3, empleado.getLast_name());
            statement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void editarEmpleado(Empleado empleado) throws SQLException {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            String user = "root";
            String pass = "rootroot";
            String url = "jdbc:mysql://127.0.0.1:3306/hr";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE empleados SET nombre=?, puesto=? WHERE id=?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, empleado.getId());
            statement.setString(2, empleado.getFirst_name());
            statement.setString(3, empleado.getLast_name());
            statement.executeUpdate();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }finally{
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
