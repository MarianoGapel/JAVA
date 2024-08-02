package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 27.Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
las edades ingresadas y cuántas edades fueron valores impares mayores que 18.
 */
public class Ej27 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		final int EDADES_INGRESADAS = 5;
		int edad;
		double promedio;
		int edadesMayores18Impares = 0;
		int edadAcumulador = 0;
		
		for (int i = 1; i <= EDADES_INGRESADAS; i++) {
			System.out.println("Ingrese una edad");
			edad = Integer.parseInt(input.nextLine());
			edadAcumulador += edad;
			
			if (edad > 18 && edad % 2 != 0) {
				edadesMayores18Impares++;
			}
		}
		
		promedio = edadAcumulador / 5;
		System.out.println("El promedio de todas las edades es: "+promedio);
		System.out.println("La cantidad de edades mayores de 18 e impares es: "+edadesMayores18Impares);
	}

}
