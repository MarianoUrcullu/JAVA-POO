/*
Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio_09.servicios;

import ejercicio_09.entidades.Matematica;
import java.util.Scanner;

public class ServiciosMatematicas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearNum(Matematica m) {
//        double num1 = (Math.random() * 10);
//        m.setNum1(num1);
//        double num2 = (Math.random() * 10);
//        m.setNum2(num2);
        m.setNum1((Math.random()*10+1));
        m.setNum2((Math.random()*10+1));
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        System.out.println("    NUMEROS CREADOS    ");
    }

    /**
     * para retornar cuál de los dos atributos tiene el mayor valor
     *
     * @param m
     */
    public double devolverMayor(Matematica m) {
//        double num1 = m.getNum1();
//        double num2 = m.getNum1();
        
//        if (num1 > num2) {
//            System.out.println("El num1 es el Mayor [" + num1 + "]");
//        } else if (num2 > num1) {
//            System.out.println("El num2 es el Mayor [" + num2 + "]");
//        } else {
//            System.out.println("Los Numeros son Iguales");
//            System.out.println("Num1 = [" + num1 + "] Num2 = [" + num2);
//        }

        double a = Math.max(m.getNum1(), m.getNum2());
        return a;
    }

    /**
     * para calcular la potencia del mayor valor de la clase elevado al menor
     * número. Previamente se deben redondear ambos valores.
     *
     * @param m
     */
    public void calcularPot(Matematica m) {
//        double potencia = 0;
//        double num1 = m.getNum1();
//        num1 = Math.round(num1);
//        double num2 = m.getNum2();
//        num2 = Math.round(num2);
//
//        if (num1 > num2) {
//            potencia = Math.pow(num1, num2);
//            System.out.println("La Potencia del Num Mayor es: [" + potencia + "]");
//        } else if (num2 > num1) {
//            potencia = Math.pow(num2, num1);
//            System.out.println("La Potencia del Num Mayor es: [" + potencia + "]");
//        } else {
//            System.out.println("[ERROR] Los Numeros son Iguales");
//        }
        double mayor = Math.round(Math.max(m.getNum1(), m.getNum2()));
        double menor = Math.round(Math.min(m.getNum1(), m.getNum2()));
        System.out.println("La Potencia del meyor elevado al menor es ["+Math.pow(mayor, menor));
    }

    /**
     * Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos
     * valores. Antes de calcular la raíz cuadrada se debe obtener el valor
     * absoluto del número.
     *
     * @param m
     */
    public void calculaRaiz(Matematica m) {
//        double raiz = 0;
//        double num1 = m.getNum1();
//        num1 = Math.abs(num1);
//        double num2 = m.getNum2();
//        num2 = Math.abs(num2);
//
//        if (num1 < num2) {
//            raiz = Math.sqrt(num1);
//            System.out.println("La Raiz de [" + num1 + "] es [" + raiz + "]");
//        } else if (num2 < num1) {
//            raiz = Math.sqrt(num2);
//            System.out.println("La Raiz de [" + num2 + "] es [" + raiz + "]");
//        } else {
//            System.out.println("[ERROR] Los Numeros son Iguales");
//        }

        double mayor = Math.abs(Math.max(m.getNum1(), m.getNum2()));
        double menor = Math.abs(Math.min(m.getNum1(), m.getNum2()));
        System.out.println("La Raiz del Menor es ["+Math.sqrt(menor));
    }

}
