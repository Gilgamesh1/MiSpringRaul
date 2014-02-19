<%-- 
    Document   : mtnCategoria
    Created on : 06/02/2014, 07:02:02 PM
    Author     : Orus
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="categoria" action="insertar_Actualizar.html" method="POST">
    <table>
        <tr>
            <td colspan="2"><h1>Mantenimiento de Categoria</h1></td>
        </tr>
        <tr>
            <td><spring:message code="label.categoria.id"/></td><td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><spring:message code="label.categoria.descripcion"/></td><td><form:input path="descripcion" /></td>
        </tr>
        <tr>
            <td colspan="2"><form:button value="submit" ><spring:message code="label.boton.guardar"/></form:button></td>
        </tr>
    </table>
</form:form>