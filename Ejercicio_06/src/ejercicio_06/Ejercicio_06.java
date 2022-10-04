/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
 */
package ejercicio_06;

import ejercicio_06.entidades.Cafetera;
import ejercicio_06.servicios.ServicioCafetera;

public class Ejercicio_06 {

    public static void main(String[] args) {

        ServicioCafetera sc = new ServicioCafetera();

        Cafetera c1 = new Cafetera();

        sc.crearCafetera(c1);
        
        sc.llenarCafetera(c1);

        sc.servirTaza(c1);

        sc.vaciarCafetera(c1);

        sc.agregarCafe(c1);

    }

}
