package eje_e351_b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio {
    
    public void lectura() {
        
        String nombre_archivo = "C:/temporal/notas.txt";
        FileReader origen = null;
        
        try {
            origen = new FileReader(nombre_archivo);
            BufferedReader br = new BufferedReader(origen);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line.length() + " - ");
                System.out.println(line);
            }            
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
         }
        
        catch (IOException e) {
                e.printStackTrace();
         }
    }
    
    public void lectura_2() {
        
        String nombre_archivo = "C:/temporal/notas.txt";
        FileReader origen = null;
        
        try {
            origen = new FileReader(nombre_archivo);
            Scanner scan = new Scanner(origen);
            String line;
            while (scan.hasNext()) {
                line = scan.nextLine();
                System.out.print(line.length() + " - ");
                System.out.println(line);
            }            
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
         }
        
    }


    public void lectura_3() {
        
        String nombre_archivo = "C:/temporal/notas.txt";
        // FileReader origen = null;
        
        try {
            File origen = new File(nombre_archivo);
            Scanner scan = new Scanner(origen);
            String line;
            while (scan.hasNext()) {
                line = scan.nextLine();
                System.out.print(line.length() + " - ");
                System.out.println(line);
            }            
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
         }
        
    }

    
}
