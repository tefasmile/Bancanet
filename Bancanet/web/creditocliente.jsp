

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/usuarios.css">
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
        <!--formulario con estilos-->
        <div class="form-style-8">
            <h2>Registro de credito cliente</h2>
            <form action="ServletGeneral">
                <input type="text" name="cc" placeholder="Credito cliente documento"/>
                <input type="text" name="cd" placeholder="Credito codigo linea" />
                <input type="text" name="cf" placeholder="Credito fecha" />
                <input type="text" name="cm" placeholder="Credito valor de monto" />
                <a href="">
                  <input type="submit" name="btncredito" value="Grabar linea credito">
                </a>
            </form>
        </div>
    </body>
</html>
