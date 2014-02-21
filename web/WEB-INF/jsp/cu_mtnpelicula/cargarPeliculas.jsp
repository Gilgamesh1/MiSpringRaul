<%-- 
    Document   : cargarPelicula
    Created on : 19/02/2014, 10:20:59 PM
    Author     : Orus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<table>
    <tr>
        <td><h1>Lista de Peliculas</h1></td>
    </tr>
    <tr>
        <td>
            <a href="cargarMantenimientoPelicula.html?id=0"><spring:message code="label.pelicula.crear"/></a>
        </td>
    </tr>
    <tr>
        <td>
            <table border="1">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>CATEGORIA</td>
                        <td>TITULO</td>
                        <td>DESCRIPCION</td>
                        <td>FECHA</td>
                        <td>ELIMINAR</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${lstPeliculas}" var="peliculas">
                        <tr>
                            <td>
                                <a href="<c:url value="cargarMantenimientoPelicula.html"><c:param name="id" value="${peliculas.id}"/></c:url>"><c:out value="${peliculas.id}"/></a>
                            </td>
                            <!--td><c_out value="$_{peliculas.categoria.descripcion}"/></td-->
                            <td><c:out value="${peliculas.desCategoria}"/></td>
                            <td><c:out value="${peliculas.titulo}"/></td>
                            <td><c:out value="${peliculas.descripcion}"/></td>
                            <!--td><fmt_formatDate value="$_{peliculas.fecha}" pattern="dd-MM-yyyy"/></td-->
                            <td><c:out value="${peliculas.fecha}"/></td>
                            <td>
                                <a href="<c:url value="eliminarPelicula.html"><c:param name="id" value="${peliculas.id}"/></c:url>"/>Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </td>
    </tr>
</table>