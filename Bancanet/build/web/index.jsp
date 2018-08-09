<!--Loguin de bancanet-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login del usuario</title>
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="css/normalize.css">
    </head>
    <body>
        <div class="header">
            <div class="figure">
                <img src="img/logobank.png" alt="">
            </div>
        </div>
        <div class="contenedor">
            <div class="fondologin">
                <img class="fondologin" src="img/background.jpg" alt="">
                <div class="formulario">

                    <form class="formulario formweb" action="ServletIngreso">
                        <div class="center">
                            <img src="img/logodos.png" alt="" width="250px">
                            <div class="border-bottom"></div>
                        </div>
                        <div class="center">
                            <input class="inputlabel" name="user" placeholder="Digite su nombre usuario" type="text">
                            <br>
                            <br> 
                            <input class="inputlabel" name="pass" placeholder="Digite su contraseña" type="password">
                            <br>
                            <br> 
                            
                            <input class="send" type="submit" name="btnIngresar" value="Enviar">
                           
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
