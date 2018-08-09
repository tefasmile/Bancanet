package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Consultas;
import java.util.ArrayList;
import modelo.clienteGS;

public final class ConsultaCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tabla.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <title>Listado Clientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"figure\">\n");
      out.write("                <img src=\"img/logobank.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a class=\"indice\" href=\"cliente.jsp\">Clientes</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a href=\"creditocliente.jsp\">Credito-Cliente</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a href=\"lineacredito.jsp\">Linea-Credito</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a class=\"indice\" href=\"usuarios.jsp\">Usuario</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <h1 align=\"center\">Listado de clientes</h1>\n");
      out.write("        \n");
      out.write("        <table align=\"center\" border=\"1\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Mantenimiento de clientes</th>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"cliente.jsp\">\n");
      out.write("                        <img src=\"img/add.png\">\n");
      out.write("                    </a>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Documento</th>\n");
      out.write("                <th class=\"center\">Nombre</th>\n");
      out.write("                <th class=\"center\">Apellido</th>\n");
      out.write("                <th class=\"center\">Telefono</th>\n");
      out.write("                <th class=\"center\">Email</th>\n");
      out.write("                <th class=\"center\">Tipo documento</th>\n");
      out.write("                <th class=\"center\">Direccion</th>\n");
      out.write("                <th class=\"center\">Fecha nacimiento</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ArrayList<clienteGS> listdat=new ArrayList<>(); 
                Consultas con=new Consultas();
                listdat=con.consultaCliente();
                clienteGS igs=new clienteGS();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                
            
            
      out.write("\n");
      out.write("            \n");
      out.write("        <form action=\"ServletModificar\">\n");
      out.write("        <tr>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"nd\" value=\"");
      out.print(igs.getNumdoc());
      out.write(" \"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"no\" value=\"");
      out.print(igs.getNombre());
      out.write("\"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"ap\" value=\"");
      out.print(igs.getApellido());
      out.write("\"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"te\" value=\"");
      out.print(igs.getTelefono());
      out.write("\"></th><br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"co\" value=\"");
      out.print(igs.getCorreo());
      out.write("\"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"td\" value=\"");
      out.print(igs.getTipodoc());
      out.write("\"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"di\" value=\"");
      out.print(igs.getDireccion());
      out.write("\"></th> <br></td>\n");
      out.write("            <td><input class=\"input\" type=\"text\" name=\"f\" value=\"");
      out.print(igs.getFecha());
      out.write("\"></th> <br></td>\n");
      out.write("            \n");
      out.write("            <td><input type=\"submit\" name=\"btnmodificar\" value=\"Modificar\"></td>\n");
      out.write("            <td><input type=\"submit\" name=\"btneliminar\" value=\"Eliminar\"></td> \n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("        ");

            }
        
      out.write("    \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
