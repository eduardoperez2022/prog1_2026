package eje_f005;

import java.util.ArrayList;

public class ejercicio {
    
    public void solucion(){
        ArrayList<alumno> alums = new ArrayList();
        
        String nombre1 = "Juan";
        Integer edad1 = 35;
        alumno n1 = new alumno(nombre1, edad1);
        alums.add(n1);

        String nombre2 = "Silvia";
        Integer edad2 = 31;
        alumno n2 = new alumno(nombre2, edad2);
        alums.add(n2);
        
        mostrar(alums);
    }
    
    
    public void mostrar( ArrayList<alumno> palu  ) {
        
        for(alumno a1 : palu  ) {
            System.out.println(a1.getNombre() + " " + a1.getEdad());
        }
        
    }
}
