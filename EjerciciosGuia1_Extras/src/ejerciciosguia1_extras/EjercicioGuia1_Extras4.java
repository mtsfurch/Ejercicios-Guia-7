package ejerciciosguia1_extras;

import javax.swing.*;
public class EjercicioGuia1_Extras4 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Ingrese numero, por favor");
        int num= Integer.parseInt(aux);
        switch (num) {
            case 1:
                System.out.println("El equivalente en numero romano es I");
                break;
            case 2:
                System.out.println("El equivalente en numero romano es II");
                break;
            case 3:
                System.out.println("El equivalente en numero romano es III");
                break;
            case 4:
                System.out.println("El equivalente en numero romano es IV");
                break;
            case 5:
                System.out.println("El equivalente en numero romano es V");
                break;
            case 6:
                System.out.println("El equivalente en numero romano es VI");
                break;
            case 7:
                System.out.println("El equivalente en numero romano es VII");
                break;
            case 8:
                System.out.println("El equivalente en numero romano es VIII");
                break;
            case 9:
                System.out.println("El equivalente en numero romano es IX");
                break;
            case 10:
                System.out.println("El equivalente en numero romano es X");
                break;
            default:
                System.out.println("Numero incorrecto");
        }
    }
    
}
