package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realiz� un programa que permita ingresar dos n�meros naturales. Debes mostrar los
resultados para las 4 operaciones matem�ticas b�sicas con los n�meros ingresados. [EC]
 */


public class Ej8
{
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro1;
		int nro2;
		
		System.out.println("Ingrese un numero");
		nro1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un numero");
		nro2 = Integer.parseInt(input.nextLine());
		
		final int SUMA = (nro1 + nro2);
		final int RESTA = (nro1 - nro2);
		final int MULTIPLICACION = (nro1 * nro2);
		final int DIVISION = (nro1 / nro2);
		
		System.out.println("La suma de " +nro1+ " + " +nro2+ " es: " +SUMA);
		System.out.println("La resta de " +nro1+ " - " +nro2+ " es: " +RESTA);
		System.out.println("La multiplicacion de " +nro1+ " * " +nro2+ " es: " +MULTIPLICACION);
		System.out.println("La division de " +nro1+ " / " +nro2+ " es: " +DIVISION);
		
	}

}