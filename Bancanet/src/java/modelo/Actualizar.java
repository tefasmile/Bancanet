
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.Conexion;
import javax.swing.JOptionPane;


public class Actualizar {
    
    Conexion con=new Conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement ps = null;
    
    //metodo cliente
    public int modificarCliente(clienteGS ings){
        String u;
        int dat=0;

        //JOptionPane.showMessageDialog(null, "variable");
        
        try {
            ps=(PreparedStatement) cnn.prepareStatement("UPDATE cliente SET CliNom='"+ings.getNombre()+"', CliApe='"+ings.getApellido()+"', CliTel='"+ings.getTelefono()+"', CliCorr='"+ings.getCorreo()+"', CliTipo='"+ings.getTipodoc()+"', CliDir='"+ings.getDireccion()+"', CliFecha='"+ings.getFecha()+"'  WHERE CliDoc='"+ings.getNumdoc()+"' ");
            dat=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        
        return dat;
    
    }
    
    
    //metodo usuario
    public int modificarUsuario(usuarioGS ings){
       
        int dat=0;

        
        
        try {
            ps=(PreparedStatement) cnn.prepareStatement("UPDATE usuario SET UsuNom='"+ings.getUsunom()+"', UsuClave='"+ings.getUsuclave()+"', UsuRoot='"+ings.getUsuroot()+"' WHERE UsuCliDoc='"+ings.getUsudoc()+"' ");
            dat=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        
        return dat;
    
    }
    
    
    //metodo linea credito
    public int modificarLinCredit(lincreditGS ings){
        
        int x=0;
        
        try {
            ps=(PreparedStatement) cnn.prepareStatement("UPDATE lineacredito SET LCNomLinea='"+ings.getNomlinea()+"', LCMontMax='"+ings.getMontlinea()+"'  WHERE LCCodLinea='"+ings.getCodlinea()+"'  ");
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return x;
    
    }
    
    
    
    //metodo linea credito
    public int modificarCredito(creditoclienteGS ings){
        
        int x=0;
        
        try {
            ps=(PreparedStatement) cnn.prepareStatement("UPDATE creditocliente SET CreCodLinea='"+ings.getCredcodlinea()+"', CreFechDes='"+ings.getCreditofecha()+"', CreMont='"+ings.getCreditomonto()+"'  WHERE CreCliDoc='"+ings.getCreclidoc()+"'  ");
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return x;
    
    }
    
}
