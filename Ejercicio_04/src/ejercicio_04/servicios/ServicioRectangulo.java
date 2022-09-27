/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio_04.servicios;

import ejercicio_04.entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la Base del Rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la Altura del Rectangulo");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);
    }

    public int calcularSuperficie(int base, int altura) {
        int superficie = base * altura;
        return superficie;
    }

    public int calcularPerimetro(int base, int altura) {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo(Rectangulo r){
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i==0 || i==r.getAltura()-1) {
                    System.out.print(" *");
                } else if (j==0 || j==r.getBase()-1){
                    System.out.print(" *");
                } else{
                    System.out.print("  ");
                }
 
            }
            System.out.println("");
        }
    }

}
