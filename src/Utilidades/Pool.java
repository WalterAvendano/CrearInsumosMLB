/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;
// Se deben agregar las siguientes librerias para poder conectarse a MySql
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
/**
 *
 * @author WalterIvan
 */
public class Pool {
    public DataSource dataSource;

    public String db = "mlb";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "walter";
    public String pass = "Walugeso01+";
    
    public Pool(){

        inicializaDataSource();

    }
     private void inicializaDataSource(){


        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);


        dataSource = basicDataSource;

    }  
}
