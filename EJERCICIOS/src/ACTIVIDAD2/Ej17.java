package ACTIVIDAD2;
import java.util.Scanner;

/*
* Realiz� un programa que permita ingresar una edad (entre 1 y 120 a�os) y un g�nero ('F') para mujeres, 'M' para hombres). 
* En caso de haber ingresado valores err�neos (edad fuera de rango o g�nero inv�lido), informar tal situaci�n y terminar el programa. 
* Si los datos est�n bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 68 a�os o m�s y los hombres con 65 a�os o m�s, si la persona est� en edad de jubilarse.
 */

public class Ej17 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
	int edad;
	char genero;
	
	System.out.println("Ingrese la edad (entre 1 y 120 a�os)");
	edad = Integer.parseInt(input.nextLine());
	
	System.out.println("Ingrese el genero ('F') para mujeres, 'M' para hombres)");
	genero = input.nextLine().charAt(0);
	
	if ((edad > 120 || edad < 1) || (genero != 'M' && genero != 'F')) {
		System.out.println("Datos invalidos.");
	} else if (genero == 'M' && edad >= 65) {
		System.out.println("Esta en edad de jubilarse.");
	} else if (genero == 'F' && edad >= 68) {
		System.out.println("Esta en edad de jubilarse.");
	}
		
	
		
		
		input.close();

	}

}
