/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;


public class EjercicioGuia18 {
    public static void main (String[] args){
        Scanner read= new Scanner(System.in);
        String aux;
        int[][] matriz=new int[4][4];
        int[][] trans =new int[4][4];
        
        //Carga la matriz de forma aleatoria
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*100+1);
            }
        }
        //Carga la transversa
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               trans[i][j]=matriz[j][i]; 
            }
        }
        //Muestra la matriz
        for (int fila[]: matriz) {
            aux="";
            for(int elemento: fila){
            aux+= "  " + elemento;
        }System.out.println(aux);
        }
        System.out.println("");
        //muestra la transversa
        for (int fila[]: trans) {
            aux="";
            for(int elemento: fila){
            aux+= "  " + elemento;
        }System.out.println(aux);
        }
    }
}
