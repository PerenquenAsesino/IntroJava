package EjercicioIntroJava03;

public class EmpleadoPorHora extends Empleado {
    
    private float tarifaHorasExtra;

    public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHorasExtra) {
        super(nombre, apellidos, tarifaPorHora);
        this.tarifaHorasExtra = tarifaHorasExtra;
    }


    // Usa el método heredado tipo() sobrescribiendolo
    @Override
    public String tipo() {
        return "Por horas";
    }


    public float getTarifaHorasExtra() {
        return tarifaHorasExtra;
    }


    public void setTarifaHorasExtra(float tarifaHorasExtra) {
        this.tarifaHorasExtra = tarifaHorasExtra;
    }

    // Sobrescribo el metodo toString para poder imprimir los metodos de todas las clases almacenadas en el programa Main
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s", nombreCompleto(), tipo(), getTarifaPorHora(), getTarifaHorasExtra(), "0", "0%");
    }

}






