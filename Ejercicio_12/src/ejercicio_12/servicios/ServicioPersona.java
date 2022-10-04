/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). 

• Escribir un método calcularEdad()

• Agregar a la clase el método menorQue(int edad) 

• Metodo mostrarPersona(): 
 */
package ejercicio_12.servicios;

import ejercicio_12.entidades.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Este método rellena el objeto mediante un Scanner y le pregunta al
     * usuario el nombre y la fecha de nacimiento de la persona a crear,
     * recordemos que la fecha de nacimiento debe guardarse en un Date y los
     * guarda en el objeto.
     *
     * @return
     */
    public Persona crearPersona() {
        System.out.println("Ingrese Nombre");
        String nombre = leer.next();

        System.out.println("Ingrese Apellido");
        String apellido = leer.next();

        System.out.println("\nIngrese Fecha de Nacimiento");
        System.out.println("Año: ");
        int anio = Integer.parseInt(leer.next());

        System.out.println("Mes: ");
        int mes = Integer.parseInt(leer.next());

        System.out.println("Dia: ");
        int dia = Integer.parseInt(leer.next());
        
        System.out.println();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        return new Persona(nombre, apellido, fechaNacimiento);
    }

    /**
     * a partir de la fecha de nacimiento ingresada. Tener en cuenta que para
     * conocer la edad de la persona también se debe conocer la fecha actual.
     *
     * @param p
     * @return calcularEdad
     */
    public int calcularEdad(Persona p) {
        LocalDate fechaNacimiento = p.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();

        int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);

        return calcularEdad;
    }

    /**
     * que recibe como parámetro otra edad y retorna true en caso de que el
     * receptor tenga menor edad que la persona que se recibe como parámetro, o
     * false en caso contrario.
     *
     * @param p
     * @param edad
     * @return esMenor
     */
    public boolean monerQue(Persona p, int edad) {
        boolean esMenor = false;

        int edadPersona = calcularEdad(p);

        if (edadPersona < edad) {
            esMenor = true;
        } else {
            esMenor = false;
        }

        return esMenor;
    }

    /**
     * este método muestra la persona creada en el método anterior.
     *
     * @param p
     */
    public void mostrarPersona(Persona p) {
        System.out.println("\n========================");
        System.out.println(p.toString());
        System.out.println("========================");
    }

}
