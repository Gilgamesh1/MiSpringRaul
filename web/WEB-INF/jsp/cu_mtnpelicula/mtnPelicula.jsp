<%-- 
    Document   : mtnPelicula
    Created on : 19/02/2014, 10:21:24 PM
    Author     : Orus
--%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form commandName="pelicula" action="guardarPelicula.html" method="POST">
    <table>
        <tr>
            <td><spring:message code="label.pelicula.categoria"/></td>
            <td>
                <!--form:select path="categoria" multiple="false">
                    form:option value="0" label="---- Seleccione ----"/>
                    form:options items="$_{pelicula.lstCategorias}" itemValue="id" itemLabel="Descripcion"/>
                /form:select${pelicula.lstCategorias}-->
                
                <form:select path="idCategoria" multiple="false">
                    <form:option value="0" label="---- Seleccione ----"/>
                    <c:forEach items="${pelicula.lstCategorias}" var="cate">
                        <c:choose>
                            <c:when test="${cate.id==categoria_id}">
                                <form:option value="${cate.id}" selected="true">${cate.descripcion}</form:option>
                            </c:when>
                            <c:otherwise>
                                <form:option value="${cate.id}">${cate.descripcion}</form:option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><spring:message code="label.pelicula.titulo"/></td>
            <td><form:hidden path="id"/><form:input path="titulo"/></td>
        </tr>
        <tr>
            <td><spring:message code="label.descripcion"/></td>
            <td><form:textarea path="descripcion" rows="6"/></td>
        </tr>
        <tr>
            <td><spring:message code="label.fecha"/></td>
            <td><form:input path="fecha"/></td>
        </tr>
        <tr>
            <td colspan="2"><form:button value="submit" ><spring:message code="label.boton.guardar"/></form:button></td>
        </tr>
    </table>
</form:form>