package ACTIVIDAD1;
import java.util.Scanner;


/*
 * Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
ingresado:
	a. Multiplicado por 5.
	b. Dividido por 2.
 */
public class Ej3 {
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nro;
		
		System.out.println("Ingrese un numero");
		nro = Integer.parseInt(input.nextLine());
		
		final double DIV = 2;
		final int MULTI = 5;
		
		System.out.println("El numero ingresado: " +nro + " multiplicado por 5 es: " +(nro * MULTI));
		System.out.println("El numero ingresado: " +nro + " dividido por 2 es: " +(nro / DIV));

	}

}
