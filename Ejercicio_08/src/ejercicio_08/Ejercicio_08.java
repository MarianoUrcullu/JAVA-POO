/*
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada.
 */
package ejercicio_08;

import ejercicio_08.entidades.Cadena;
import ejercicio_08.servicios.ServiciosCadenas;
import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServiciosCadenas servicio = new ServiciosCadenas();
        
        Cadena c1 = new Cadena();
        
        servicio.crearFrase(c1);
        
        servicio.mostrarVocales(c1);
        
        System.out.println("Frase Invertida");
        System.out.println(servicio.invertirFrase(c1));
        
        System.out.println("Ingrese la Letra a contar");
        char letra = leer.next().charAt(0);
        servicio.vecesRepetido(c1, letra);
        
        System.out.println("Ingrese una Frase para Comparar la Longitud");
        String nuevaFrase = leer.next();
        servicio.compararLongitud(c1, nuevaFrase);
        
        System.out.println("Ingrese la Frase a Unir");
        nuevaFrase = leer.next();
        servicio.unirFrases(c1, nuevaFrase);
        
        System.out.println("Ingrese el Nuevo Caracter que reemplazara las [a] de la Frase");
        String nuevaLetra = leer.next();
        servicio.reemplazar(c1, nuevaLetra);
        
        System.out.println("Ingresa la Letra a buscar en la Frase");
        String caracter = leer.next();
        if (servicio.contieneLetra(c1, caracter)) {
            System.out.println("La Letra se Encontro");
        } else {
            System.out.println("No se pudo encontrar la Letra");
        }
    }
    
}
