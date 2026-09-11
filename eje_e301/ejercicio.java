package eje_e301;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio {
    
    public void solucion() {
        
        ArrayList<String> fentrada = new ArrayList();
        ArrayList<String> salidaOro = new ArrayList();
        ArrayList<String> salidaPlata = new ArrayList();
        ArrayList<String> salidaBronce = new ArrayList();
        
        // lectura de archivo de entrada
        try {
            String fileName = "c:/temporal/medallas_2024.dat";
            FileReader fr = new FileReader(fileName);
            Scanner entrada = new Scanner(fr);
            String linea = entrada.nextLine();
            while(linea != "") {
                fentrada.add(linea);
                if (entrada.hasNext()) {
                    linea = entrada.nextLine();
                }
                else {
                    break;
                }
            }
            
            // Filtro del contenido en base a la medalla
            for (String linea1 : fentrada) {
                if (linea1.toLowerCase().contains("oro")) {
                    salidaOro.add(linea1);
                }
                else if (linea1.toLowerCase().contains("plata")) {
                    salidaPlata.add(linea1);
                }
                else if (linea1.toLowerCase().contains("bronce")) {
                    salidaBronce.add(linea1);
                }
            }

            // test parcial
            // System.out.println(salidaOro.toString());
            
            // escribir la salida de acuerdo a la medalla
            escribeSalida(salidaOro, "medOro.txt");
            escribeSalida(salidaPlata, "medPlata.txt");
            escribeSalida(salidaBronce, "medBronce.txt");
            
            System.out.println("Proceso termina OK");
            
        } 
        
        catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        
        
    }
    
    public void escribeSalida( ArrayList<String> lineas, String fnombre ) {
        
        String nombre_archivo = "C:/temporal/" + fnombre;
        
        try {
            FileWriter fw = new FileWriter(nombre_archivo,true);
    	    BufferedWriter bw = new BufferedWriter(fw);
    	    PrintWriter writer = new PrintWriter(bw);
            for (String wlinea : lineas) {
                writer.println(wlinea);  // append al final del archivo
            }
            writer.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
    }
    
    
}
