/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
 */
package ejercicio_03;

import ejercicio_03.entidades.Operacion;
import ejercicio_03.servicios.ServiciosOperacion;

public class Ejercicio_03 {

    public static void main(String[] args) {

        ServiciosOperacion so = new ServiciosOperacion();

        Operacion op = so.crearOperacion();

        System.out.println("La suma de los numeros es: " + so.sumar(op.getNum1(), op.getNum2()));
        System.out.println("La resta de los numeros es: " + so.restar(op.getNum1(), op.getNum2()));
        System.out.println("La multiplicacion de los numeros es: " + so.multiplicar(op.getNum1(), op.getNum2()));
        System.out.println("La division de los numeros es: " + so.dividir(op.getNum1(), op.getNum2()));
    }

}
