
package ejerciciosguia;

import java.util.Scanner;

public class EjercicioGuia16 {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("ingrese tamaño de arreglo");
        int cantidad= read.nextInt();
        int[] vector=new int [cantidad];
        cargaVector(vector,cantidad);
        System.out.println("Ingrese el numero que desea buscar");
        int jaja=read.nextInt();
        busqueda(vector,cantidad,jaja);
        
    }
    public static void cargaVector(int[] x,int tam){
        for (int i = 0; i < tam; i++) {
                x[i]= (int)(Math.random()*50+1);
        }
    }
    public static void busqueda(int[] x,int tam,int busca){
        int contador=0;
        for (int i = 0; i < tam; i++) {
            if(x[i]==busca){
                contador++;
                System.out.println("El numero se encontro en la posicion "+i);
            }
        }
        System.out.println("Cantidad de veces encontrado: "+contador);
    }
}
