/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio_05.servicios;

import ejercicio_05.entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * Creamos la cuenta y le ingresamos los datatos
     * @param cuenta 
     */
    public void crearCuenta(Cuenta cuenta){
        System.out.println("Ingrese el Numero de Cuenta");
        cuenta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI");
        cuenta.setDNI(leer.nextLong());
        System.out.println("Ingrese el Saldo Actual");
        cuenta.setSaldoActual(leer.nextInt());
    }
    /**
     * Ingresamos saldo y lo agregamos a saldo
     * @param cuenta 
     */
    public void ingresarSaldo(Cuenta cuenta){
        System.out.println("Ingrese el Saldo que desea Ingresar");
        int ingreso = leer.nextInt();
        int nuevoSaldo = cuenta.getSaldoActual()+ingreso;
        cuenta.setSaldoActual(nuevoSaldo);
    }
    /**
     * Creamos una variable retirar que se resta al saldo actual
     * @param cuenta 
     */
    public void retirarSaldo(Cuenta cuenta){
        System.out.println("Ingrese la cantidad de dinero que desea Retirar");
        int retirar = leer.nextInt();
        if (cuenta.getSaldoActual()>retirar) {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retirar);
        } else {
            System.out.println("El monto a Retirar es mayor al Saldo Actual");
        }
    }
    /**
     * Retiramos el 20% del saldo (validando si se puede realizar)
     * @param cuenta 
     */
    public void extraccionRapida(Cuenta cuenta){
        int saldo = cuenta.getSaldoActual();
        double extraccion = saldo*0.2;
        
        if (extraccion < saldo && saldo >0) {
            saldo -= extraccion;
            cuenta.setSaldoActual(saldo);
            System.out.println("Ha retirado el 20% de su dinero ["+extraccion+"].");
            System.out.println("Su saldo actual es de ["+saldo+"]");
        } else {
            System.out.println("ERROR | No se pudo realizar la operacion");
        }
    }
    
    
}
