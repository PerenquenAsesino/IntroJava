package EjercicioIntroJava01;

public class Main {
    public static void main(String[] args) {

        // Se crea una instancia de tipo Alumno, para luego añadirle asignaturas
        Alumno alumno1 = new Alumno("Wenceslao", "Bethencourt");
        
        alumno1.agregarAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno1.agregarAsignatura(new Asignatura("Historia", 7.0));
        alumno1.agregarAsignatura(new Asignatura("Física", 9.2));
        alumno1.agregarAsignatura(new Asignatura("Filosofía", 9.0));
        alumno1.agregarAsignatura(new Asignatura("Religión", 5.0));
        alumno1.agregarAsignatura(new Asignatura("Lengua", 10.0));


        // Se llama al método mostrarBoletin para mostrar en pantalla el boletín de la instancia alumno1
        alumno1.mostrarBoletin();
    }
}