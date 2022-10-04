/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio_11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("Hay ["+ChronoUnit.YEARS.between(fechaNacimiento, fechaActual)+"] años de diferencia");
        System.out.println("Fecha de Nacimiento ["+fechaNacimiento.toString()+"]");
        System.out.println("Fecha Actual ["+fechaActual.toString()+"]");
    }

}
