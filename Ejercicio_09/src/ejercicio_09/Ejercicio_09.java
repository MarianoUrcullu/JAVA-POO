/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. 
 */
package ejercicio_09;

import ejercicio_09.entidades.Matematica;
import ejercicio_09.servicios.ServiciosMatematicas;

public class Ejercicio_09 {

    public static void main(String[] args) {
        
        ServiciosMatematicas servicios = new ServiciosMatematicas();
        
        Matematica m = new Matematica();
        
//        m.setNum1(Math.random()*10+1);
//        m.setNum2(Math.random()*10+1);
        
        servicios.crearNum(m);
        
        System.out.println("El mayor entre los 2 es ["+servicios.devolverMayor(m)+"]");
        servicios.calcularPot(m);
        servicios.calculaRaiz(m);
        
    }
    
}
