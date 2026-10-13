package demo_burbuja;

public class burbuja {

    public void ordenaVector() {

        int vec[] = {6, 8, 3, 5, 4, 9, 0, 2, 1, 7};
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        //Ordenamiento
        for (int i = 0; i < vec.length - 1; i++) {
            for (int j = 0; j < (vec.length - 1 - i); j++) {
                // if (vec[j] > vec[j + 1]) {
                if (vec[j] < vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }

    }

    public void ordenaAlumnos() {

        // alumno[] vec = new alumno[5];
        alumno[] vec = llenaAlumnos();
        
        
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i].toString());
        }
        //Ordenamiento
        for (int i = 0; i < vec.length - 1; i++) {
            for (int j = 0; j < (vec.length - 1 - i); j++) {
                // if (vec[j].getEdad() > vec[j + 1].getEdad()) {
                if (vec[j].getNombre().compareTo(vec[j + 1].getNombre()) > 0) {
                    alumno aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i].toString());
        }

    }

    private alumno[] llenaAlumnos() {
        
        alumno[] vec = new alumno[5];
        
        vec[0] = new alumno("Juan", 15, 22333444);
        vec[1] = new alumno("Pedro", 16, 22233344);
        vec[2] = new alumno("Analia", 14, 22323434);
        vec[3] = new alumno("Silvia", 13, 22332443);
        vec[4] = new alumno("Juana", 17, 22533644);
        
        return vec;
        
    }
}
