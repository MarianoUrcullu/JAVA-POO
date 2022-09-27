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
package ejercicio_04;

import ejercicio_04.entidades.Rectangulo;
import ejercicio_04.servicios.ServicioRectangulo;

public class Ejercicio_04 {

    public static void main(String[] args) {
        
        ServicioRectangulo sr = new ServicioRectangulo();
        
        Rectangulo r1 = sr.crearRectangulo();
        
        int superf = sr.calcularSuperficie(r1.getBase(), r1.getAltura());
        System.out.println("La Superficie del Rectangulo es: "+superf);
        
        int perim = sr.calcularPerimetro(r1.getBase(), r1.getAltura());
        System.out.println("El Perimetro del Rectangulo es: "+perim);
        
        sr.dibujarRectangulo(r1);
        
    }
    
}
