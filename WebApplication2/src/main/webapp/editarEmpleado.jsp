<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 29/05/2024
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar Empleado</title>
    <style>
        .form-group label {
            width: 100px;
            text-align: right;
            margin-right: 20px;
        }
        nav ul {
            list-style: none;
            padding: 0;
        }
        a{
            font-weight: bold;
        }

    </style>
</head>
<body>
    <h2>Editar Empleado</h2>
    <nav>
        <ul>
            <li><a href="listarEmpleados.jsp">Regresar</a></li>
            <li><a href="agregarEmpleado.jsp">Borrar</a></li>
        </ul>
    </nav>
    <form action="AgregarEmpleadoServlet" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br><br>
        <label for="first_name">Nombre:</label>
        <input type="text" id="first_name" name="first_name"><br><br>
        <label for="last_name">Apellido:</label>
        <input type="text" id="last_name" name="last_name"><br><br>
        <input type="submit" value="Agregar Empleado">
    </form>
</body>
</html>
