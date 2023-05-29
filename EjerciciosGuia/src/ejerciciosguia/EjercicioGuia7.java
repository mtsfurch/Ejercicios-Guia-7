
package ejerciciosguia;

import java.util.Scanner;


public class EjercicioGuia7 {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else System.out.println("Incorrecto");
    }
}
