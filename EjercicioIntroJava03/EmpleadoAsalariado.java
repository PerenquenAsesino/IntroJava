package EjercicioIntroJava03;

public class EmpleadoAsalariado extends Empleado {
    
    private float salarioMensual = 2000;

    public EmpleadoAsalariado(String nombre, String apellidos, float tarifaPorHora, float salarioMensual) {
        super(nombre, apellidos, tarifaPorHora);
        this.salarioMensual = salarioMensual;
    }

    // Usa el método heredado tipo() sobrescribiendolo
    @Override
    public String tipo() {
        return "Asalariado";
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // Sobrescribo el metodo toString para poder imprimir los metodos de todas las clases almacenadas en el programa Main
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s", nombreCompleto(), tipo(), getTarifaPorHora(), "0", getSalarioMensual(), "0%");
    }

}