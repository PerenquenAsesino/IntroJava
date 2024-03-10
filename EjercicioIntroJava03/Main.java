package EjercicioIntroJava03;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>(); // Se crea la lista donde se almacenarán los objetos
        String nombre = ""; 
        String apellidos = ""; 
        
        String input = "a";

        // Primer bucle, donde se introducen nombre y apelidos del empleado (Atributos compartidos en todas las clases)
        while (!input.equals("*")) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Introduce cualquier tecla para introducir un nuevo empleado (* para salir): ");
            System.out.println("----------------------------------------------------------------------------");
            input = scanner.nextLine();
            if (input.equals("*")) {
                break;
            }
            System.out.println("Introduce el nombre del empleado: ");
            nombre = scanner.nextLine();

            System.out.println("Introduce los apellidos del empleado: ");
            apellidos = scanner.nextLine();
            

            // Segundo bucle, donde se introducen los atributos y propiedades especificas de cada clase
            while (true) {
                System.out.println("Introduce el tipo de empleado (normal, por horas, asalariado, por comision): ");
                String tipoEmpleado = scanner.nextLine();
    
                if (tipoEmpleado.equals("normal")) {
                    System.out.println("Introduce tarifa por hora del empleado: ");
                    float tarifaEmpleado = scanner.nextInt();
                    scanner.nextLine();
                    Empleado empleado = new Empleado(nombre, apellidos, tarifaEmpleado);    // Se crea instancia de Empleado
                    listaEmpleados.add(empleado);
                    break;

                } else if (tipoEmpleado.equals("por horas")) {
                    System.out.println("Introduce tarifa por hora del empleado: ");
                    float tarifaEmpleado = scanner.nextInt();
                    System.out.println("Introduce tarifa por hora extra del empleado: ");
                    float tarifaExtra = scanner.nextInt();
                    scanner.nextLine();
                    EmpleadoPorHora empleado = new EmpleadoPorHora(nombre, apellidos, tarifaEmpleado, tarifaExtra); // Se crea instancia de EmpleadoPorHora
                    listaEmpleados.add(empleado);
                    break;

                } else if (tipoEmpleado.equals("asalariado")) {
                    EmpleadoAsalariado empleado = new EmpleadoAsalariado(nombre, apellidos, 0, 2000);   // Se crea instancia de EmpleadoAsalariado
                    listaEmpleados.add(empleado);
                    break;

                } else if (tipoEmpleado.equals("por comision")) {
                    System.out.println("Introduce comisión  por ventas del empleado: ");
                    float tarifaComision = scanner.nextInt();
                    scanner.nextLine();
                    EmpleadoPorComision empleado = new EmpleadoPorComision(nombre, apellidos, 0, tarifaComision);   // Se crea instancia de EmpleadoPorComision
                    listaEmpleados.add(empleado);
                    break;

                } else {
                    System.out.println("Tipo de empleado no válido. Inténtalo nuevamente con las opciones disponibles (normal, por horas, asalariado, por comision).");
                }

            } 
        }
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n" , "Nombre", "Tipo Empleado", "Tarifa Hora", "Tarifa H.Extra", "Salario Fijo", "Porcentaje");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        // En este for, se impirmen los objetos almacenados, a través del método toString implementado en cada clase
        for (Empleado empleado: listaEmpleados) {
            System.out.println(empleado);
        }
    }
}

