/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz, matrizDos;
        System.out.println("Ingrese cardinalidad de las matrices");
        int car = read.nextInt();
        matriz = new int[car][car];
        matrizDos = new int[car][car];
        System.out.println("Ingrese valores de primera matriz");
        //carga
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                matriz[i][j] = read.nextInt();
            }  
        }
        System.out.println("Ingrese valores de segunda matriz");
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                matrizDos[i][j] = read.nextInt();
            }
        }
        //Controla
        boolean retorno=false;
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                if ((matriz[i][j] * (-1)) == matrizDos[i][j]) {
                    retorno = true;
                } else {
                    retorno = false;
                    break;}
            }
        }
        System.out.println(retorno);
    }
}

/*
    public static void cargaMatriz(int[][] x, int car) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                x[i][j] = read.nextInt();
            }
        }
    }

    public static boolean trans(int[][] x, int[][] y, int car) {
        Scanner read = new Scanner(System.in);
        boolean retorno=false;
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                if ((x[i][j] * (-1)) == y[i][j]) {
                    retorno = true;
                } else {
                    retorno = false;
                    break;
                }

            }
        }
        return retorno;
    }
*/