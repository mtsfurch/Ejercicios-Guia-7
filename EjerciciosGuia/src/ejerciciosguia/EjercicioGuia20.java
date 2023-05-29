package ejerciciosguia;
import java.util.Scanner;
public class EjercicioGuia20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz;
        System.out.println("Ingrese cardinalidad de la matriz");
        int car = read.nextInt();
        matriz = new int[car][car];
        cargaMatriz(matriz, car);
        System.out.println(magica(matriz,car));
    }

    public static void cargaMatriz(int[][] x, int car) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese valores de la matriz");
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                x[i][j] = read.nextInt();
                if (x[i][j] < 1 || x[i][j] > 9) {
                    do {

                        System.out.println("Ingrese numero entre 1 y 9");
                        x[i][j] = read.nextInt();
                    } while (x[i][j] < 1 || x[i][j] > 9);
                }

            }
        }
    }
    public static boolean magica(int[][] x, int car){
        int fi,col,diag;
        fi=col=diag=0;
        for(int fila[]: x){
            for(int elemento: fila){
               fi+=elemento; 
            }
        }
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
               col+=x[j][i]; 
            }
        }
        for (int i = 0; i < car; i++) {
            for (int j = 0; j < car; j++) {
                if(i==j){
                    diag+=x[i][j];
                }
            }
        }
        fi=fi/car;
        col=col/car;
        if((fi == col) && (fi == diag)){
            return true;
        }else return false;
        
    
}
}
    