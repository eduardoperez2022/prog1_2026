package eje_e401;


// E401 – Realizar un TAD que represente a un código de CUIT/CUIL usado en Argentina. El mismo
// debe guardar internamente el código de CUIT/CUIL en una variable tipo String, y debe tener los
// siguientes métodos: setCuit, getCuit, getCuitFormato (salida en formato AA-BBCCCDDD-E), y el
// método esValido (realizando la validación del dígito verificador).

public class Eje_E401 {

    public static void main(String[] args) {
        // TODO code application logic here
        MiCuit mc = new MiCuit("20334445556");

        String sinFormato = mc.getCuit();
        
        String formato = mc.getCuitFormato();
        
        System.out.println(sinFormato);
        
        System.out.println(formato);
        
    }
    
}
