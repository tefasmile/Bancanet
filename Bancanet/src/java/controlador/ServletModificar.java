//----------MODIFICAR CLIENTE------------------->>>>
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.Actualizar;
import modelo.Eliminar;
import modelo.clienteGS;
import modelo.creditoclienteGS;
import modelo.lincreditGS;
import modelo.usuarioGS;

/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletModificar", urlPatterns = {"/ServletModificar"})
public class ServletModificar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Cliente
        if(request.getParameter("btnmodificar") != null){
            this.modificarCliente(request, response);
        }else if(request.getParameter("btneliminar") != null){
            this.eliminarCliente(request, response);
        }
        
        //Usuario
        if(request.getParameter("btnedituser") != null){
            this.modificarUsuario(request, response);
        }else if(request.getParameter("btndeleteuser") != null){
            this.eliminarUsuario(request, response);
        }
        
        //lineacredito
        if(request.getParameter("btneditlinea") != null){
            this.modificarLinCredito(request, response);
        }else if(request.getParameter("btndeletelinea") != null){
            this.eliminarLinCredito(request, response);
        }
        
        
        //creditoCliente
        if(request.getParameter("btneditcredito") != null){
            this.modificarCredito(request, response);
        }else if(request.getParameter("btndeletcredito") != null){
            this.eliminarCredito(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    //Cliente
    protected void modificarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            String docUser=request.getParameter("docUser");
            
            //declaracion variables
            String nd,no,ap,te,co,td,di,f;
            
            //captura de datos en form
            nd=request.getParameter("nd");
            no=request.getParameter("no");
            ap=request.getParameter("ap");
            te=request.getParameter("te");
            co=request.getParameter("co");
            td=request.getParameter("td");
            di=request.getParameter("di");
            f=request.getParameter("f");
            
            //instancias
            clienteGS inggs=new clienteGS(nd,no,ap,te,co,td,di,f);
            Actualizar act=new Actualizar();
            int x = act.modificarCliente(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaCliente.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    //EliminarCliente
    protected void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String nd,no,ap,te,co,td,di,f;
            
            //captura de datos en form
            nd=request.getParameter("nd");
            no=request.getParameter("no");
            ap=request.getParameter("ap");
            te=request.getParameter("te");
            co=request.getParameter("co");
            td=request.getParameter("td");
            di=request.getParameter("di");
            f=request.getParameter("f");
            
            //instancias
            clienteGS inggs=new clienteGS(nd,no,ap,te,co,td,di,f);
            Eliminar d=new Eliminar();
            int x = d.eliminarCliente(inggs);
             //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos eliminados");
                request.getRequestDispatcher("ConsultaCliente.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO eliminados");
            }
    
    }
    
    
    //Usuario
    protected void modificarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String dc,no,cl,ro;
            
            //captura de datos en form
            dc=request.getParameter("dc");
            no=request.getParameter("no");
            cl=request.getParameter("cl");
            ro=request.getParameter("ro");
            
            //instancias
            usuarioGS inggs=new usuarioGS(dc,no,cl,ro);
            Actualizar act=new Actualizar();
            int x = act.modificarUsuario(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaUsuarios.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    
    
    //EliminarUsuario
    protected void eliminarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String dc,no,cl,ro;
            
            //captura de datos en form
            dc=request.getParameter("dc");
            no=request.getParameter("no");
            cl=request.getParameter("cl");
            ro=request.getParameter("ro");
            
            //instancias
            usuarioGS inggs=new usuarioGS(dc,no,cl,ro);
            Eliminar d=new Eliminar();
            int x = d.eliminarUsuario(inggs);
             //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos eliminados");
                request.getRequestDispatcher("ConsultaUsuarios.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO eliminados");
            }
    
    }
    
    
    //modificar-lineacredito
    protected void modificarLinCredito(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String cl,nl,ml;
            
            //captura de datos en form
            cl=request.getParameter("cl");
            nl=request.getParameter("nl");
            ml=request.getParameter("ml");
            
            //instancias
            lincreditGS inggs=new lincreditGS(cl,nl,ml);
            Actualizar act=new Actualizar();
            int x = act.modificarLinCredit(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaLincredit.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    
    //Eliminar lineadecredito
    protected void eliminarLinCredito(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String cl,nl,ml;
            
            //captura de datos en form
            cl=request.getParameter("cl");
            nl=request.getParameter("nl");
            ml=request.getParameter("ml");
            
            //instancias
            lincreditGS inggs=new lincreditGS(cl,nl,ml);
            Eliminar d=new Eliminar();
            int x = d.eliminarLinCredito(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaLincredit.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    
    //modificar-credito
    protected void modificarCredito(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String cc,cd,cf,cm;
          
            //captura de datos en form
            cc=request.getParameter("cc");
            cd=request.getParameter("cd");
            cf=request.getParameter("cf");
            cm=request.getParameter("cm");
            //instancias
            creditoclienteGS inggs=new creditoclienteGS(cc,cd,cf,cm);
            Actualizar act=new Actualizar();
            int x = act.modificarCredito(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaCredito.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    
    //modificar-credito
    protected void eliminarCredito(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            //declaracion variables
            String cc,cd,cf,cm;
          
            //captura de datos en form
            cc=request.getParameter("cc");
            cd=request.getParameter("cd");
            cf=request.getParameter("cf");
            cm=request.getParameter("cm");
            //instancias
            creditoclienteGS inggs=new creditoclienteGS(cc,cd,cf,cm);
            Eliminar act=new Eliminar();
            int x = act.eliminarCredito(inggs);
            //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                request.getRequestDispatcher("ConsultaCredito.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NOO actualizados");
            }
    
    }
    
    
    
    
}
