package eje_e401;

public class MiCuit {
    
    private String miCuit="";

    public MiCuit(String miCuit) {
        this.miCuit = miCuit;
    }

    // getCuit
    public String getCuit() {
        return this.miCuit;
    }
    
    // setCuit
    public void setCuit(String valor) {
        this.miCuit = valor;
    }
    
    // getCuitFormato
    public String getCuitFormato() {
        
        // AA-BBCCCDDD-E
        String retval="";
        // suponemos el valor de miCuit como AABBCCCDDDE
        String parte1 = miCuit.substring(0,2);
        String parte2 = miCuit.substring(2,10);
        String parte3 = miCuit.substring(10,11);
        
        retval = parte1 + "-" + parte2 + "-" + parte3;
        
        return retval;
        
    }
    
}
