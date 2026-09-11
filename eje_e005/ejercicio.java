package eje_e005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ejercicio {
    
    final int LARGO = 10;
    
    public void solucion() {
        
        int[] numeros = new int[LARGO]; 
        int vueltas=0;
        
        while(true) {
            vueltas++;

            // genero array
            for (int i=0; i<LARGO; i++) {
                Random random = new Random();
                int n = random.nextInt(100);
                numeros[i] = n;
            }
            if (cumple(numeros)) {
                break;
            }
        }
        
        String detalle = Arrays.toString(numeros);
        System.out.println(detalle);
        System.out.println("Intentos: " + vueltas);

    }
    
    public boolean cumple( int[] arx ) {
        
        boolean arok = false;
        
        double marca = 60;
        
        double promedio = 0;
        double suma = 0;
        
        for (int i=0; i<LARGO; i++) {
            suma = suma + arx[i];
        }
        
        System.out.println("suma:"+suma);
        
        promedio = suma/LARGO;
        
        System.out.println("promedio:"+promedio);

        if (promedio <= marca) {
            arok=true;
        }
        
        return arok;
        
    }
    
    public void solucion_arraylist() {
        
        ArrayList<Integer> numeros = new ArrayList(); 
        int vueltas=0;
        
        while(true) {
            vueltas++;

            // genero array
            for (int i=0; i<LARGO; i++) {
                Random random = new Random();
                int n = random.nextInt(100);
                numeros.add(n);
            }
            if (cumple_arraylist(numeros)) {
                break;
            }
        }
        
        String detalle = numeros.toString();
        System.out.println(detalle);
        System.out.println("Intentos: " + vueltas);

    }
    
    public boolean cumple_arraylist( ArrayList<Integer> arx ) {
        
        boolean arok = false;
        
        double marca = 60;
        
        double promedio = 0;
        double suma = 0;
        
        for (int i=0; i<arx.size(); i++) {
            suma = suma + arx.get(i);
        }
        
        System.out.println("suma:"+suma);
        
        promedio = suma/LARGO;
        
        System.out.println("promedio:"+promedio);

        if (promedio <= marca) {
            arok=true;
        }
        
        return arok;
        
    }
    
    
}
