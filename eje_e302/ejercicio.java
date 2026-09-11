package eje_e302;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio {

    public void solucion() {

        ArrayList<String> f2011 = new ArrayList();
        ArrayList<String> f2012 = new ArrayList();
        ArrayList<String> salidaComunes = new ArrayList();

        f2011 = leerArchivo("boca_2011.txt");
        f2012 = leerArchivo("boca_2012.txt");
        
        // System.out.println(f2011.toString());
        
        for(String s2011 : f2011) {
            for(String s2012 : f2012) {
                if (s2011.equals(s2012)) {
                    salidaComunes.add(s2011);
                }
            }
        }
        
        // imprimo la lista de salida
        System.out.println("Lista de encontrados en ambos archivos:");
        
        for(String sali : salidaComunes) {
            System.out.println(sali);
        }
        
    }

    public ArrayList<String> leerArchivo(String fnombre) {

        ArrayList<String> lasalida = new ArrayList();

        try {
            String fileName = "c:/temporal/" + fnombre;
            FileReader fr = new FileReader(fileName);
            Scanner entrada = new Scanner(fr);
            String linea = entrada.nextLine();
            while (linea != "") {
                lasalida.add(linea);
                if (entrada.hasNext()) {
                    linea = entrada.nextLine();
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lasalida;

    }

}
