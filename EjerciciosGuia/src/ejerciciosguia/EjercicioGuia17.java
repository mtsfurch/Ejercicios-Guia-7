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
public class EjercicioGuia17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contador, aux;

        System.out.println("Ingrese cantidad de numeros que desea cargar");
        int num = read.nextInt();
        int[] numeros = new int[num];
        System.out.println("Ingrese los numeros seguidos de Enter");
        for (int i = 0; i < num; i++) {
            numeros[i] = read.nextInt();
           
        }
             
        
        digitos(numeros, num);
    }

    public static void digitos(int[] x, int y) {
        int uno, dos, tres, cuatro, cinco, aux, cont;
        uno = dos = tres = cuatro = cinco = cont = 0;
        for (int i = 0; i < y; i++) {
            aux = x[i];
            do {
                aux = aux / 10;
                cont++;
            } while (aux != 0);
            switch (cont) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                default:
                    System.out.println("Supera cantidad maxima de digitos");
                    
            }
            cont=0;
        }
        System.out.println("Un digito: " + uno);
        System.out.println("Dos digitos: " + dos);
        System.out.println("Tres digitos: " + tres);
        System.out.println("Cuatro digitos: " + cuatro);
        System.out.println("Cinco digitos: " + cinco);
    }
    
    public static int vuelta(int x){
        int y=5;
        return y + x;
    }
}

