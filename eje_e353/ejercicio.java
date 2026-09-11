package eje_e353;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio {
    
    public void menu() {
        
        String linea=null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba texto y presione <Enter>, sale con *");
        linea = scan.nextLine();
        
        while (!linea.equals("*")) {
            escribir(linea);
            linea = scan.nextLine();
        }

        System.out.println("Termina ...");
        
    }
    
    public void escribir(String plinea) {
        
        String nombre_archivo = "C:/temporal/salida2.txt";
        try {
            FileWriter fw = new FileWriter(nombre_archivo,true);
    	    BufferedWriter bw = new BufferedWriter(fw);
    	    PrintWriter writer = new PrintWriter(bw);            
            writer.println(plinea);  // append al final del archivo
            writer.close();
        }
        //catch (Exception e) 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
    }
    
    
}
