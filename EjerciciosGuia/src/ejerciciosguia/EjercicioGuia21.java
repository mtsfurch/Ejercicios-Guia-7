/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matrizUno = new int[10][10];
        int[][] matrizDos = new int[3][3];
        cargaMatriz(matrizUno, 10);
        System.out.println("Matriz 1: ");
        muestraMatriz(matrizUno);
        System.out.println("Ingrese valores de Matriz 2");
        cargaMatrizManual(matrizDos, 3);
        matrizInterna(matrizUno, 10, matrizDos, 3);
    }

    public static void cargaMatrizManual(int[][] x, int car) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                x[i][j] = read.nextInt();
            }
        }
    }

    public static void cargaMatriz(int[][] x, int car) {
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                x[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    public static void muestraMatriz(int[][] x) {

        for (int[] fila : x) {
            String aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
    }

    public static void matrizInterna(int[][] x, int carUno, int[][] y, int carDos) {
        int contador, auxUno, auxDos;
        contador = auxUno = auxDos = 0;
        boolean retorno = true;
        for (int i = 0; i < 8; i++) {        //Se encarga de las filas de la matriz externa
            for (int j = 0; j < 8; j++) {   //Reorre las columnas de fila externa
                contador = 0;
                auxUno = 0;
                for (int k = i; k < i + 3; k++) {   //Recorre la fila de matriz interna
                    auxDos = 0;
                    for (int l = j; l < j + 3; l++) { //Recorre la columna de la matriz interna  
                        if (x[k][l] == y[auxUno][auxDos]) {  //Utilizo auxiliares uno y dos para poder comparar con la matriz mas chica
                            contador++;
                        }
                        auxDos++;
                    }
                    if (contador == 9) {
                        System.out.println("La matriz se encuentra a partir del indice " + i + "," + j);
                        retorno = false;
                    }
                    auxUno++;
                }
            }
        }
        if (retorno) {
            System.out.println("La matriz no se encuentra");
        }
    }
}
