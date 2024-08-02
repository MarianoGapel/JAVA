// VOLVER A HACER!!!!!!


package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 
26.Realiz� un programa que permita al usuario ingresar un n�mero natural n. La computadora
debe mostrar los primeros n m�ltiplos de 3 excepto aquellos que sean a la vez m�ltiplos de 5.
 */
public class Ej26 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
        int n; // El n�mero de m�ltiplos de 3 que queremos mostrar.
        int numero = 3; // El n�mero que estamos evaluando en busca de m�ltiplos de 3.
        int encontrados = 0; // El n�mero de m�ltiplos de 3 encontrados y mostrados.

        // Aseguramos que el n�mero ingresado sea natural (mayor o igual a 1).
        do {
            System.out.println("Ingrese un numero");
            n = Integer.parseInt(input.nextLine());
        } while (n < 1);

        // Buscamos y mostramos los "n" primeros m�ltiplos de 3 que no son m�ltiplos de 5.
        while (encontrados < n) {
            if (numero % 3 == 0 && numero % 5 != 0) {
                System.out.println(numero);
                encontrados++;
            }
            numero++;
        }

	}

}
