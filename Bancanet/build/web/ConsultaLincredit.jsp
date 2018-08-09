
<%@page import="modelo.Consultas"%>
<%@page import="modelo.lincreditGS"%>
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
        <h1 align="center">Listado de lineas de credito</h1>
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="5" class="center">Mantenimiento linea de creditos</th>
                <td>
                    <a href="lineacredito.jsp" name="btncliente">
                        <img src="img/add.png" width="42"> 
                    </a>
                </td>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Codigo de linea</th>
                <th class="center">Nombre de linea</th>
                <th class="center">Valor de monto</th>
            </tr>
            <%
                ArrayList<lincreditGS> listdat=new ArrayList<>(); 
                Consultas con=new Consultas();
                listdat=con.consultaLinCreditCliente();
                lincreditGS igs=new lincreditGS();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
            %>
        <form action="ServletModificar">
            <tr>
                <td><input class="input" type="text" name="cl" value="<%=igs.getCodlinea()%>"></td>
                <td><input class="input" type="text" name="nl" value="<%=igs.getNomlinea()%>"></td>
                <td><input class="input" type="text" name="ml" value="<%=igs.getMontlinea()%>"></td>
                
                <td><input type="submit" name="btneditlinea" value="Modificar"></td>
                <td><input type="submit" name="btndeletelinea" value="Eliminar"></td>
            </tr>
        </form>
        <%
            }
        %>
    </body>
</html>
