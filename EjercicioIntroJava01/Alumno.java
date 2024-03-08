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

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

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

    public void informarAsignaturas() {
        System.out.println("------------------------");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre() + ": " + asignatura.getNota());
        }
    }

    public void mostrarBoletin() {
        System.out.println("\nBoletín de notas de " + nombre + " " + apellidos);
        informarAsignaturas();
        System.out.println("------------------------");
        System.out.println("Nota media: " + calcularNotaMedia());
    }
}

