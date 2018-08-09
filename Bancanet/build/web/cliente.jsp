<%-- 
    BANCANET
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/usuarios.css">
        <link rel="stylesheet" href="css/tabla.css">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="header">
            <div class="figure">
                <img src="img/logobank.png" alt="">
            </div>
            <ul class="menu">
                <li class="mitem">
                    <a class="indice" href="cliente.jsp">Clientes</a>
                </li>
                <li class="mitem">
                    <a href="creditocliente.jsp">Credito-Cliente</a>
                </li>
                <li class="mitem">
                    <a href="lineacredito.jsp">Linea-Credito</a>
                </li>
                <li class="mitem">
                    <a href="usuarios.jsp">Usuario</a>
                </li>
            </ul>
        </div>
        <h1></h1>
        <!--formulario con estilos-->
        <div class="form-style-8">
            <h2>Registro clientes</h2>
            <form action="ServletGeneral">
                <input type="text" name="nd" placeholder="Numero documento" />
                <input type="text" name="no" placeholder="Nombre" />
                <input type="text" name="ap" placeholder="Apellido" />
                <input type="text" name="te" placeholder="Telefono" />
                <input type="text" name="co" placeholder="Email" />
                <input type="text" name="td" placeholder="Tipo documento" />
                <input type="text" name="di" placeholder="Direccion" />
                <input type="text" name="f" placeholder="Fecha de nacimiento" />
                <a href="">
                    <input type="submit" name="btncliente" value="Grabar Cliente">
                </a>
            </form>
        </div>
    </body>
</html>
