/*
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.

e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.

f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.

g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio_08.servicios;

import ejercicio_08.entidades.Cadena;
import java.util.Scanner;

public class ServiciosCadenas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearFrase(Cadena c) {
        System.out.println("Ingrese una Frase");
        String frase = leer.next();
        c.setFrase(frase);
        int longitud = frase.length();
        c.setLongitud(longitud);
    }

    /**
     * deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
     *
     * @param c
     */
    public void mostrarVocales(Cadena c) {
        String frase = c.getFrase().toUpperCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < frase.length(); j++) {
            switch (frase.charAt(j)) {
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
        System.out.println("La frase tiene " + a + " vocales A");
        System.out.println("La frase tiene " + e + " vocales E");
        System.out.println("La frase tiene " + i + " vocales I");
        System.out.println("La frase tiene " + o + " vocales O");
        System.out.println("La frase tiene " + u + " vocales U");
    }

    /**
     * deberá invertir la frase ingresada y mostrarla por pantalla.
     *
     * @param c
     */
    public String invertirFrase(Cadena c) {
        String cadenaInvertida = "";
        for (int i = c.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + c.getFrase().charAt(i);
        }
        return cadenaInvertida;
    }

    /**
     * recibirá un carácter ingresado por el usuario y contabilizar cuántas
     * veces se repite el carácter en la frase
     *
     * @param c
     * @param letra
     */
    public void vecesRepetido(Cadena c, char letra) {
        String frase = c.getFrase();
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }

        }
        System.out.println("Se encontro ["+cont+"] veces");
    }

    /**
     * deberá comparar la longitud de la frase que compone la clase con otra
     * nueva frase ingresada por el usuario.
     *
     * @param c
     * @param nuevaFrase
     */
    public void compararLongitud(Cadena c, String nuevaFrase) {
        if (c.getLongitud() == nuevaFrase.length()) {
            System.out.println("Las Frases tienen la misma Longitud");
        } else {
            System.out.println("La Longitud de las frases es distinta");
        }
    }

    /**
     * deberá unir la frase contenida en la clase Cadena con una nueva frase
     * ingresada por el usuario y mostrar la frase resultante.
     *
     * @param c
     * @param nuevaFrase
     */
    public void unirFrases(Cadena c, String nuevaFrase) {
        String fraseConcatenada = c.getFrase().concat(" "+nuevaFrase);
        System.out.println("La Nueva Frase es " + fraseConcatenada);
    }

    /**
     * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
     * algún otro carácter seleccionado por el usuario y mostrar la frase
     * resultante.
     *
     * @param c
     * @param nuevaLetra
     */
    public void reemplazar(Cadena c, String nuevaLetra) {
        String nuevaFrase = c.getFrase().replace("a", nuevaLetra);
        System.out.println("La Nueva Frase "+nuevaFrase);
    }

    /**
     * deberá comprobar si la frase contiene una letra que ingresa el usuario y
     * devuelve verdadero si la contiene y falso si no.
     *
     * @param c
     * @param letra
     * @return resultado
     */
    public boolean contieneLetra(Cadena c, String letra) {
        boolean resultado = false;
        char aux;
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            aux = c.getFrase().charAt(i);

            resultado = letra.contains(String.valueOf(aux));

            if (resultado) {
                cont++;
            }
        }
        return resultado = (cont != 0) ? true: false; // resultado = (condicion) valor_Si : valor_Sino;
    }

}
