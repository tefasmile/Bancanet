
<%@page import="modelo.Consultas"%>
<%@page import="modelo.usuarioGS"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/consultusuarios.css">
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
        <h1 align="center">Listado de usuarios</h1>
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="5" class="center">Mantenimiento de usuarios</th>
                <td>
                    <a href="usuarios.jsp" name="btncliente">
                        <img src="img/add.png" width="42"> 
                    </a>
                </td>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Documento</th>
                <th class="center">Nombre</th>
                <th class="center">Clave</th>
                <th class="center">Root</th>
                <th class="center">Edit</th>
                <th class="center">Delete</th>
            </tr>
            <%
                ArrayList<usuarioGS> listdat=new ArrayList<>(); 
                Consultas con=new Consultas();
                listdat=con.consultaUsuario();
                usuarioGS igs=new usuarioGS();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                
            
            %>
        <form action="ServletModificar">
        <tr>
            <td><input class="input" type="text" name="dc" value="<%=igs.getUsudoc()%>"></td>
            <td><input class="input" type="text" name="no" value="<%=igs.getUsunom()%>"></td>
            <td><input class="input" type="text" name="cl" value="<%=igs.getUsuclave()%>"></td>
            <td><input class="input" type="text" name="ro" value="<%=igs.getUsuroot()%>"></td>
           
            <td><input type="submit" name="btnedituser" value="Modificar"></td>
            <td><input type="submit" name="btndeleteuser" value="Eliminar"></td>
        </tr>
        </form>
        <%
            }
        %>    
        </table>
    </body>
</html>
