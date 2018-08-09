//Ingreso de datos de todas las tablas de Bancoweb
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ingresodatos {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;
    
    //en este metodo llamamos a nuestro objeto usuarioGS de constuctor
    public void ingresoUsuario(usuarioGS ings){
        try {
            ps=(PreparedStatement) cnn.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?)");
            
            ps.setString(1, ings.getUsudoc());
            ps.setString(2, ings.getUsunom());
            ps.setString(3, ings.getUsuclave());
            ps.setString(4, ings.getUsuroot());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos registrados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No fueron registados los datos" + e);
        }
    }
    
    
    
    //ingreso de datos cliente
    public int ingresoCliente(clienteGS ings){
        
        int x=0;
        
        try {
            ps=cnn.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1, ings.getNumdoc());
            ps.setString(2, ings.getNombre());
            ps.setString(3, ings.getApellido());
            ps.setString(4, ings.getTelefono());
            ps.setString(5, ings.getCorreo());
            ps.setString(6, ings.getTipodoc());
            ps.setString(7, ings.getDireccion());
            ps.setString(8, ings.getFecha());
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos registrados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos no registrados, verifica" + e);
        }
        
        
        return x;   
    
    }
    
    
    //ingreso de datos lineacredito
    public int ingresoLinCredit(lincreditGS ings){
        
        int x=0;
        
        try {
            ps=cnn.prepareStatement("INSERT INTO lineacredito VALUES(?,?,?) ");
            ps.setString(1, ings.getCodlinea());
            ps.setString(2, ings.getNomlinea());
            ps.setString(3, ings.getMontlinea());
            
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos registrados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos no registrados, verifica" + e);
        }
        
        
        return x;   
    
    }
    
    
    
    //ingreso de datos creditoCliente
    public int ingresoCreditCliente(creditoclienteGS ings){
        
        int x=0;
        
        try {
            ps=cnn.prepareStatement("INSERT INTO creditocliente VALUES(?,?,?,?) ");
            ps.setString(1, ings.getCreclidoc());
            ps.setString(2, ings.getCredcodlinea());
            ps.setString(3, ings.getCreditofecha());
            ps.setString(4, ings.getCreditomonto());
            
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos registrados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos no registrados, verifica" + e);
        }
        
        
        return x;   
    
    }
    
    
    
    
    
    
}
