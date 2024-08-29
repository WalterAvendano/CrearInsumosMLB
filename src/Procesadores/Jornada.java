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
public class Jornada {
    // Creamos la clase muestraContenido para vaciar en la variable "archivo" la direccion y nombre del
    // archivo de entrada

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {

        // Declaramos la variable cadena como un String pues en ella se almacenara la direccion 
        String cadena;

        // Declaramos la variable "archivo1" tipo "File" e indicamos su dirección y nombre
        File archivo1 = new File("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Salidas\\EncuentrosJornada.txt");

        // Se crea la variable "b" tipo "BufferedReader" para guardar el contenido de la variable "archivo" y se indica
        // el tipo de registro ""ISO-8859-1"
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));

        // Declaramos la variable "escribir" para indicar el archivo a crear o escribir.
        // En este caso si el archivo existe escribira sobre el. Sino lo crea y escribe
        FileWriter escribir = new FileWriter(archivo1, true);
        int cont = 0;
        // Declaramo la variable "bw" tipo BufferedWriter" para guardar el contenido de la variable "escribir"
        BufferedWriter bw = new BufferedWriter(escribir);
        
        // Declaramos algunas variables a utilizar en el proceso
        // El ciclo while se utiliza para leer cada linea del archivo de entrada la cual se almacena en la 
        // variable cadena. Para indicar cada columna se utiliza el comando "split" y con el  valor "," se
        // indica que cada columna esta separada por una comma
        while ((cadena = b.readLine()) != null) {
            cont = cont + 1;
            String[] parts = cadena.split(",");
            String fecha = parts[0];
            String variable = cadena.substring(0, 2);
            String variable1 = cadena.substring(3, 5);
            String visitante = parts[1];
            String homeclub = parts[2];
            String a = parts[3];
            // El "if" se utiliza para ejecutar acciones dependiendo del contenido de la variable "valor"
            /**
             * if (equipo.equals("Atl")) { equipo = "Atlanta Braves";
            }*
             */

            //escribir.write(equipo+","+lanzador+","+record+","+efectividad+"\r\n");
            escribir.write("2024/" + variable1 + "/" + variable + "," +cont+","+ visitante + "," + homeclub +","+ a+"\r\n");

        }
        b.close();
        escribir.close();
    }

    // En el main se carga el parametro que tendra como entrada el metodo "muestraContenido" 
    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Entrada\\JornadaMLB.txt");
    }
}
