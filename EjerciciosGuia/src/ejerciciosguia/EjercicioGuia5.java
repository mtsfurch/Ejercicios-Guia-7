
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia5 {
    public static void main(String[] args){
        Scanner read= new Scanner (System.in);
        int numero;
        System.out.println("Ingrese numero");
        numero=read.nextInt();
        System.out.println("El doble del numero es: " + (numero*2));
        System.out.println("El triple del numero es: " + (numero*3));
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(numero));
    }
}
