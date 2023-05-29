package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1,num2,resultado;
        System.out.println("Ingrese numero ");
        num1 = read.nextInt();
        System.out.println("Ingrese siguiente numero");
        num2=read.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es "+resultado);
    }
    
}
