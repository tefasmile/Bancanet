//Servlet de login al aplicativo
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;



@WebServlet(name = "ServletIngreso", urlPatterns = {"/ServletIngreso"})
public class ServletIngreso extends HttpServlet {

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
        
        //login
        if(request.getParameter("btnIngresar") != null){
            this.login(request, response);
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
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            //declaracion variables
            String user,pass;
            //captura de datos en form
            user=request.getParameter("user");
            pass=request.getParameter("pass");
            
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error, hay campos vacios");
            } else {
                
                try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnn=DriverManager.getConnection("jdbc:mysql://localhost/bancoweb", "root", "1234");
                PreparedStatement ps=cnn.prepareStatement("SELECT * FROM usuario WHERE UsuNom=? and UsuClave=?");
                ps.setString(1, user);
                ps.setString(2, pass);
                ResultSet rs=ps.executeQuery();
                
                    if(rs.next()){
                        HttpSession session=request.getSession(true);
                        session.setAttribute("Bienvenido", user);
                        response.sendRedirect("usuarios.jsp");
                        JOptionPane.showMessageDialog(null,"Bienvenid@"+" "+user);
                        System.out.println("Hola que tal "+ user);
                    }else{

                        JOptionPane.showMessageDialog(null,"Error, intentalo de nuevo");
                    }
            
                } catch (Exception e) {
                    System.out.println("Error "+e);
                }
                
                
            }
            
            
            
            
    
    }
}
