package ACTIVIDAD2;
import java.util.Scanner;

/*
 * 14. Para entrar a la monta�a rusa Infierno en las alturas se requiere tener al menos 7 a�os y medir m�s de 1,50 metros. 
 * Complet� el siguiente cuadro a mano seg�n los requisitos y luego escrib� el programa que permita, ejecut�ndolo cada vez para cada ni�o y seg�n las edades y
estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes datos:
Nombre Edad Altura �Entra al juego? (V/F)
Juan    5    1,45
Mar�a   7    1.23
Luis    8    1.51
Ana     9    1.39
 */

public class Ej14 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		final int EDAD_MINIMA = 7;
		final double ALTURA_MINIMA = 1.5;
		
		int edad;
		double altura;
		
		System.out.println("Ingrese edad");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese altura");
		altura = Double.parseDouble(input.nextLine());
		
		if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA) {
			System.out.println("Puede ingresar al juego");
		} else {
			System.out.println("No puede ingresar al juego");
		}
			

	}

}
