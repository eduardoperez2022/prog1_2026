package demo_fecha1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDate {

    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatear la fecha como una cadena
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        
        String fechaFormateada = fechaActual.format(formato);

        String fechaFormateada2 = fechaActual.format(formato2);

        // Imprimir la fecha formateada
        System.out.println("Fecha actual: " + fechaFormateada);

        System.out.println("Fecha actual: " + fechaFormateada2);

    }
}