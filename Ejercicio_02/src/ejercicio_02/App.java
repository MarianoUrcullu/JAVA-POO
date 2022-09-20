/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ejercicio_02;

import ejercicio_02.entidades.Circunferencia;
import ejercicio_02.servicios.ServiciosCircunferencia;

public class App {
    
    public static void main(String[] args) {
        
        ServiciosCircunferencia sc = new ServiciosCircunferencia();
        
        Circunferencia c1 = sc.crearCirfunferencia();
        
        System.out.println("El Area de la circunferencia es: " + sc.calcularArea(c1.getRadio()));
        System.out.println("El Perimetro de la circunferencia es: " + sc.calcularPerimetro(c1.getRadio()));
        
    }
    
}
