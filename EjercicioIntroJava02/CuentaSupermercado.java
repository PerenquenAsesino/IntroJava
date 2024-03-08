package EjercicioIntroJava02;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class CuentaSupermercado {
    ArrayList<Producto> listaCompra;

    public CuentaSupermercado() {
        listaCompra = new ArrayList<>();

    }
    // AÑade productos a la lista de la compra
    public void addProducto(Producto producto) {
        listaCompra.add(producto);

    }
    // Calcula el precio total de la lista de la compra
    public float getTotal() {
        float total = 0;
        for (Producto producto : listaCompra) {
            total += producto.getPrecio();
        }
        return total;
    }
    // Imprime la lista de la compra detallada
    public void showTicket() {
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Producto", "Unidades", "Precio", "Total");
        System.out.println("--------------------------------------------------");
    
        // Crear lista auxiliar para unificar productos duplicados
        ArrayList<Producto> listaAux = new ArrayList<>();
    
        for (Producto producto : listaCompra) {
            if (!listaAux.contains(producto)) {
                listaAux.add(producto);
                int nUnidades = Collections.frequency(listaCompra, producto); // Se usa la clase utilitaria Collections para saber el numero de un mismo elemento en la lista

                System.out.printf("%-20s %-10s %-10s %-10s%n", producto.getNombre(), nUnidades, producto.getPrecio(), nUnidades * producto.getPrecio());
            }
        }
    
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s  %25s%n", "Precio total:", getTotal());
    }

        /*
         * La solucion planteada en el método showTicket(), no es la mejor, pero se implementa así, por una cuestión de cabezonería,
         * y tratar de resolver un problema que surgió inicialmente dándole vueltas a la lógica, en lugar de replantear la 
         * estructura de datos desde el principio (hubiera sido más sencillo con un HashMap).
         */
}
