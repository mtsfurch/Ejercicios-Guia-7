/*
 *Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
 *realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
 *Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
 *este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package ejerciciosguia1_extras;
import java.util.*;
public class EjercicioGuia1_Extras9 {

    public static void main(String[] args) {
        Scanner read =new Scanner (System.in);
        System.out.println("Ingrese dividendo");
        int dividendo=read.nextInt();
        System.out.println("Ingrese dividor(no puede ser mayor al dividendo)");
        int divisor=read.nextInt();
        while (divisor>dividendo) {
            System.out.println("Ingrese nuevamente por numero menor");
            divisor=read.nextInt();
        }
        division(dividendo,divisor);
    }
    public static void division(int x,int y){
        int cociente=0;
        while(x>=y){
            x-=y;
            cociente++;
        }
        System.out.println("El cociente es: "+cociente+" y el residuo es: "+x);
    }
}
