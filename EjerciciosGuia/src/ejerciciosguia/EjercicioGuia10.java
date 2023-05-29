/*
Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero limite");
        int max=read.nextInt();
        int num1,num2;
        num1=0;
        do {
            System.out.println("Ingrese numero a sumar");
            num2=read.nextInt();
            num1=num1 + num2;
        } while (num1<=max);
        System.out.println("Se supero el numero maximo "+max);
        System.out.println("El valor de la sumatoria fue "+num1);
    }
}
