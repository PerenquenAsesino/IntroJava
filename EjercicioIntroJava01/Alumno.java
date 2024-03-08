package EjercicioIntroJava01;
import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String nombre;
    private String apellidos;
    private List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignaturas = new ArrayList<>();
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método para guardar asignaturas con sus datos en el ArrayList
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Método para calcular la nota media de las asignaturas almacenadas
    public double calcularNotaMedia() {
        if (asignaturas.isEmpty()) {
            return 0.0;
        }

        double sumaNotas = 0.0;
        for (Asignatura asignatura : asignaturas) {
            sumaNotas += asignatura.getNota();
        }
        return sumaNotas / asignaturas.size();
    }

    // Método para imprimir el nombre y la nota de las asignaturas almacenadas en el ArrayList
    public void informarAsignaturas() {
        System.out.println("------------------------");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre() + ": " + asignatura.getNota());
        }
    }

    // Método para imprimir el boletín, con todos los datos sobre el alumno y sus asignaturas
    public void mostrarBoletin() {
        System.out.println("\nBoletín de notas de " + nombre + " " + apellidos);
        informarAsignaturas();
        System.out.println("------------------------");
        System.out.println("Nota media: " + calcularNotaMedia());
    }
}

