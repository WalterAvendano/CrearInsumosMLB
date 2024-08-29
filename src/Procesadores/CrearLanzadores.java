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
 * @author walte
 */
public class CrearLanzadores {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        int cont = 0;
        String horario;
        String equipo1 = null;
        String equipo2 = null;
        //String equipo = null;
        String abridorequipo1 = null;
        String recordequipo1 = null;
        String abridorequipo2 = null;
        String recordequipo2 = null;
        //String abridorequipo = null;
        //String recordequipo = null;

        //File archivo1 = new File("C:\\Proyecto ThyPhi\\Futbol Italiano\\Archivos\\FIEncuentros.txt");
        File archivo1 = new File("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Entrada\\Lanzadores.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));
        FileWriter escribir = new FileWriter(archivo1, true);
        BufferedWriter bw = new BufferedWriter(escribir);
        while ((cadena = b.readLine()) != null) {
            cont = cont + 1;
            String[] parts = cadena.split(" ");
            String lectura = parts[0].trim().replace(".", "");
            if (cont > 0 && cont < 9) {
                //System.out.println(cadena);
                switch (cont) {
                    case 1:
                        horario = (cadena);
                     //   System.out.println(horario);
                        break;
                    case 2:
                        equipo1 = (cadena);
                        if (equipo1.equals(" Braves")) {
                            equipo1 = "Atl";
                        }
                        if (equipo1.equals(" Orioles")) {
                            equipo1 = "Bal";
                        }
                        if (equipo1.equals(" Red Sox")) {
                            equipo1 = "Bos";
                        }
                        if (equipo1.equals(" Cubs")) {
                            equipo1 = "ChC";
                        }
                        if (equipo1.equals(" Reds")) {
                            equipo1 = "Cin";
                        }
                        if (equipo1.equals(" Guardians")) {
                            equipo1 = "Cle";
                        }
                        if (equipo1.equals(" White Sox")) {
                            equipo1 = "CWS";
                        }
                        if (equipo1.equals(" Tigers")) {
                            equipo1 = "Det";
                        }
                        if (equipo1.equals(" Astros")) {
                            equipo1 = "Hou";
                        }
                        if (equipo1.equals(" Royals")) {
                            equipo1 = "KC";
                        }
                        if (equipo1.equals(" Angels")) {
                            equipo1 = "LAA";
                        }
                        if (equipo1.equals(" Dodgers")) {
                            equipo1 = "LAD";
                        }
                        if (equipo1.equals(" Marlins")) {
                            equipo1 = "Mia";
                        }
                        if (equipo1.equals(" Brewers")) {
                            equipo1 = "Mil";
                        }
                        if (equipo1.equals(" Twins")) {
                            equipo1 = "Min";
                        }
                        if (equipo1.equals(" Mets")) {
                            equipo1 = "NYM";
                        }
                        if (equipo1.equals(" Yankees")) {
                            equipo1 = "NYY";
                        }
                        if (equipo1.equals(" Athletics")) {
                            equipo1 = "Oak";
                        }
                        if (equipo1.equals(" Phillies")) {
                            equipo1 = "Phi";
                        }
                        if (equipo1.equals(" Pirates")) {
                            equipo1 = "Pit";
                        }
                        if (equipo1.equals(" Padres")) {
                            equipo1 = "SD";
                        }
                        if (equipo1.equals(" Mariners")) {
                            equipo1 = "Sea";
                        }
                        if (equipo1.equals(" Giants")) {
                            equipo1 = "SF";
                        }
                        if (equipo1.equals(" Cardinals")) {
                            equipo1 = "StL";
                        }
                        if (equipo1.equals(" Rays")) {
                            equipo1 = "TB";
                        }
                        if (equipo1.equals(" Rangers")) {
                            equipo1 = "Tex";
                        }
                        if (equipo1.equals(" Blue Jays")) {
                            equipo1 = "Tor";
                        }
                        if (equipo1.equals(" Nationals")) {
                            equipo1 = "Was";
                        }
                        if (equipo1.equals(" Rockies")) {
                            equipo1 = "Col";
                        }
                        if (equipo1.equals(" Diamondbacks")) {
                            equipo1 = "Ari";
                        }
                        // if (lanzador.equals(" ")) {
                        //     lanzador = "No Asignado";
                        //}
                       // System.out.println(equipo);
                        break;
                    case 3:
                        equipo2 = (cadena);
                        if (equipo2.equals(" Braves")) {
                            equipo2 = "Atl";
                        }
                        if (equipo2.equals(" Orioles")) {
                            equipo2 = "Bal";
                        }
                        if (equipo2.equals(" Red Sox")) {
                            equipo2 = "Bos";
                        }
                        if (equipo2.equals(" Cubs")) {
                            equipo2 = "ChC";
                        }
                        if (equipo2.equals(" Reds")) {
                            equipo2 = "Cin";
                        }
                        if (equipo2.equals(" Guardians")) {
                            equipo2 = "Cle";
                        }
                        if (equipo2.equals(" White Sox")) {
                            equipo2 = "CWS";
                        }
                        if (equipo2.equals(" Tigers")) {
                            equipo2 = "Det";
                        }
                        if (equipo2.equals(" Astros")) {
                            equipo2 = "Hou";
                        }
                        if (equipo2.equals(" Royals")) {
                            equipo2 = "KC";
                        }
                        if (equipo2.equals(" Angels")) {
                            equipo2 = "LAA";
                        }
                        if (equipo2.equals(" Dodgers")) {
                            equipo2 = "LAD";
                        }
                        if (equipo2.equals(" Marlins")) {
                            equipo2 = "Mia";
                        }
                        if (equipo2.equals(" Brewers")) {
                            equipo2 = "Mil";
                        }
                        if (equipo2.equals(" Twins")) {
                            equipo2 = "Min";
                        }
                        if (equipo2.equals(" Mets")) {
                            equipo2 = "NYM";
                        }
                        if (equipo2.equals(" Yankees")) {
                            equipo2 = "NYY";
                        }
                        if (equipo2.equals(" Athletcs")) {
                            equipo2 = "Oak";
                        }
                        if (equipo2.equals(" Phillies")) {
                            equipo2 = "Phi";
                        }
                        if (equipo2.equals(" Pirates")) {
                            equipo2 = "Pit";
                        }
                        if (equipo2.equals(" Padres")) {
                            equipo2 = "SD";
                        }
                        if (equipo2.equals(" Mariners")) {
                            equipo2 = "Sea";
                        }
                        if (equipo2.equals(" Giants")) {
                            equipo2 = "SF";
                        }
                        if (equipo2.equals(" Cardinals")) {
                            equipo2 = "StL";
                        }
                        if (equipo2.equals(" Rays")) {
                            equipo2 = "TB";
                        }
                        if (equipo2.equals(" Rangers")) {
                            equipo2 = "Tex";
                        }
                        if (equipo2.equals(" Blue Jays")) {
                            equipo2 = "Tor";
                        }
                        if (equipo2.equals(" Nationals")) {
                            equipo2 = "Was";
                        }
                        if (equipo2.equals(" Rockies")) {
                            equipo2 = "Col";
                        }
                        if (equipo2.equals(" Diamondbacks")) {
                            equipo2 = "Ari";
                        }
                          //   System.out.println(equipo);
                        break;
                    case 4:
                        abridorequipo1 = (cadena);
                      //  System.out.println(abridorequipo);
                        break;
                    case 5:
                        recordequipo1 = (cadena);
                      //  System.out.println(recordequipo);
                        break;
                    case 6:
                        abridorequipo2 = (cadena);
                      //  System.out.println(abridorequipo);
                        break;
                    case 7:
                        recordequipo2 = (cadena);
                      //  System.out.println(recordequipo);
                        break;
                    case 8:
                        System.out.println(equipo1 + ":" + abridorequipo1 + recordequipo1 + "\r\n");
                        System.out.println(equipo2 + ":" + abridorequipo2 + recordequipo2 + "\r\n");
                        escribir.write(equipo1 + ":" + abridorequipo1 + recordequipo1+ "\r\n");
                        escribir.write(equipo2 + ":" + abridorequipo2 + recordequipo2 + "\r\n");
                    //    System.out.println(equipo);
                        cont = 0;
                        break;

                }

            }

            //System.out.println(lectura);
        }

        escribir.close();
    }

    public static void main(String[] args) throws IOException {

        muestraContenido("C:\\Proyecto ThyPhi\\MLB\\Archivos\\Entrada\\ArchivoAbridores.txt");

    }

}
