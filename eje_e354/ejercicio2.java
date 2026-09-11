package eje_e354;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    
    public void menu() {
        
        
        String linea=null;
        ArrayList<String> sbar = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba texto y presione <Enter>, sale con *");
        linea = scan.nextLine();
        
        while (!linea.equals("*")) {
            sbar.add(linea);           
            linea = scan.nextLine();
        }
    
        escribir(sbar);
        
    }
    
    
    public void escribir(ArrayList<String> plinea) {
        
        
        String nombre_archivo = "C:/temporal/salida3b.txt";
        try {
            PrintWriter writer = new PrintWriter(nombre_archivo);
            for(String linea : plinea) {
                writer.println(linea);
            }
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
}
