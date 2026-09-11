package eje_e404;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GestionEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList();

        System.out.println("Ingrese los estudiantes (ingrese 'fin' como nombre para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("fin")) {
                break;
            }
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            estudiantes.add(new Estudiante(nombre, nota));
            Collections.sort(estudiantes, Comparator.comparingDouble(Estudiante::getNota).reversed());
            System.out.println("Lista de estudiantes ordenada por nota descendente:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
                scanner.close();
            }
        }
    }
}
