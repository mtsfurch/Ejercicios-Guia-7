
package ejerciciosguia1_extras;

import javax.swing.*;  //Bibilioteca que contiene ventana para igresar datos
public class EjercicioGuia1_Extras5 {


    public static void main(String[] args) {        
        String opc;
        do {
            opc = JOptionPane.showInputDialog("Ingrese letra correspondiente a obra social A,B o C");  //JOtionPane.showInputDialog crea ventana
        } while (!(opc.equalsIgnoreCase("a")||opc.equalsIgnoreCase("b")||opc.equalsIgnoreCase("c")));
        String saldo = JOptionPane.showInputDialog("Ingrese costo del tratamiento");
    double saldo1 = Double.parseDouble(saldo);
        switch (opc) {
        case "a":
            System.out.print("El valor total es de: ");
            System.out.printf("%1.2f",((0.5*saldo1)+saldo1));  //Expresion para mostrar solo dos decimales
            break;
        case "b":
            System.out.print("El valor total es de: ");
            System.out.printf("%1.2f",((0.35*saldo1)+saldo1));
            break;
        case "c":
            System.out.print("El valor total es de: "+saldo1);
            break;   
    }
    }   
}
