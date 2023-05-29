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
public class EjercicioGuia9 {
 public static void main (String[] args){
     Scanner read = new Scanner(System.in);
     System.out.println("Ingrese frase");
     String frase = read.nextLine();
     if (frase.charAt(0)=='A') {
         System.out.println("Correcto");
     }else System.out.println("Incorrecto");
     System.out.println(frase.startsWith("A"));
     //aux.equals(frase.substring(0, 1));
     /*if (frase.substring(0,1).equals("A")) {
         System.out.println("Correcto");
     }else System.out.println("Incorrecto");*/
     
 }   
}
