
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/usuarios.css">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Usuarios Bancanet</title>
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
            <form action="ServletGeneral">
                <td><input class="input" type="text" name="no" value="<%%>"></td>
            </form>
        </div>
        <!--formulario con estilos-->
        <div class="form-style-8">
            <h2>Registro de usuario</h2>
            <form action="ServletGeneral">
                <input type="text" name="dc" placeholder="Numero documento" />
                <input type="text" name="no" placeholder="Nombre" />
                <input type="text" name="cl" placeholder="Clave" />
                <input type="text" name="ro" placeholder="Root" />
                <a href="">
                  <input type="submit" name="btnusuario" value="Grabar Usuario">
                </a>
            </form>
        </div>
    </body>
</html>
