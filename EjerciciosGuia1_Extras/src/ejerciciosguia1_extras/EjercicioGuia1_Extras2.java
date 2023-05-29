/*
Declarar cuatro variables de tipo entero A, B, C y D y 
asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que:
B tome el valor de C,49 C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejerciciosguia1_extras;

import java.util.Scanner;

public class EjercicioGuia1_Extras2 {

    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       int A,B,C,D,aux;
       A=5;B=8;C=7;D=4;
       System.out.println("A= "+A +" B= "+ B +" C= "+ C +" D= " +D);
       aux=C;
       C=A;
       A=D;
       D=B;
       B=aux;
       System.out.println("A= "+A +" B= " +B +" C= "+ C +" D= "+ D);
    }
    
}
