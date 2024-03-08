package EjercicioIntroJava02;

public class Main {
    public static void main(String[] args) {

        // Se crea varias instancias de productos 
        Producto distergen = new Producto("Distergen", 5);
        Producto fairy = new Producto("Fairy", 10);
        Producto donLimpio = new Producto("Don Limpio", 15);
        Producto viakal = new Producto("Viakal", 7);
        Producto K9 = new Producto("K9", 12);
        Producto vitroclean = new Producto("Viotroclean", 2);
        Producto mistol = new Producto("Mistol", 3);
        Producto sanitol = new Producto("Sanitol", 6);
        Producto lejiaConejo = new Producto("Lejía Conejo", 2);

        // Se crea una instacia de CuentaSupermercado y se le añaden productos
        CuentaSupermercado n1 = new CuentaSupermercado();
        n1.addProducto(distergen);
        n1.addProducto(distergen);
        n1.addProducto(fairy);
        n1.addProducto(donLimpio);
        n1.addProducto(viakal);
        n1.addProducto(lejiaConejo);
        n1.addProducto(lejiaConejo);
        n1.addProducto(lejiaConejo);


        // Se aplica el método showTicket para imprimir el ticket final
        n1.showTicket();
    }
}
