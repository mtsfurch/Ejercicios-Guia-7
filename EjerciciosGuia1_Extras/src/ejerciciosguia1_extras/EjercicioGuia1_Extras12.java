/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X),
 * que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez 
 * que aparezca un 3 lo sustituya por una E.
 */
package ejerciciosguia1_extras;

public class EjercicioGuia1_Extras12 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String numero = convertirAEspecial(i) + "-" + convertirAEspecial(j) + "-" + convertirAEspecial(k);
                    System.out.println(numero);
                }
            }
        }
    }

    private static String convertirAEspecial(int num) {
        if (num == 3) {
            return "E";
        } else {
            return String.valueOf(num);
        }
    }
}
