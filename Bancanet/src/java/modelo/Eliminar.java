
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.Conexion;
import javax.swing.JOptionPane;


public class Eliminar {
    
    Conexion con=new Conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement ps = null;
    
    //eliminar-cliente
    public int eliminarCliente(clienteGS ings){
        
        int x=0;
        
        try {
            
          ps=(PreparedStatement) cnn.prepareStatement("DELETE FROM cliente WHERE CliDoc='"+ings.getNumdoc()+"' ");
          x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos NO Eliminados");
            
        }
            
        return x;
    
    }
    
    
    //eliminarUsuario
    public int eliminarUsuario(usuarioGS ings){
        int x=0;
        
        try {
            ps=(PreparedStatement)cnn.prepareStatement("DELETE FROM usuario WHERE UsuCliDoc='"+ings.getUsudoc()+"' ");
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        }
        
        return x;
    
    }
    
    
    //eliminarLineaCredito
    public int eliminarLinCredito(lincreditGS ings){
        int x=0;
        
        try {
            ps=(PreparedStatement)cnn.prepareStatement("DELETE FROM lineacredito WHERE LCCodLinea='"+ings.getCodlinea()+"' ");
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        }
        
        return x;
    
    }
    
    
    //eliminarCredito
    public int eliminarCredito(creditoclienteGS ings){
        int x=0;
        
        try {
            ps=(PreparedStatement)cnn.prepareStatement("DELETE FROM creditocliente WHERE CreCliDoc='"+ings.getCreclidoc()+"' ");
            x=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        }
        
        return x;
    
    }
    
    
}
