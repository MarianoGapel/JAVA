package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
metros de alambre para cercarlo completamente a tres alturas distintas.
 */


public class Ej7 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int ancho;
		int largo;
		int valorMetroCuadrado;
		
		
		System.out.println("Ingrese el ancho del terreno:");
		ancho = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el largo del terreno:");
		largo = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el valor del metro cuadrado del terreno:");
		valorMetroCuadrado = Integer.parseInt(input.nextLine());
		
		final int AREA = (ancho * largo);
		final int VALOR_TERRENO = (AREA * valorMetroCuadrado);
		final int PERIMETRO = 2 * (ancho + largo);
		final int CANTIDAD_ALAMBRE = PERIMETRO * 3;
		
		System.out.println("El valor total del terreno es: " +VALOR_TERRENO);
		System.out.println("La cantidad de metro de alambre para cercarlo a tres alturas es: "+CANTIDAD_ALAMBRE);
		
		
	}

}