package EjercicioIntroJava03;

public class Empleado {
    private String nombre;
    private String apellidos;
    private float tarifaPorHora;

    public Empleado(String nombre, String apellidos, float tarifaPorHora) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarifaPorHora = tarifaPorHora;

    }

    // Metodos getters y setters
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

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Método para obtener el nombre completo
    public String nombreCompleto() {
        return getNombre() + " " + getApellidos();
    }

    // Método para obtener el tipo de trabajador
    public String tipo() {
        return "Normal";
    }

    // Sobrescribo el metodo toString para poder imprimir los metodos de todas las clases almacenadas en el programa Main
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s", nombreCompleto(), tipo(), getTarifaPorHora(), "0", "0", "0%");
    }

}



