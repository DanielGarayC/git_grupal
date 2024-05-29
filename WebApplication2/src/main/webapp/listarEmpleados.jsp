
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Empleado</title>
    <style>
        .row-1 {
            font-weight: bold;
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
    <h1>Lista de Empleados</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Regresar</a></li>
            <li><a href="agregarEmpleado.jsp">Agregar nuevo empleado</a></li>
        </ul>
    </nav>
    <nav>
        <table>
            <tr class="row-1">
                <td>#</td>
                <td>first Name</td>
                <td>last Name</td>
                <td>Email</td>
                <td>Phone</td>
                <td>Hire Date</td>
                <td>Job ID</td>
                <td>Salary</td>
                <td>Commission</td>
                <td>Manager ID</td>
                <td>Department ID</td>
            </tr>
            <tr>
                <td>1</td>
                <td>Carlos</td>
                <td>Pérez</td>
                <td>carlos@gmail.com</td>
                <td>987654321</td>
                <td>12/12/2018</td>
                <td>1</td>
                <td>1200</td>
                <td>89</td>
                <td>8</td>
                <td>7</td>
                <td><a href="editarEmpleado.jsp">Editar</a></td>
            </tr>
        </table>
    </nav>
</body>
</html>
