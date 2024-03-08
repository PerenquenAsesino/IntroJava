package EjercicioIntroJava03;

public class EmpleadoPorComision extends Empleado {
    
    private float comision = 1.2f; // Comision fija del 20%

    public EmpleadoPorComision(String nombre, String apellidos, float tarifaPorHora, float comision) {
        super(nombre, apellidos, tarifaPorHora);
        this.comision = comision;
    }

    // Usa el método heredado tipo() sobrescribiendolo
    @Override
    public String tipo() {
        return "Por comisión";
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    // Sobrescribo el metodo toString para poder imprimir los metodos de todas las clases almacenadas en el programa Main
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s", nombreCompleto(), tipo(), getTarifaPorHora(), "0", "0", getComision()+"%");
    }
   
}
