package EjercicioIntroJava01;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "Pérez");
        alumno1.agregarAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno1.agregarAsignatura(new Asignatura("Historia", 7.0));
        alumno1.agregarAsignatura(new Asignatura("Física", 9.2));

        alumno1.mostrarBoletin();
    }
}