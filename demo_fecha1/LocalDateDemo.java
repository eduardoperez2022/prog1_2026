package demo_fecha1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

    public static void main(String[] args) {

        System.out.println("=== 1. CREACIÓN DE FECHAS ===");
        // Fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);

        // Fecha específica (Año, Mes, Día)
        LocalDate nacimiento = LocalDate.of(1995, Month.MAY, 23);
        System.out.println("Fecha de nacimiento: " + nacimiento);

        System.out.println("\n=== 2. Métodos Get (Extraer información) ===");
        System.out.println("Año: " + hoy.getYear());
        System.out.println("Mes: " + hoy.getMonth() + " (" + hoy.getMonthValue() + ")");
        System.out.println("Día del mes: " + hoy.getDayOfMonth());
        System.out.println("Día de la semana: " + hoy.getDayOfWeek());
        System.out.println("¿Es año bisiesto?: " + hoy.isLeapYear());

        System.out.println("\n=== 3. CÁLCULOS Y MODIFICACIONES ===");
        // Las instancias de LocalDate son inmutables. Los métodos devuelven una NUEVA instancia.
        LocalDate enDosSemanas = hoy.plusWeeks(2);
        LocalDate haceTresMeses = hoy.minusMonths(3);

        System.out.println("En dos semanas será: " + enDosSemanas);
        System.out.println("Hace tres meses fue: " + haceTresMeses);

        System.out.println("\n=== 4. COMPARACIONES Y PERÍODOS ===");
        // Verificar si una fecha es antes/después de otra
        boolean esAntes = nacimiento.isBefore(hoy);
        System.out.println("¿La fecha de nacimiento es antes de hoy?: " + esAntes);

        // Calcular la diferencia exacta entre dos fechas (Period)
        Period edad = Period.between(nacimiento, hoy);
        System.out.printf("Edad exacta: %d años, %d meses y %d días%n",
                edad.getYears(), edad.getMonths(), edad.getDays());

        System.out.println("\n=== 5. FORMATO Y PARSEO (TEXTO) ===");
        // Convertir de LocalDate a Texto con un formato personalizado
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = hoy.format(formateador);
        System.out.println("Fecha en formato dd/MM/yyyy: " + fechaFormateada);

        // Convertir de Texto a LocalDate
        String textoFecha = "25/12/2026";
        LocalDate fechaParseada = LocalDate.parse(textoFecha, formateador);
        System.out.println("Objeto LocalDate desde texto: " + fechaParseada);
    }
}
