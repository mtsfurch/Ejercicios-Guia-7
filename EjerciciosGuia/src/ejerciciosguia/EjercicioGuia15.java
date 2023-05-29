
package ejerciciosguia;

import java.util.Scanner;


public class EjercicioGuia15 {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int[] numero = new int[100];
        for (int i = 0; i < 100; i++) {
            numero[i]=i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
