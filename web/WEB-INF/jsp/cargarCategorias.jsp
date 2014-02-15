<%-- 
    Document   : cargarCategorias
    Created on : 06/02/2014, 01:05:06 PM
    Author     : Orus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Categoria</title>
    </head>
    <body>
        <table>
            <tr>
                <td><h1>Lista de Categorias</h1></td>
            </tr>
            <tr>
                <td>
                    <a href="cargarMantenimientoCategoria.html?id=0">Insertar</a>
                </td>
            </tr>
            <tr>
                <td>
                    <table border="1">
                        <thead>
                            <tr>
                                <td>ID</td><td>CATEGORIA</td><td>ELIMINAR</td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lstCategorias}" var="categorias">
                                <tr>
                                    <td><a href="cargarMantenimientoCategoria.html?id=<c:out value="${categorias.id}"/>"><c:out value="${categorias.id}"/></a></td>
                                    <td><c:out value="${categorias.descripcion}"/></td>
                                    <td><a href="eliminarCategoria.html?id=<c:out value="${categorias.id}"/>">Eliminar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
