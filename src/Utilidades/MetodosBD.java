/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;
// Se deben agregar las siguientes librerias
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author WalterIvan
 */
public class MetodosBD {
    Pool metodospool = new Pool();
    
    public void consultar_fecha(JComboBox JCFecha){

//Creamos objeto tipo Connection    
java.sql.Connection conectar = null;    
PreparedStatement pst = null;
ResultSet result = null;
//Creamos la Consulta SQL
String SSQL = "select distinct fecha from resultados order by fecha desc";
//String SSQL = "select MAX(fecha) from resultados";

//Establecemos bloque try-catch-finally
try {
       
   //Establecemos conexión con la BD 
   conectar = metodospool.dataSource.getConnection();  
   //Preparamos la consulta SQL
   pst = conectar.prepareStatement(SSQL);
   //Ejecutamos la consulta
   result = pst.executeQuery();
   
   //LLenamos nuestro ComboBox
   //cbox_Paises.addItem("Seleccione una opción");
   
   while(result.next()){
              JCFecha.addItem(result.getString("fecha"));
      }
    
} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}finally{

    if(conectar!=null){
        
        try {
        
            conectar.close();
            result.close();
            
            conectar=null;
            result=null;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }

}
    

}
public void llenarTextField(JTextField JTXTFecha){

//Creamos objeto tipo Connection    
java.sql.Connection conectar = null;    
PreparedStatement pst = null;
ResultSet result = null;

//Creamos la Consulta SQL
String SSQL = "select fecha from resultados order by fecha desc limit 1";

//Establecemos bloque try-catch-finally
try {
       
   //Establecemos conexión con la BD 
   conectar = metodospool.dataSource.getConnection();  
   //Preparamos la consulta SQL
   pst = conectar.prepareStatement(SSQL);
   //Ejecutamos la consulta
   result = pst.executeQuery();
   
   //LLenamos nuestro ComboBox
   //cbox_Paises.addItem("Seleccione una opción");
   
   while(result.next()){
              JTXTFecha.setText(result.getString(1));
      }
    
} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}finally{

    if(conectar!=null){
        
        try {
        
            conectar.close();
            result.close();
            
            conectar=null;
            result=null;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }

}
    

}

public int limpieza() throws SQLException{  
  
        Connection conn = null;  
        
             conn = metodospool.dataSource.getConnection();  
             CallableStatement cStmt = conn.prepareCall("{call limpiarjornada}");    
             //cStmt.setInt(2, 0);  
             //cStmt.registerOutParameter("exito", Types.INTEGER);    
               
             cStmt.execute();    
            
               
             //final ResultSet rs = cStmt.getResultSet();  
              
                     
              
                 conn.close();  
       return (0);  
         
     }    
}
