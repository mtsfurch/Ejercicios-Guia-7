/*
 *Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
 *generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
 *En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 *su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package ejerciciosguia1_extras;
import java.util.*;
public class EjercicioGuia1_Extras10 {
   
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num1,num2;
        num1=(int)(Math.random()*10+0);
        num2=(int)(Math.random()*10+0);
        int respuesta;
        System.out.println("Ingrese numero");
        respuesta=read.nextInt();
        while ((num1*num2)!= respuesta) {
            System.out.println("Numero equivocado, siga intentando");
            respuesta=read.nextInt();
        }
        System.out.println("Felicitaciones !! Encontro el numero "+num1+" * "+num2+" = "+(num1*num2));
    }
    
}
