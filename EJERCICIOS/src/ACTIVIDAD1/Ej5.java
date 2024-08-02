package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.
 */


public class Ej5 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
	
		int num1;
		int num2;
		int aux;
		
		System.err.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.err.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("El primer numero ingresado es: " +num1);
		System.out.println("El segundo numero ingresado es: " +num2);
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("Con el orden invertido:");
		System.out.println("El primer numero ingresado es: " +num1);
		System.out.println("El segundo numero ingresado es: " +num2);
		
		
		input.close();
	}

}
