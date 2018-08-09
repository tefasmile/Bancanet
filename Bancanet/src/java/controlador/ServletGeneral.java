/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import modelo.clienteGS;
import modelo.creditoclienteGS;
import modelo.ingresodatos;
import modelo.lincreditGS;
import modelo.usuarioGS;

/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletGeneral", urlPatterns = {"/ServletGeneral"})
public class ServletGeneral extends HttpServlet {

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
        
        //ingreso usuario
        if(request.getParameter("btnusuario") != null){
            this.ingresoUsuario(request, response);
            //response.sendRedirect("ConsultaUsuario.jsp");
        }
        
        //cliente
        if(request.getParameter("btncliente") != null){
            this.ingresoCliente(request, response);
        }
        

        //lineacredito
        if(request.getParameter("btnlinea") != null){
            this.ingresoLinCredito(request, response);
        }
        
        
        //creditocliente
        if(request.getParameter("btncredito") != null){
            this.ingresoCreditocliente(request, response);
        
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
    //usuario
    private void ingresoUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.sendRedirect("ConsultaUsuarios.jsp");
        String dc,no,cl,ro;
        
        dc=request.getParameter("dc");
        no=request.getParameter("no");
        cl=request.getParameter("cl");
        ro=request.getParameter("ro");
        
        //instancias
        usuarioGS inggs=new usuarioGS(dc,no,cl,ro);
        ingresodatos ing=new ingresodatos();
        ing.ingresoUsuario(inggs);
    }
    
    
    
    //metodo cliente
    private void ingresoCliente(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.sendRedirect("ConsultaCliente.jsp");
         
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
        ingresodatos ing=new ingresodatos();
        ing.ingresoCliente(inggs);
        int x= ing.ingresoCliente(inggs);
        //condicional
        if(x>0){
            JOptionPane.showMessageDialog(null, "Datos registrados");
            request.getRequestDispatcher("ConsultaCliente.jsp").forward(request, response);
        }else{
            JOptionPane.showMessageDialog(null, "Datos NO registrados");
        }
        
         
    }
    
    
    
    
    //metodo lineacredito
    private void ingresoLinCredito(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
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
        ingresodatos ing=new ingresodatos();
        int x= ing.ingresoLinCredit(inggs);
        //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos registrados");
                request.getRequestDispatcher("ConsultaLincredit.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NO registrados");
            }
        
         
    }
    
    
    
    //metodo creditocliente
    private void ingresoCreditocliente(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
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
        ingresodatos ing=new ingresodatos();
        int x= ing.ingresoCreditCliente(inggs);
        //condicional
            if(x>0){
                JOptionPane.showMessageDialog(null, "Datos registrados");
                request.getRequestDispatcher("ConsultaCredito.jsp").forward(request, response);
            }else{
                JOptionPane.showMessageDialog(null, "Datos NO registrados");
            }
        
         
    }
    
    
    
    
}
