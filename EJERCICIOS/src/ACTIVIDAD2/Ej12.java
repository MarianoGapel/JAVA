package ACTIVIDAD2;
import java.util.Scanner;
/*
 * 12. Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el mayor.
 */

public class Ej12 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		int nro1;
		int nro2;
		
		System.out.println("Ingrese nro1");
		nro1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese nro2");
		nro2 = Integer.parseInt(input.nextLine());
		
		if (nro1 > nro2) {
			System.out.println("El mayor es el numero: " +nro1);
		} else {
			System.out.println("El mayor es el numero: " +nro2);
		}
			
		
		
		
		
		input.close();
	}

}
