/*
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 *a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
 *Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
 *Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
 *Finalmente imprima por pantalla la sopa de letras creada.
 *Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(),
 *Length() y Math.random().
 */
package ejerciciosguia1_extras;

import java.util.*;

public class EjercicioGuia1_Extras23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int index = 0;
        String[] palabras = new String[5];
        char[][] sopaDeLetras = new char[20][20];
        //Pedir las 5 palabras al usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingresar palabra con 3 caracteres min y maximo 5");
            palabras[i] = read.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("Intente nuevamente. 3 min, 5 max");
                palabras[i] = read.nextLine();
            }
        }
        //Crear sopa de letras

        do {
            boolean superpone = true;
            String aux = palabras[index];
            int fila = (int) (Math.random() * 20);//Genera numero entre 0 y 19
            int columna = (int) (Math.random() * (20 - aux.length())); //Genera numero entre 0 y 16 o 14, dependiendo la longitud

            //Compruebo que la posicion este vacia
            for (int k = 0; k < aux.length(); k++) {
                if (sopaDeLetras[fila][columna + k] != 0) {      //Con que haya una letra hace un break cambia el valor
                    superpone = false;                             //  de superpone para que pruebe de nuevo con
                    break;                                        // otra ubicacion                  
                }
            }

            //Si la posicion esta disponible escribe la palabra en la sopa y aumenta el index para pasar a siguiente palabra
            if (superpone) {
                for (int j = 0; j < aux.length(); j++) {
                    sopaDeLetras[fila][columna + j] = aux.charAt(j);
                }
                index++;
            }
        } while (index < palabras.length);

        //Rellenar la sopa con numeros
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == 0) {
                    int numeroAux = (int) (Math.random() * 10);
                    sopaDeLetras[i][j] = (char) (numeroAux + '0'); //Truco para pasar a char
                }
            }

        }
        
        //Mostrar Sopa
        
        for(char[] fila: sopaDeLetras){
            String aux=" ";
            for(char elemento: fila){
                aux+="  " + elemento;
            }System.out.println(aux);
        }

    }

}
