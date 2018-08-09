package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Consultas;
import modelo.lincreditGS;
import java.util.ArrayList;

public final class ConsultaLincredit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/consultusuarios.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("                    <a href=\"modelx.html\">Credito-Cliente</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a class=\"indice\" href=\"lineacredito.jsp\">Linea-Credito</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mitem\">\n");
      out.write("                    <a class=\"indice\" href=\"usuarios.jsp\">Usuarios</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <h1 align=\"center\">Listado de lineas de credito</h1>\n");
      out.write("        <table align=\"center\" border=\"1\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"5\" class=\"center\">Mantenimiento linea de creditos</th>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"lineacredito.jsp\" name=\"btncliente\">\n");
      out.write("                        <img src=\"img/add.png\" width=\"42\"> \n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Codigo de linea</th>\n");
      out.write("                <th class=\"center\">Nombre de linea</th>\n");
      out.write("                <th class=\"center\">Valor de monto</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ArrayList<lincreditGS> listdat=new ArrayList<>(); 
                Consultas con=new Consultas();
                listdat=con.consultaLinCreditCliente();
                lincreditGS igs=new lincreditGS();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
            
      out.write("\n");
      out.write("        <form action=\"ServletModificar\">\n");
      out.write("            <tr>\n");
      out.write("                <td><input class=\"input\" type=\"text\" name=\"cl\" value=\"");
      out.print(igs.getCodlinea());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"input\" type=\"text\" name=\"nl\" value=\"");
      out.print(igs.getNomlinea());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"input\" type=\"text\" name=\"ml\" value=\"");
      out.print(igs.getMontlinea());
      out.write("\"></td>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" name=\"btneditlinea\" value=\"Modificar\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"btndeletelinea\" value=\"Eliminar\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </form>\n");
      out.write("        ");

            }
        
      out.write("\n");
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
