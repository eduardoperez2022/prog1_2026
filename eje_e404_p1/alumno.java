package eje_e404_p1;

public class alumno implements Comparable<alumno>  {
    
    private String nombre;
    private Integer nota;

    public alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
    
    @Override
    public int compareTo(alumno otraPersona) {
        // Compara las notas para definir el orden natural ascendente
        return Integer.compare(this.nota, otraPersona.nota);
    }    

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
