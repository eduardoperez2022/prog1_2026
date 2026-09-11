package eje_e404_p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio {
    
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<alumno> datos = new ArrayList();
        
        System.out.println("Ingrese 5 alumnos:");
        
        for (int i = 0; i < 5; i++) {
            String nombre = sc.nextLine();
            String nota  = sc.nextLine();
            
            alumno alumno1 = new alumno(nombre,Integer.valueOf(nota));
            datos.add(i, alumno1);
        }
        
        Collections.sort(datos);

        for(alumno al : datos) {
            System.out.println(al.toString());
        }
        
    }
    
}
