/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
 *Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
 *Calcular la cantidad de dígitos matemáticamente 
 *utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package ejerciciosguia1_extras;
import java.util.*;
public class EjercicioGuia1_Extras11 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num=read.nextInt();
        String cadena=String.valueOf(num);
        System.out.println("La cantidad de digitos del numero es: " + cadena.length());
    }
    
}
