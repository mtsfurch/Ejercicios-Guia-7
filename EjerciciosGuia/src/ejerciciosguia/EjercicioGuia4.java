
package ejerciciosguia;

import java.util.Scanner;


public class EjercicioGuia4 {
    public static void main (String[] args){
        Scanner read= new Scanner(System.in);
        double celcius;
        System.out.println("Ingrese los grados en celcius");
        celcius=read.nextDouble();
        System.out.println("El equivalente en Fahrenheit es: "+ (32 + (9 * celcius/ 5)));
    }
}
