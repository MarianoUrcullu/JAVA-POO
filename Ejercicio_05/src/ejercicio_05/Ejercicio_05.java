/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
 */
package ejercicio_05;

import ejercicio_05.entidades.Cuenta;
import ejercicio_05.servicios.ServicioCuenta;

public class Ejercicio_05 {

    public static void main(String[] args) {
        
        ServicioCuenta sc = new ServicioCuenta();
        
        Cuenta c1 = new Cuenta();
        
        sc.crearCuenta(c1);
        
        sc.ingresarSaldo(c1);
        System.out.println("Saldo "+c1.getSaldoActual());
        sc.retirarSaldo(c1);
        System.out.println("Saldo "+c1.getSaldoActual());
        sc.extraccionRapida(c1);
        System.out.println("Saldo "+c1.getSaldoActual());
    }
    
}
