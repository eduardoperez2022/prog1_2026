package demo_burbuja;

public class alumno {
    
    private String nombre;
    private int edad;
    private long dni;

    public alumno(String nombre, int edad, long dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    
    
}
