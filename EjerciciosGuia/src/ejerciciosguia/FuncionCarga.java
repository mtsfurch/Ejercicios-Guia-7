/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import static java.rmi.server.ObjID.read;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class FuncionCarga {
    public static void main(String[] args){
        Scanner read;
        read = new Scanner(System.in);
    }
    public static void cargaVector(int[] x,int tam){
        Scanner read=new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
                x[i]= read.nextInt();
        }
    }
    public static void cargaMatriz(int[][] x,int car){
        Scanner read=new Scanner(System.in);
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                x[i][j]= read.nextInt();
            }
        }
    }
    public static void muestraMatriz(int [][] x,int car){
        String aux="";
        for(int[] fila: x){
            for(int elemento: fila){
                aux+= "  " + elemento;
            }
            System.out.println(aux);
        }
    }
}
