/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio_06.servicios;

import ejercicio_06.entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Creamos la Cafetera
     *
     * @param cafetera
     */
    public void crearCafetera(Cafetera cafetera) {
        System.out.println("Ingrese la Capacidad Maxima de la Cafetera [mL]");
        int capacidadMax = leer.nextInt();
        cafetera.setCapacidadMax(capacidadMax);
        cafetera.setCantidadActual(0);
    }

    /**
     * Hace que la cantidad actual sea igual a la capacidad máxima.
     *
     * @param cafetera
     */
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMax());
        System.out.println("La cafetera esta llena");
    }

    /**
     * Se pide el tamaño de una taza vacía, el método recibe el tamaño de la
     * taza y simula la acción de servir la taza con la capacidad indicada. Si
     * la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo
     * que quede. El método le informará al usuario si se llenó o no la taza, y
     * de no haberse llenado en cuanto quedó la taza.
     *
     * @param cafetera
     */
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese el tamaño de la Taza");
        int taza = leer.nextInt();

        int cantidadActual = cafetera.getCantidadActual();
        int calculo = cantidadActual - taza;

        if (cantidadActual < taza) {
            System.out.println("No se logro llenar la Taza ya que la cantidad de cafe es de " + cantidadActual);
            System.out.println("Faltaron " + Math.abs(calculo) + " mL para poder llenar la taza");
            cafetera.setCantidadActual(0);
        } else if (cantidadActual == taza) {
            System.out.println("La Taza se ha llenado");
            System.out.println("La cafetera quedo vacia");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("La Taza se ha llenado");
            System.out.println("Queda " + calculo + " mL de cafe");
            cafetera.setCantidadActual(calculo);
        }
    }

    /**
     * Pone la cantidad de café actual en cero.
     *
     * @param cafetera
     */
    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("La Cafetera se encuentra vacia");
        cafetera.setCantidadActual(0);
    }

    /**
     * se le pide al usuario una cantidad de café, el método lo recibe y se
     * añade a la cafetera la cantidad de café indicada.
     *
     * @param cafetera
     */
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        int cantidad = leer.nextInt();

        int cantidadActual = cafetera.getCantidadActual();
        int carga = cantidadActual + cantidad;

        if (carga < cafetera.getCapacidadMax()) {
            cafetera.setCantidadActual(carga);
            System.out.println("Se agregaron " + cantidad + " mL de Cafe");
            System.out.println("La Cantidad Actual de la cafetera es de " + cafetera.getCantidadActual() + " mL de Cafe");
        } else {
            System.out.println("ERROR | La cantidad que desea agregar supera la Capacidad Maxima");
            System.out.println("La cantidad Actual es de " + cafetera.getCantidadActual());
            System.out.println("La cantidad Maxima es de " + cafetera.getCapacidadMax());
        }
    }

}
