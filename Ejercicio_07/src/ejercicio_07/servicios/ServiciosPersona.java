/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package ejercicio_07.servicios;

import ejercicio_07.entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona p) {
        System.out.println("Ingrese el Nombre");
        String nombre = leer.next();
        p.setNombre(nombre);

        System.out.println("Ingrese la Edad");
        int edad = leer.nextInt();
        p.setEdad(edad);

        do {
            System.out.println("Ingrese el Sexo ('H' hombre, 'M' mujer, 'O' otro)");
            String sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                p.setSexo(sexo);
            } else {
                System.out.println("ERROR | Sexo Incorrecto");
                p.setSexo("");
            }
        } while (p.getSexo().equals(""));

        System.out.println("Ingrese el peso");
        double peso = Double.parseDouble(leer.next());
        p.setPeso(peso);

        System.out.println("Ingrese la Altura");
        double altura = Double.parseDouble(leer.next());
        p.setAltura(altura);

    }

    public int calcularIMC(Persona p) {
        double peso = p.getPeso();
        double altura = p.getAltura();
        double imc = (peso / altura * altura);

        int respuesta;
        if (imc < 20) {
            respuesta = -1;
            System.out.println(p.getNombre() + " Se encuentra por debajo de su peso ideal");
        } else {
            if (imc > 20 && imc < 25) {
                respuesta = 0;
                System.out.println(p.getNombre() + " Se encuentra en su peso ideal");
            } else {
                respuesta = 1;
                System.out.println(p.getNombre() + " Se encuentra por encima de su peso ideal");
            }
        }
        return respuesta;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean esMayor = false;
        int edad = p.getEdad();
        if (edad >= 18) {
            esMayor = true;
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " es menor de edad");
        }
        return esMayor;
    }

}
