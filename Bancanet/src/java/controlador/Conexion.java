
package controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection con=null;
    
    //metodo conexion
    public Connection conexiondb(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bancoweb", "root", "1234");
            JOptionPane.showMessageDialog(null, "Conexion OK");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión");
        }
        
        return con;
    
    }
    
}
