package eje_e352;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ejercicio {
    
    
    public void escribir()  {
        
        // String nombre_archivo = "C:/temporal/salida_e352.txt";
        String nombre_archivo = "C:\\temporal\\salida_e352.txt";

        try {
            PrintWriter writer = new PrintWriter(nombre_archivo);
            String salida = "";
            
            for (int n=0; n<10; n++) {
                salida = "Linea " + n;
                writer.println(salida);
            }
            
            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
    
}
