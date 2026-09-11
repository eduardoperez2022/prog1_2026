package eje_e402;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio {
    
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList();
        
        System.out.println("Ingrese 10 datos de texto:");
        
        for (int i = 0; i < 10; i++) {
            String dato = sc.nextLine();
            datos.add(i, dato);
        }
        
        Stack<String> pila = new Stack();

        for(String dato2 : datos) {
            pila.push(dato2);
        }
        
        Iterator it = pila.iterator();

        System.out.println(datos.toString());
        
        while(pila.peek() != null) {
            String dato3 = pila.pop();
            System.out.println(dato3);
            if (pila.empty()) {
                break;
            }
        }
        
    }
    
}
