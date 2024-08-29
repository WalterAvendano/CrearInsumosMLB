/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WalterIvan
 */
public class Abridores {
  public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {

        // Declaramos la variable cadena como un String pues en ella se almacenara la direccion 
        String cadena;

        // Declaramos la variable "archivo1" tipo "File" e indicamos su dirección y nombre
        File archivo1 = new File("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Salidas\\LanzadoresJornada.txt");

        // Se crea la variable "b" tipo "BufferedReader" para guardar el contenido de la variable "archivo" y se indica
        // el tipo de registro ""ISO-8859-1"
        
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));
        
        // Declaramos la variable "escribir" para indicar el archivo a crear o escribir.
        // En este caso si el archivo existe escribira sobre el. Sino lo crea y escribe

        FileWriter escribir = new FileWriter(archivo1, true);

        // Declaramo la variable "bw" tipo BufferedWriter" para guardar el contenido de la variable "escribir"
        BufferedWriter bw = new BufferedWriter(escribir);

        // Declaramos algunas variables a utilizar en el proceso
        
        

        // El ciclo while se utiliza para leer cada linea del archivo de entrada la cual se almacena en la 
        // variable cadena. Para indicar cada columna se utiliza el comando "split" y con el  valor "," se
        // indica que cada columna esta separada por una comma
        
        while ((cadena = b.readLine()) != null) {
            int posicion = cadena.indexOf(':');
            int posicion1 = cadena.indexOf("(");
            int posicion2 = cadena.indexOf(",");
            int posicion3 = cadena.indexOf("-");
            int posicion4 = cadena.indexOf(")");
            String equipo = cadena.substring(0,posicion);
            String lanzador = cadena.substring((posicion + 1),posicion1);
            String record = cadena.substring((posicion1 + 1),posicion2);
            String efectividad = cadena.substring((posicion2+ 2),posicion4);
            // El "if" se utiliza para ejecutar acciones dependiendo del contenido de la variable "valor"
            if (equipo.equals("Atl")) {
                equipo = "Atlanta Braves";
            }
            if (equipo.equals("Bal")) {
                equipo = "Baltimore Orioles";
            }
             if (equipo.equals("Bos")) {
                equipo = "Boston Red Sox";
            }
             if (equipo.equals("ChC")) {
                equipo = "Chicago Cubs";
            }
            if (equipo.equals("Cin")) {
                equipo = "Cincinnati Reds";
            } 
            if (equipo.equals("Cle")) {
                equipo = "Cleveland Guardians";
            } 
            if (equipo.equals("CWS")) {
                equipo = "Chicago White Sox";
            }
            if (equipo.equals("Det")) {
                equipo = "Detroit Tigers";
            }
            if (equipo.equals("Hou")) {
                equipo = "Houston Astros";
            }
            if (equipo.equals("KC")) {
                equipo = "Kansas City Royals";
            }
            if (equipo.equals("LAA")) {
                equipo = "Los Angeles Angels";
            }
            if (equipo.equals("LAD")) {
                equipo = "Los Angeles Dodgers";
            }
            if (equipo.equals("Mia")) {
                equipo = "Miami Marlins";
            }
            if (equipo.equals("Mil")) {
                equipo = "Milwaukee Brewers";
            }
            if (equipo.equals("Min")) {
                equipo = "Minnesota Twins";
            }
            if (equipo.equals("NYM")) {
                equipo = "New York Mets";
            }
            if (equipo.equals("NYY")) {
                equipo = "New York Yankees";
            }
            if (equipo.equals("Oak")) {
                equipo = "Oakland Athletics";
            }
            if (equipo.equals("Phi")) {
                equipo = "Philadelphia Phillies";
            }
            if (equipo.equals("Pit")) {
                equipo = "Pittsburgh Pirates";
            }
            if (equipo.equals("SD")) {
                equipo = "San Diego Padres";
            }
            if (equipo.equals("Sea")) {
                equipo = "Seattle Mariners";
            }
            if (equipo.equals("SF")) {
                equipo = "San Francisco Giants";
            }
            if (equipo.equals("StL")) {
                equipo = "St. Louis Cardinals";
            }
            if (equipo.equals("TB")) {
                equipo = "Tampa Bay Rays";
            }
            if (equipo.equals("Tex")) {
                equipo = "Texas Rangers";
            }
            if (equipo.equals("Tor")) {
                equipo = "Toronto Blue Jays";
            }
            if (equipo.equals("Was")) {
                equipo = "Washington Nationals";
            }
            if (equipo.equals("Col")) {
                equipo = "Colorado Rockies";
            }
            if (equipo.equals("Ari")) {
                equipo = "Arizona Diamondbacks";
            }
            if (lanzador.equals(" ")){
                lanzador = "No Asignado";
            }
       escribir.write(equipo+","+lanzador+","+record+","+efectividad+"\r\n");
       //System.out.println(cadena);
       //System.out.println(equipo+","+lanzador+","+record+","+efectividad+"\r\n");
                    
           
        }
        b.close();
        escribir.close();
    }

    // En el main se carga el parametro que tendra como entrada el metodo "muestraContenido" 
    
    public static void main(String[] args) throws IOException {
        
       muestraContenido("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Entrada\\Lanzadores.txt");
    }  
}
