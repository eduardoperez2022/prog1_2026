package eje_e351;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ejercicio {

    public void solucion() {

        try {
            String fileName = "c:\\temporal\\entrada.txt";
            FileReader fr = new FileReader(fileName);
            Scanner entrada = new Scanner(fr);
            String linea = entrada.nextLine();
            while(linea != "") {
                String mensaje = linea.length() + " - " + linea;
                System.out.println(mensaje);
                if (entrada.hasNext()) {
                    linea = entrada.nextLine();
                }
                else {
                    break;
                }
            }
        } 
        
        catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }

}
