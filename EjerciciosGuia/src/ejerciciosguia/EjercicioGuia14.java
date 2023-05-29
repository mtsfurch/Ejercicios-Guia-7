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
public class EjercicioGuia14 {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor en euros");
        double euro=read.nextDouble();
        String moneda;
        do {
            System.out.println("A que moneda desea convertit? (dolar,libra o yenes)");
            moneda=read.next();
        } while (!(moneda.equals("dolar")|| moneda.equals("libra") || moneda.equals("yenes")));
        cambio(euro,moneda);
    }
    public static void cambio(double x, String y){
        switch (y) {
            case "dolar":
                System.out.println("El cambio correspondiente de " + x + " euros es: " + 
                        (x*1.28611) + " dolares");
                break;
            case "yenes":
                System.out.println("El cambio correspondiente de " + x + " euros es: " + 
                        (x*129.852) + " yenes");
                break;
            case "libra":
                System.out.println("El cambio correspondiente de " + x + " euros es: " + 
                        (x*0.86) + " libras");
                break;
        }
    }
}
