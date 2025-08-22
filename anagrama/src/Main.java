/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String palabra1;
    static String palabra2;

    Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        Main resultado = new Main();
        resultado.entrada();
    }

    public void entrada(){
        System.out.println("Ingresa la primer palabra");
        palabra1 = src.next().toLowerCase();

        System.out.println("Ingresa la segunda palabra");
        palabra2 = src.next().toLowerCase();

        System.out.println("¿Son anagramas?" + anagrama(palabra1, palabra2));
    }

    public boolean anagrama(String palabra1, String palabra2){
        // compara que ambas palabras contengan la misma longitud
        if (palabra1.length() != palabra2.length()){
            return false;
        }

        // valida si las palbras son iguales
        if (palabra1.equals(palabra2)){
            return false;
        }

        // Conversion de las cadenas en un array
        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();

        // Inicio de cada array
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compara los resultados del array
        return Arrays.equals(array1, array2);
    }
}