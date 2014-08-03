<%-- 
    Document   : index
    Created on : 05/02/2014, 11:13:01 PM
    Author     : Orus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            @import url("<c:url value="/recursos/dojo/dojo/resources/dojo.css"/>");
            @import url("<c:url value="/recursos/dojo/dijit/themes/claro/claro.css"/>");
        </style>
        <script language="javascript" type="text/javascript" src="<c:url value="/recursos/dojo/dojo/dojo.js"/>" djConfig="parseOnLoad: true,isDebug: true,foo: 'bar'"></script>
        <!--script language="javascript" type="text/javascript" src="<curl value="/recursos/dojo/dijit/Dialog.js"/>" djConfig="parseOnLoad: true"></script-->
        <script language="javascript">
            /*dojoConfig = {
             isDebug: true,
             parseOnLoad: true,
             foo: "bar"
             };*/

            require(["dojo/parser", "dojo/request/xhr", "dojo/dom", "dojo/on", "dojo/domReady!",
                "dijit/Dialog",
                "dijit/form/Form",
                "dijit/form/Button",
                "dijit/form/TextBox",
                "dijit/form/ValidationTextBox"]);
            function validar() {
                var dojoCarga = dojo.byId("idDiagCarga");
                var dijitCarga = dijit.byId("idDiagCarga");
                console.log("dojoCarga: " + dojoCarga);
                console.log("dijitCarga: " + dijitCarga);
                dijitCarga.show();
            }
        </script>
    </head>
    <body class="claro">
        <div data-dojo-type="dijit/form/Form" id="myForm" data-dojo-id="myForm"
             encType="multipart/form-data" action="" method="" style="position: absolute; width: 300px; height: 200px;
             left: 50%; top: 50%;margin-top: -100px; margin-left: -150px; border:solid 3px silver;">
            <table style="width: 100%; height: 100%; border: 1px solid #9f9f9f;" cellspacing="10">
                <tr>
                    <td>
                        <label for="name">Usuario:</label>
                    </td>
                    <td>
                        <input type="text" id="name" name="name" required="true" data-dojo-type="dijit/form/ValidationTextBox"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="password">Contraseña:</label>
                    </td>
                    <td>
                        <input type="text" id="password" name="password" required="true" data-dojo-type="dijit/form/ValidationTextBox" data-dojo-props="type:'password'"/>
                        <!--div data-dojo-type="dijit/form/TextBox" data-dojo-props="type:'password'" name="password" value=""></div-->
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                <center><button id="button2" data-dojo-type="dijit/form/Button"
                                type="button" onclick="validar();">Ingresar</button></center>
                </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <a href="listarCategorias.html">Cargar Lista de Categorias</a><br>
                        <a href="listarPeliculas.html">Cargar Lista de Peliculas</a>
                        <!--button onclick="myDialog.show();">show</button-->
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button data-dojo-type="dijit/form/Button" type="button" data-dojo-props="onClick:function(){diagCarga.show();}">
                            Show me!
                        </button>
                    </td>
                </tr>
            </table>
        </div>
        <div id="idDiagCarga" data-dojo-type="dijit/Dialog" data-dojo-id="diagCarga" title="Cargando ...">
            <table  class="dijitDialogPaneContentArea">
                <tr>
                    <td style="height: 61px; width: 163px;">
                <center><img src="<c:url value="recursos/imagenes/carga_4.gif"/>" alt="carga_1"/></center>
                </td>
                </tr>
            </table>
            <div class="dijitDialogPaneActionBar">
                <button data-dojo-type="dijit/form/Button" type="button" data-dojo-props="onClick:function(){diagCarga.hide();}"
                        id="cancel1">Cancel</button>
            </div>
        </div>

        <!--div data-dojo-type="dijit/form/Form" id="myForm" data-dojo-id="myForm"
             encType="multipart/form-data" action="" method="">
            <script type="dojo/on" data-dojo-event="reset">
                return confirm('Press OK to reset widget values');
            </script>

            <script type="dojo/on" data-dojo-event="submit">
                if(this.validate()){
                return confirm('Form is valid, press OK to submit');
                }else{
                alert('Form contains invalid data.  Please correct first');
                return false;
                }
                return true;
            </script>

            <table style="border: 1px solid #9f9f9f;" cellspacing="10">
                <tr>
                    <td>
                        <label for="name">Name:</label>
                    </td>
                    <td>
                        <input type="text" id="name" name="name" required="true" data-dojo-type="dijit/form/ValidationTextBox"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="dob">Date of birth:</label>
                    </td>
                    <td>
                        <input type="text" id="dob" name="dob" data-dojo-type="dijit/form/DateTextBox"/>
                    </td>
                </tr>
            </table>

            <button data-dojo-type="dijit/form/Button" type="button" onClick="console.log(myForm.getValues())">Get Values from form!</button>
            <button data-dojo-type="dijit/form/Button" type="submit" name="submitButton" value="Submit">Submit</button>
            <button data-dojo-type="dijit/form/Button" type="reset">Reset</button>
        </div-->




        <!--div data-dojo-type="dijit/layout/ContentPane" style="position: absolute; width: 300px; height: 200px;
             left: 50%; top: 50%;margin-top: -100px; margin-left: -150px; border:solid 3px silver;">
            .centrar {
            background-color: #FF9;
            overflow: hidden;
            position: absolute;
            height: 200px;
            width: 300px;
            left: 50%;
            top: 50%;
            margin-top: -100px;
            margin-left: -150px;
            }

            <h1>Hello World!</h1>
            <a href="listarCategorias.html">Cargar Lista de Categorias</a>
            <a href="listarPeliculas.html">Cargar Lista de Peliculas</a>
        </div-->




        <!--div data-dojo-type="dijit/layout/BorderContainer"
             style="width: 1347px; height: 1000px; border:solid 3px silver;">
            <div data-dojo-type="dijit/layout/ContentPane" data-dojo-props="region:'top'" style="width: 1000px; height: 79px;">
                Top pane
                <h1 id="greeting">Hello</h1>
                <button id="button1" type="button">Button1</button>
                <button id="button2" data-dojo-type="dijit/form/Button" type="button">Button2</button>
                <button id="button3" data-dojo-type="dijit/form/Button" type="button">
                    <div>Button4</div>
                    <script type="dojo/on" data-dojo-event="click">
                        console.log("I was clicked");
                    </script>
                </button>
            </div>
            <div data-dojo-type="dijit/layout/AccordionContainer" data-dojo-props="region:'leading'">
                <div data-dojo-type="dijit/layout/AccordionPane" title="pane #1">accordion pane #1</div>
                <div data-dojo-type="dijit/layout/AccordionPane" title="pane #2">accordion pane #2</div>
                <div data-dojo-type="dijit/layout/AccordionPane" title="pane #3">accordion pane #3</div>
            </div>
            <div data-dojo-type="dijit/layout/ContentPane" extractContent="false" preventCache="false" preload="false" refreshOnShow="false" region="right" splitter="true" maxSize="Infinity" style="width: 50px;" doLayout="false">right</div>
            <div data-dojo-type="dijit/layout/ContentPane" extractContent="false" preventCache="false" preload="false" refreshOnShow="false" region="center" splitter="false" maxSize="Infinity" doLayout="false"></div>
            <div data-dojo-type="dijit/layout/ContentPane" extractContent="false" preventCache="false" preload="false" refreshOnShow="false" region="bottom" splitter="true" maxSize="Infinity" style="height: 50px;" doLayout="false">bottom</div>
        </div-->
    </body>
</html>
