package eje_e354;

import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio {
    
    public void menu() {
        
        
        String linea=null;
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba texto y presione <Enter>, sale con *");
        linea = scan.nextLine();
        
        while (!linea.equals("*")) {
            sb.append(linea);
            sb.append(" ");
            linea = scan.nextLine();
        }
    
        escribir(sb.toString());
        
    }
    
    
    public void escribir(String plinea) {
        
        
        String nombre_archivo = "C:/temporal/salida3.txt";
        try {
            PrintWriter writer = new PrintWriter(nombre_archivo);
            writer.print(plinea);
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
}
