<%-- 
    BANCANET
--%>
<%@page import="modelo.Consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.clienteGS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/tabla.css">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Listado Clientes</title>
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
        <h1 align="center">Listado de clientes</h1>
        
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Mantenimiento de clientes</th>
                <th>
                    <a href="cliente.jsp">
                        <img src="img/add.png">
                    </a>
                </th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Documento</th>
                <th class="center">Nombre</th>
                <th class="center">Apellido</th>
                <th class="center">Telefono</th>
                <th class="center">Email</th>
                <th class="center">Tipo documento</th>
                <th class="center">Direccion</th>
                <th class="center">Fecha nacimiento</th>
            </tr>
            <%
                ArrayList<clienteGS> listdat=new ArrayList<>(); 
                Consultas con=new Consultas();
                listdat=con.consultaCliente();
                clienteGS igs=new clienteGS();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                
            
            %>
            
        <form action="ServletModificar">
        <tr>
            <td><input class="input" type="text" name="nd" value="<%=igs.getNumdoc()%> "></th> <br></td>
            <td><input class="input" type="text" name="no" value="<%=igs.getNombre()%>"></th> <br></td>
            <td><input class="input" type="text" name="ap" value="<%=igs.getApellido()%>"></th> <br></td>
            <td><input class="input" type="text" name="te" value="<%=igs.getTelefono()%>"></th><br></td>
            <td><input class="input" type="text" name="co" value="<%=igs.getCorreo()%>"></th> <br></td>
            <td><input class="input" type="text" name="td" value="<%=igs.getTipodoc()%>"></th> <br></td>
            <td><input class="input" type="text" name="di" value="<%=igs.getDireccion()%>"></th> <br></td>
            <td><input class="input" type="text" name="f" value="<%=igs.getFecha()%>"></th> <br></td>
            
            <td><input type="submit" name="btnmodificar" value="Modificar"></td>
            <td><input type="submit" name="btneliminar" value="Eliminar"></td> 
        </tr>
        </form>
        <%
            }
        %>    
        </table>
        
    </body>
</html>
