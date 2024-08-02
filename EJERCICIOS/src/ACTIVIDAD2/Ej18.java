package ACTIVIDAD2;
import java.util.Scanner;
/*
 * Realizá un programa que permita al usuario ingresar dos números enteros. 
 * La computadora debe indicar si el mayor es divisible por el menor. 
 * (Un número entero a es divisible por un número entero b cuando el resto de la división entre a y b es 0.
 */

public class Ej18 {

	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro1;
		int nro2;
		int mayor;
		int menor; 
		
		System.out.println("Ingrese el nro1");
		nro1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el nro2");
		nro2 = Integer.parseInt(input.nextLine());
		
		if (nro1 > nro2) {
			mayor = nro1;
			menor = nro2;
		} else {
			mayor = nro2;
			menor = nro1;
		}
		
		
		if (mayor % menor == 0) {
			System.out.println("El numero: " +mayor+ " es divisible por " +menor);
		} else {
			System.out.println("El numero: " +mayor+ " no es divisible por " +menor);
		}
	}

}
