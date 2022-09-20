/*
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ejercicio_02.servicios;

import ejercicio_02.entidades.Circunferencia;
import java.util.Scanner;

public class ServiciosCircunferencia {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Usuario ingresa el radio
     *
     * @return radio
     */
    public Circunferencia crearCirfunferencia() {

        System.out.println("Ingresa el radio de la circunferencia");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);

    }

    /**
     *
     * @param radio
     * @return area
     */
    public double calcularArea(double radio) {
        double area = Math.PI *radio*radio;
        return area;
    }

    /**
     *
     * @param radio
     * @return perimetro
     */
    public double calcularPerimetro(double radio) {
        double perimetro = (2 * Math.PI * radio);
        return perimetro;
    }
}
