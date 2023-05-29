
package ejerciciosguia;

import java.util.Scanner;


public class EjercicioGuia3 {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase= read.nextLine();
        System.out.println("Su frase en mayusculas es: ");
        System.out.println(frase.toUpperCase());
        System.out.println("Su frase en minusculas es: ");
        System.out.println(frase.toLowerCase());
    }
}
