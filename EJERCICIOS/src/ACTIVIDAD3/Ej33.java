package ACTIVIDAD3;

import java.util.Scanner;

/*
 * 33.Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0.
La computadora debe mostrar el número máximo y el número mínimo. [EC]
 */
public class Ej33 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int nro;
		int nroMax = Integer.MIN_VALUE;
		int nroMin = Integer.MAX_VALUE;

		do {
			System.out.println("Ingrese un numero distinto de cero.");
			nro = Integer.parseInt(input.nextLine());

			if (nro != 0) {
				if (nro > nroMax) {
					nroMax = nro;
				}
				if (nro < nroMin) {
					nroMin = nro;
				}
			}

		} while (nro != 0);

		if (nroMax > 0) {
			System.out.println("El numero maximo es: " + nroMax);
			System.out.println("El numero minimo es: " + nroMin);
		} else {
			System.out.println("Programa finalizado. El numero ingresado fue cero.");
		}

		input.close();
	}
}
