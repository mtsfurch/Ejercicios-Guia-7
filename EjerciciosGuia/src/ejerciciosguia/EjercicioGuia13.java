
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia13 {
    public static void main (String[] args){
        Scanner read= new Scanner (System.in);
        System.out.println("Ingrese tamaño de cuadrado");
        int tamano=read.nextInt();
        
        for (int i = 0; i < tamano; i++) {
            if ((i == 0)||(i == tamano-1)) {
                for (int j = 0; j < tamano; j++) {
                    System.out.print("* ");
                }   
                System.out.println("");
            }else {
                System.out.print("* ");
                for (int j = 0; j < tamano; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                    
                }
            }
        }
}
