package eje_e003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ejercicio {
    
    public void solucion() {
        
        int LARGO = 10;
        
        int[] numeros = new int[LARGO]; 
        
        for (int i=0; i<LARGO; i++) {
            Random random = new Random();
            int n = random.nextInt(100);
            numeros[i] = n;
        }
        
        String detalle = Arrays.toString(numeros);
    
        System.out.println(detalle);
        
    }
    
    public void solucion_arraylist() {
        // solucion usando objeto ArrayList
        int LARGO = 10;
        
        ArrayList<Integer> numeros = new ArrayList(); 
        
        for (int i=0; i<LARGO; i++) {
            Random random = new Random();
            int n = random.nextInt(100);
            numeros.add(n);
        }

        String detalle = numeros.toString();
    
        System.out.println(detalle);
        
    }
    
}
