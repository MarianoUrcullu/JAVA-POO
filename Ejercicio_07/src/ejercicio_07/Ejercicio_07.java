/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ejercicio_07;

import ejercicio_07.entidades.Persona;
import ejercicio_07.servicios.ServiciosPersona;

public class Ejercicio_07 {

    public static void main(String[] args) {
        
        ServiciosPersona servicio = new ServiciosPersona();
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        servicio.crearPersona(p1);
        servicio.crearPersona(p2);
        servicio.crearPersona(p3);
        servicio.crearPersona(p4);
        
        servicio.calcularIMC(p1);
        servicio.calcularIMC(p2);
        servicio.calcularIMC(p3);
        servicio.calcularIMC(p4);
        
        servicio.esMayorDeEdad(p1);
        servicio.esMayorDeEdad(p2);
        servicio.esMayorDeEdad(p3);
        servicio.esMayorDeEdad(p4);
        
    }
    
}
