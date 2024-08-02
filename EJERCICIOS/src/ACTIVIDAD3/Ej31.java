package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 31.Realizá un programa que permita validar una opción ingresada. 
 * Se le preguntará al usuario si desea continuar con alguna operación de la forma "¿Deseás continuar? [S/N]". 
 * Se espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas). 
 * La opción debe ser ingresada tanto como sea necesario hasta que quede comprendida dentro de las posibilidades esperadas.
 *  Realizá este ejercicio en dos versiones (A y B): con ciclo while y con ciclo do-while.
 */
public class Ej31 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		char opcion;
		
		
		do {
			System.out.println("Ingrese una opcion: S/N");
			opcion = input.nextLine().charAt(0);
		} while (opcion != 's' && opcion !='S' && opcion != 'N' && opcion != 'n');

		System.out.println("--------------");
		
		System.out.println("Ingrese una opcion: S/N");
		opcion = input.nextLine().charAt(0);
		while (opcion != 's' && opcion !='S' && opcion != 'N' && opcion != 'n') {
			System.out.println("Ingrese una opcion: S/N");
			opcion = input.nextLine().charAt(0);
		}
	}

}
