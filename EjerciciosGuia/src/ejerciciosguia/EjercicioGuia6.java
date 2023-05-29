
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia6 {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
        int num1;
        System.out.println("Ingrese numero");
        num1=read.nextInt();
        if (num1%2 == 0) {
            System.out.println("El numero es par");
        }else System.out.println("El numero es impar");
    }
}
