
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Empleado</title>
    <style>
        .form-group label {
            width: 100px;
            text-align: right;
            margin-right: 20px;
        }
        a{
            font-weight: bold;
        }
        nav ul {
            list-style: none;
            padding: 0;
        }
    </style>
</head>
<body>
<h2>Agregar Empleado</h2>
    <nav>
        <ul>
            <li><a href="listarEmpleados.jsp">Regresar</a></li>
        </ul>
    </nav>
<form action="agregarEmpleado" method="post" >
    <div class="form-group">
    <label for="id">ID:</label>
    <input type="text" id="id" name="id"><br><br>
    </div>
    <div class="form-group">
    <label for="first_name">Nombre:</label>
    <input type="text" id="first_name" name="first_name"><br><br>
    </div>
    <div class="form-group">
    <label for="last_name">Apellido:</label>
    <input type="text" id="last_name" name="last_name"><br><br>
    </div>
    <input type="submit" value="Agregar Empleado">
</form>
</body>
</html>
