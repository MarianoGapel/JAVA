package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.
 */


public class Ej2 {
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		final int NOTAS = 3;
		int nota1;
		int nota2;
		int nota3;
		double promedio;
		
		
		
		System.out.println("Ingrese la nota 1");
		nota1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la nota 2");
		nota2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la nota 3");
		nota3 = Integer.parseInt(input.nextLine());
		
		promedio = (double) (nota1 + nota2 + nota3) / NOTAS;

		System.out.println("El promedio de las 3 notas es: " +promedio);
	}

}
