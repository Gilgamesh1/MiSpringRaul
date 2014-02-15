<%-- 
    Document   : mtnCategoria
    Created on : 06/02/2014, 07:02:02 PM
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
        <form:form modelAttribute="categoria" action="insertar_Actualizar.html" method="POST">
        <table>
            <tr>
                <td colspan="2"><h1>Mantenimiento de Categoria</h1></td>
            </tr>
            <tr>
                <td>Id:</td><td><form:input path="id"/></td>
            </tr>
            <tr>
                <td>Descripcion:</td><td><form:input path="descripcion" /></td>
            </tr>
            <tr>
                <td colspan="2"><form:button value="submit" >Insertar</form:button></td>
            </tr>
        </table>
        </form:form>
    </body>
</html>
