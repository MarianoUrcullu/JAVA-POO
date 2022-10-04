/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 */
package ejercicio_12;

import ejercicio_12.entidades.Persona;
import ejercicio_12.servicios.ServicioPersona;

public class Ejercicio_12 {

    public static void main(String[] args) {

        ServicioPersona servicio = new ServicioPersona();

        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();

        System.out.println("\n" + p1.getNombre() + " tiene " + servicio.calcularEdad(p1) + " años");
        System.out.println("\n" + p2.getNombre() + " tiene " + servicio.calcularEdad(p2) + " años");

        if (servicio.monerQue(p1, servicio.calcularEdad(p2)) == true) {
            System.out.println("\n" + p1.getNombre() + " es menor que " + p2.getNombre());
        } else {
            System.out.println("\n" + p2.getNombre() + " es menor que " + p1.getNombre());
        }

    }

}
