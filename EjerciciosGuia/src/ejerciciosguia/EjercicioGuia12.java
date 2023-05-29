/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioGuia12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String lectura;
        int contador = 0;
        int correc = 0;
        do {
            System.out.println("Ingrese frase");
            lectura = read.nextLine();
            if (!(lectura.equals("&&&&&"))) {  //Solo ejecutara los controles si no ingreso el codigo de salida

                if (lectura.length() > 5) { //Para controlar el maximo de caracteres
                    System.out.println("Supera el maximo de caracteres");
                    contador++;
                    /*En el siguiente control se verifica si la primer letra es igual a X
                    y se la ultima es una O... Luego se niega todo para que ingrese de forma 
                    correcta al if.  Se utiliza el || porque conque una no se cumpla ya es suficiente
                    */
                } else if (!(lectura.substring(0, 1).equals("X") || lectura.substring(0, lectura.length() - 1).equals("O"))) {
                    System.out.println("La primera letra no es X o la ultima no es O");
                    contador++;
                } else {
                    correc++;
                }
            }
        } while (!(lectura.equals("&&&&&")));
        System.out.println("Cantidad de veces incorrecto " + contador);
        System.out.println("Cantidad de veces correcto " + correc);
    }
}
