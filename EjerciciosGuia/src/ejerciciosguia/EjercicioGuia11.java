/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioGuia11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1=read.nextInt();
        int num2=read.nextInt();
        int opc;
        String resp="N";
        do {
            System.out.println("Menu");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            opc=read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La sumatoria de ambos numeros es "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de ambos numeros es "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de ambos numeros es "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La division del numero" + num1 +" por el numero " + num2 +" es " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? S/N");
                    resp=read.next();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!(resp.equals("S")));
        
    }
}
