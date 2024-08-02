package ACTIVIDAD3;
import java.util.Scanner;
/*
 * 30.Realizá un programa que permita realizar varias operaciones matemáticas ingresando un
caracter por cada una la operación a realizar ('+', '-', '*', '/', 'F',) y dos números enteros en el caso que no haya elegido 'F'. 
La computadora debe mostrar el resultado para la operación ingresada. 
Considerar que no se puede dividir por cero. 
Cuando la operación ingresada sea 'F' nos indicará que no se desean calcular más operaciones.
 */
public class Ej30 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int nro1;
		int nro2;
		char operacion;
		final char MULTI = '*';
		final char SUMA = '+';
		final char RESTA = '-';
		final char DIVISION = '/';

		do {
			System.out.println("Ingrese un caracter para la operacion (+, -, *, / o F)");
			operacion = input.nextLine().charAt(0);

			if (operacion == 'F') {
				System.out.println("No se desean calcular mas operaciones.");
			} else if (operacion != SUMA && operacion != RESTA && operacion != MULTI && operacion != DIVISION) {
				System.out.println("Operacion no valida intente de nuevo.");
			} else {
				System.out.println("Ingrese el primer numero");
				nro1 = Integer.parseInt(input.nextLine());

				System.out.println("Ingrese el primer numero");
				nro2 = Integer.parseInt(input.nextLine());

				switch (operacion) {
				case SUMA:
					System.out.println(nro1 + nro2);
					break;
				case RESTA:
					System.out.println(nro1 - nro2);
					break;
				case MULTI:
					System.out.println(nro1 * nro2);
					break;
				case DIVISION:
					if (nro2 != 0) {
						System.out.println(nro1 / nro2);
					} else {
						System.out.println("No se puede dividir por cero");
					}
					break;
				}
			}

		} while (operacion != 'F');

	}

}


