/*
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar
 *la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
 *Al igual que en el ejercicio anterior los números negativos no deben sumarse.
 *Nota: recordar el uso de la sentencia break.
 */
package ejerciciosguia1_extras;

import java.util.*;

public class EjercicioGuia1_Extras8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros;
        int n, par, impar, contador;
        par = impar = contador = 0;
        System.out.println("Ingrese la cantidad de numeros que desea escanear");
        n = read.nextInt();
        numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numero");
            numeros[i] = read.nextInt();
            while (numeros[i] < 1) {
                System.out.println("Ingrese numeros mayores 0");
                numeros[i] = read.nextInt();
            }
            contador++;
            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (numeros[i] % 5 == 0) {
                break;
            }
        }
        System.out.println("Numeros analizados: " + contador);
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
    }
}
