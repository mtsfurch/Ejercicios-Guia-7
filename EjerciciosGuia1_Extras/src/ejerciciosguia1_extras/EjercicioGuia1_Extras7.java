/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosguia1_extras;
import java.util.*;
public class EjercicioGuia1_Extras7 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int N,max,min,index;
        max=min=0;
        double promedio=0.0;
        System.out.println("Ingrese cantidad de numeros que desea evaluar");
        N=read.nextInt();
        index=N;
        int[] numeros=new int[N];
        /*
        while (index>0) {
            System.out.println("Ingrese numero");
            numeros[index-1]=read.nextInt();
            if (index==N) {
                max=numeros[index-1];
                min=numeros[index-1];
            }else if (numeros[index-1]>max) {
                max=numeros[index-1];
            }else if (numeros[index-1]<min) {
                min=numeros[index-1];
            }
            promedio+=numeros[index-1];
            index--;
        }
        */
        
        do {
            System.out.println("Ingrese numero");
            numeros[index-1]=read.nextInt();
            if (index==N) {
                max=numeros[index-1];
                min=numeros[index-1];
            }else if (numeros[index-1]>max) {
                max=numeros[index-1];
            }else if (numeros[index-1]<min) {
                min=numeros[index-1];
            }
            promedio+=numeros[index-1];
            index--;
        } while (index>0);
        
        System.out.println("El mayor numero es el: "+max);
        System.out.println("El menor numero es el: "+min);
        System.out.print("El promedio es de: ");
        System.out.printf("%1.2f",(promedio/N));
    }
    
}
