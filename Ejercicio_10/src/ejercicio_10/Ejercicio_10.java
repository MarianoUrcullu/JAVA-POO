/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

    public static void main(String[] args) {
        
        int [] vectorA = new int [50];
        int [] vectorB = new int [20];
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(vectorA));
        
        Arrays.sort(vectorA);
//        System.out.println(Arrays.toString(vectorA));
        for (int i = 0; i < vectorB.length; i++) {
            if(i<10){
                vectorB[i] = vectorA[i];
            } else{
                vectorB[i] = 5;
            }
        }
        System.out.println(Arrays.toString(vectorA));
        System.out.println(Arrays.toString(vectorB));
    }

}
