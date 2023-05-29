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
public class EjercicioGuia8 {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese frase");
        String frase = read.nextLine();
        if (frase.length()>8) {
            System.out.println("Incorrecto");
        }else System.out.println("Correcto");
    }
}
