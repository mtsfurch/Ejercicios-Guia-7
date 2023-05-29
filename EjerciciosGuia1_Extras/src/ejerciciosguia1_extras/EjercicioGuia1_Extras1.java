/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos,
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosguia1_extras;

import java.util.Scanner;

public class EjercicioGuia1_Extras1 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int dia,hora;
        dia=0;
        int minutos=read.nextInt();
        if(minutos>1440){
            dia=minutos/1440;
            hora=(minutos/60)-(dia*24);
        }else{
            hora=minutos/60;
        }
        System.out.println(dia + " dia, "+hora+" horas");
    }
    
}
