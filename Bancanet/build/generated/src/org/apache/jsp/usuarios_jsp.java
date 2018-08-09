package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/usuarios.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <title>Usuarios Bancanet</title>\n");
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
      out.write("                    <a href=\"usuarios.jsp\">Usuario</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <form action=\"ServletGeneral\">\n");
      out.write("                <td><input class=\"input\" type=\"text\" name=\"no\" value=\"");

      out.write("\"></td>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!--formulario con estilos-->\n");
      out.write("        <div class=\"form-style-8\">\n");
      out.write("            <h2>Registro de usuario</h2>\n");
      out.write("            <form action=\"ServletGeneral\">\n");
      out.write("                <input type=\"text\" name=\"dc\" placeholder=\"Numero documento\" />\n");
      out.write("                <input type=\"text\" name=\"no\" placeholder=\"Nombre\" />\n");
      out.write("                <input type=\"text\" name=\"cl\" placeholder=\"Clave\" />\n");
      out.write("                <input type=\"text\" name=\"ro\" placeholder=\"Root\" />\n");
      out.write("                <a href=\"\">\n");
      out.write("                  <input type=\"submit\" name=\"btnusuario\" value=\"Grabar Usuario\">\n");
      out.write("                </a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
