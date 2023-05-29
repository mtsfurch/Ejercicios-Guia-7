/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
si se trata de una vocal. Caso contrario mostrar un mensaje.
 */
package ejerciciosguia1_extras;

import java.util.Scanner;

public class EjercicioGuia1_Extras3 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese letra");
        String letra=read.nextLine();
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")
                ||letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        }else System.out.println("La letra ingresada no es una vocal");
    }
    
}
