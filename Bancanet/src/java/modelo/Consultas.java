
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Consultas {
    
    Conexion con = new Conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    //implementacion de array para tomar cada valor (dato) de nuestros formularios
    public ArrayList<usuarioGS> consultaUsuario(){
        ArrayList<usuarioGS> arreglo=new ArrayList<usuarioGS>();//instancia
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM usuario");
            rs=ps.executeQuery();
            
            //parseo de datos
            while(rs.next()){
                usuarioGS getset=new usuarioGS(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                arreglo.add(getset);
            }
            
        } catch (Exception e) {
        }
        
        return arreglo;
    }
    
    
    
    //implementacion de array para tomar cada valor (dato) de nuestros formularios
    public ArrayList<clienteGS> consultaCliente(){
        ArrayList<clienteGS> arreglo=new ArrayList<clienteGS>();//instancia
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM cliente");
            rs=ps.executeQuery();
            
            //parseo de datos
            while(rs.next()){
                clienteGS getset=new clienteGS(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                arreglo.add(getset);
            }
            
        } catch (Exception e) {
        }
        
        return arreglo;
    }
    
    
    //linea de credito
    public ArrayList<lincreditGS> consultaLinCreditCliente(){
        ArrayList<lincreditGS> arreglo=new ArrayList<lincreditGS>();//instancia
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM lineacredito");
            rs=ps.executeQuery();
            
            //parseo de datos
            while(rs.next()){
                lincreditGS getset=new lincreditGS(rs.getString(1), rs.getString(2), rs.getString(3));
                arreglo.add(getset);
            }
            
        } catch (Exception e) {
        }
        
        return arreglo;
    }
    
    
    
      //linea de creditocliente
    public ArrayList<creditoclienteGS> consultaCreditCliente(){
        ArrayList<creditoclienteGS> arreglo=new ArrayList<creditoclienteGS>();//instancia
        
        try {
            ps=cnn.prepareStatement("SELECT * FROM creditocliente");
            rs=ps.executeQuery();
            
            //parseo de datos
            while(rs.next()){
                creditoclienteGS getset=new creditoclienteGS(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                arreglo.add(getset);
            }
            
        } catch (Exception e) {
        }
        
        return arreglo;
    }
    
    
    
}
