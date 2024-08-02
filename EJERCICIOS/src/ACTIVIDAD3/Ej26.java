// VOLVER A HACER!!!!!!


package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 
26.Realizá un programa que permita al usuario ingresar un número natural n. La computadora
debe mostrar los primeros n múltiplos de 3 excepto aquellos que sean a la vez múltiplos de 5.
 */
public class Ej26 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
        int n; // El número de múltiplos de 3 que queremos mostrar.
        int numero = 3; // El número que estamos evaluando en busca de múltiplos de 3.
        int encontrados = 0; // El número de múltiplos de 3 encontrados y mostrados.

        // Aseguramos que el número ingresado sea natural (mayor o igual a 1).
        do {
            System.out.println("Ingrese un numero");
            n = Integer.parseInt(input.nextLine());
        } while (n < 1);

        // Buscamos y mostramos los "n" primeros múltiplos de 3 que no son múltiplos de 5.
        while (encontrados < n) {
            if (numero % 3 == 0 && numero % 5 != 0) {
                System.out.println(numero);
                encontrados++;
            }
            numero++;
        }

	}

}
