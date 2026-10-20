package demo_fecha1;

import java.time.LocalDate;

public class ModificarFecha {

    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        // Sumar días a la fecha actual
        LocalDate fechaSumaDias = fechaActual.plusDays(5);
        System.out.println("Fecha después de sumar 5 días: " + fechaSumaDias);

        // Restar meses a la fecha actual
        LocalDate fechaRestaMeses = fechaActual.minusMonths(2);
        System.out.println("Fecha después de restar 2 meses: " + fechaRestaMeses);

        // Sumar años a la fecha actual
        LocalDate fechaSumaAnios = fechaActual.plusYears(3);
        System.out.println("Fecha después de sumar 3 años: " + fechaSumaAnios);
    }
}