/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

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
public class InsertarDatos {

    Pool metodospool = new Pool();

    public boolean importatlas() throws SQLException {
        boolean confirmacion2 = true;
        String query2;
        java.sql.Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

////cargamos el archivo txt
        try {
            conectar = metodospool.dataSource.getConnection();

            //query2 = "LOAD DATA INFILE '"+this."c:/Proyecto ThyPhi/mlb/Archivos/Salidas/LanzadoresJornada.txt"+"' INTO TABLE lanzadoresjornada FIELDS   TERMINATED BY ',' LINES TERMINATED BY '\\n' ;\";
            query2 = "LOAD DATA LOCAL INFILE 'c:/Proyecto ThyPhi/mlb/Archivos/Salidas/LanzadoresJornada.txt'INTO TABLE lanzadoresjornada FIELDS TERMINATED BY ','";

//////////esta es la instruccion de mysql para cargar datos desde el archivo txt
//////cadena origen indica el directorio donde esta ubicado el archivo txt y su nombre.
            pst = conectar.prepareStatement(query2);
            //Ejecutamos la consulta
            result = pst.executeQuery();

            System.out.println("llenado completo Atlas ");

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());
            conectar.close();

        }
////////////////////////////////////////

        return confirmacion2;

    }//fin importar atlas
}
