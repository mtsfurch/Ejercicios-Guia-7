/*
 * Leer la altura de N personas y determinar el promedio
 * de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejerciciosguia1_extras;
import java.util.Scanner;
public class EjercicioGuia1_Extras6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contador=0;
        double promedio=0.0;
        System.out.println("Ingrese cantidad de personas");
        int N = read.nextInt();
        double[] estatura=new double [N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese estatura de persona: " +(i+1));
            estatura[i]=read.nextDouble();
            promedio+=estatura[i];
            if (estatura[i]<1.61) {
                contador++;
            }
        }
        System.out.println(contador + " Personas no superan 1.6mts");
        System.out.print("El promedio de estaturas es de: ");
        System.out.printf("%1.2f",(promedio/N));
    }
    
}
